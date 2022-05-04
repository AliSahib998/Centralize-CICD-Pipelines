package az.unibank.wu.integration.configuration;

import lombok.RequiredArgsConstructor;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.ssl.PrivateKeyDetails;
import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.SoapVersion;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;
import org.springframework.ws.transport.WebServiceMessageSender;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Map;

@Configuration
@RequiredArgsConstructor
public class SoapConfiguration {

    private final ApplicationProperties properties;

    @Bean
    @ConfigurationProperties(prefix = "client.ssl")
    public WuTrustStore wuTrustStore() {
        return new WuTrustStore();
    }

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("az.unibank.wu.integration.webservices.model");
        return marshaller;
    }

    @Bean("springWebServiceTemplate")
    public WebServiceTemplate webServiceTemplate() throws Exception {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(marshaller());
        webServiceTemplate.setUnmarshaller(marshaller());
        webServiceTemplate.setDefaultUri(properties.getWuUrl());
        webServiceTemplate.setCheckConnectionForFault(true);
        ClientInterceptor[] interceptors = new ClientInterceptor[]{interceptor()};
        webServiceTemplate.setInterceptors(interceptors);
        webServiceTemplate.setMessageFactory(messageFactory());
        webServiceTemplate.setMessageSender(webServiceMessageSender(wuTrustStore()));
        return webServiceTemplate;
    }

    @Bean
    public SoapClientInterceptor interceptor() {
        return new SoapClientInterceptor();
    }

    @Bean
    public SaajSoapMessageFactory messageFactory() {
        SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory();
        messageFactory.setSoapVersion(SoapVersion.SOAP_11);
        return messageFactory;
    }

    @Bean
    public WebServiceMessageSender webServiceMessageSender(WuTrustStore wuTrustStore) throws Exception {
        HttpComponentsMessageSender httpComponentsMessageSender = new HttpComponentsMessageSender();
        // timeout for creating a connection
        httpComponentsMessageSender.setConnectionTimeout(3000);
        // when you have a connection, timeout the read blocks for
        httpComponentsMessageSender.setReadTimeout(3000);

        httpComponentsMessageSender.setHttpClient(httpClient(wuTrustStore));

        return httpComponentsMessageSender;
    }

    private HttpClient httpClient(WuTrustStore wuTrustStore) throws Exception {
        return HttpClientBuilder.create().setSSLSocketFactory(sslConnectionSocketFactory(wuTrustStore))
                .addInterceptorFirst(new HttpComponentsMessageSender.RemoveSoapHeadersInterceptor()).build();
    }

    private SSLConnectionSocketFactory sslConnectionSocketFactory(WuTrustStore wuTrustStore) throws Exception {
        // NoopHostnameVerifier essentially turns hostname verification off as otherwise following error
        // is thrown: java.security.cert.CertificateException: No name matching localhost found
        return new SSLConnectionSocketFactory(sslContext(wuTrustStore), NoopHostnameVerifier.INSTANCE);
    }

    private SSLContext sslContext(WuTrustStore wuTrustStore)
            throws KeyStoreException, CertificateException, NoSuchAlgorithmException, IOException,
            UnrecoverableKeyException, KeyManagementException {
        KeyStore clientStore = KeyStore.getInstance("PKCS12");
        InputStream stream = getClass().getResourceAsStream("/" + wuTrustStore.getTrustStore());
        clientStore.load(stream, wuTrustStore.getTrustStorePassword().toCharArray());
        stream.close();
        return SSLContextBuilder.create()
                .loadKeyMaterial(clientStore, wuTrustStore.getTrustStorePassword().toCharArray(),
                        (Map<String, PrivateKeyDetails> aliases, Socket socket) -> wuTrustStore.getTrustStoreAlias())
                .loadTrustMaterial(clientStore, (chain, authType) -> true)
                .build();
    }

}
