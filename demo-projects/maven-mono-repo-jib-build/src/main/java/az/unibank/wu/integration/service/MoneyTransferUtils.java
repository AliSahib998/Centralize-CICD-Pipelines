package az.unibank.wu.integration.service;

import az.unibank.wu.integration.configuration.ApplicationProperties;
import az.unibank.wu.integration.webservices.model.Channel;
import az.unibank.wu.integration.webservices.model.ChannelType;
import az.unibank.wu.integration.webservices.model.CountryCurrencyInfo;
import az.unibank.wu.integration.webservices.model.ForeignRemoteSystem;
import az.unibank.wu.integration.webservices.model.GwpGbsDevice;
import az.unibank.wu.integration.webservices.model.GwpGbsDeviceType;
import az.unibank.wu.integration.webservices.model.IsoCode;
import az.unibank.wu.integration.webservices.model.ObjectFactory;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

import javax.xml.bind.JAXBElement;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

public abstract class MoneyTransferUtils {

    protected static final String AZERBAIJAN_NAME = "AZERBAIJAN";
    protected static final String AZERBAIJAN_CODE = "AZ";
    protected final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
    protected final ObjectFactory factory = new ObjectFactory();

    protected final Channel channel;
    private final WebServiceTemplate webServiceTemplate;
    private final ApplicationProperties properties;

    public MoneyTransferUtils(WebServiceTemplate webServiceTemplate, ApplicationProperties properties) {
        this.webServiceTemplate = webServiceTemplate;
        this.properties = properties;
        channel = createChannel();
    }

    protected CountryCurrencyInfo createCurrencyInfo(String countryCode, String currency) {
        CountryCurrencyInfo countryCurrencyInfo = factory.createCountryCurrencyInfo();
        IsoCode isoCode = factory.createIsoCode();
        isoCode.setCountryCode(countryCode);
        isoCode.setCurrencyCode(currency);
        countryCurrencyInfo.setIsoCode(isoCode);
        return countryCurrencyInfo;
    }

    protected ForeignRemoteSystem createForeignRemoteSystem(String referenceCode, String counterId) {
        ForeignRemoteSystem remoteSystem = factory.createForeignRemoteSystem();
        remoteSystem.setIdentifier(properties.getIdentifier());
        remoteSystem.setReferenceNo(referenceCode);
        remoteSystem.setCounterId(counterId);
        return remoteSystem;
    }

    protected CountryCurrencyInfo createAzerbaijanCurrencyInfo() {
        CountryCurrencyInfo info = factory.createCountryCurrencyInfo();
        IsoCode isoCode = factory.createIsoCode();
        isoCode.setCountryCode("AZ");
        isoCode.setCurrencyCode("AZN");
        info.setIsoCode(isoCode);
        info.setCountryName(AZERBAIJAN_NAME);
        return info;
    }

    protected GwpGbsDevice createDevice(GwpGbsDeviceType deviceType) {
        GwpGbsDevice device = factory.createGwpGbsDevice();
        if (deviceType == GwpGbsDeviceType.MOBILE)
            device.setId("GM");
        device.setType(deviceType);
        return device;
    }

    protected <T> T sendAndReceive(Object request, String requestPrefix, String url, Class<T> responseType) {
        JAXBElement<?> jaxbElement = (JAXBElement<?>) webServiceTemplate.marshalSendAndReceive(request,
                message -> {
                    SaajSoapMessage saajSoapMessage = (SaajSoapMessage) message;
                    saajSoapMessage.setSoapAction("");
                    changeSoapBodyPrefix(saajSoapMessage.getSaajMessage(), requestPrefix, url);
                }
        );
        return responseType.cast(jaxbElement.getValue());
    }

    private void changeSoapBodyPrefix(SOAPMessage soapMessage, String requestedObjectPrefix, String url) {
        try {
            SOAPBody soapBody = soapMessage.getSOAPBody();
            Iterator<SOAPBodyElement> childElements = soapBody.getChildElements();
            while (childElements.hasNext()) {
                SOAPBodyElement bodyElement = childElements.next();
                bodyElement.removeNamespaceDeclaration("ns3");
                bodyElement.setPrefix(requestedObjectPrefix);
                if (url != null && !url.isEmpty())
                    bodyElement.addNamespaceDeclaration(requestedObjectPrefix, url);
                soapMessage.saveChanges();
            }
        } catch (SOAPException e) {
            e.printStackTrace();
        }
    }

    private Channel createChannel() {
        final Channel channel;
        channel = factory.createChannel();
        channel.setName("Unibank");
        channel.setType(ChannelType.H_2_H);
        channel.setVersion("9500");
        return channel;
    }
}
