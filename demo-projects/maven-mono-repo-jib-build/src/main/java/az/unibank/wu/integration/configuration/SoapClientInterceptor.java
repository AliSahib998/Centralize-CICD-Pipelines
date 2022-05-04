package az.unibank.wu.integration.configuration;

import az.unibank.wu.integration.web.rest.errors.InvalidPromocodeException;
import az.unibank.wu.integration.web.rest.errors.WesternUnionResponseFaultException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

@Slf4j
public class SoapClientInterceptor implements ClientInterceptor {

    private static final String SOAPENV_PREFIX = "soapenv";

    @Override
    public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
        SaajSoapMessage saajSoapMessage = (SaajSoapMessage) messageContext.getRequest();
        SOAPMessage soapMessage = saajSoapMessage.getSaajMessage();

        SOAPPart soapPart = soapMessage.getSOAPPart();
        try {
            SOAPEnvelope envelope = soapPart.getEnvelope();

            envelope.removeNamespaceDeclaration(envelope.getPrefix());
            envelope.addNamespaceDeclaration("xrsi", "http://www.westernunion.com/schema/xrsi");
            envelope.setPrefix(SOAPENV_PREFIX);

            SOAPHeader header = soapMessage.getSOAPHeader();
            header.setPrefix(SOAPENV_PREFIX);

            SOAPBody body = soapMessage.getSOAPBody();
            body.setPrefix(SOAPENV_PREFIX);
            soapMessage.saveChanges();
        } catch (SOAPException e) {
            e.printStackTrace();
            throw new WesternUnionResponseFaultException(e.getMessage(), "UNKNOWN");
        }
        return true;
    }

    @Override
    public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
        return true;
    }

    @Override
    public boolean handleFault(MessageContext messageContext) throws WebServiceClientException {
        log.info("intercepted a fault.");
        SOAPPart soapPart = getSoapPart(messageContext);
        try {
            SOAPFault soapFault = getSoapFaultFromSoapPart(soapPart);
            String responseBody = "No Response body from soap";
            if (soapFault.getDetail() != null && soapFault.getDetail().getFirstChild() != null) {
                responseBody = soapFault.getDetail().getFirstChild().getTextContent();
                if (responseBody.startsWith("T0440") || responseBody.startsWith("T3006")) {
                    throw new InvalidPromocodeException();
                }
            }
            throw new WesternUnionResponseFaultException(responseBody, soapFault.getFaultString());
        } catch (SOAPException e) {
            e.printStackTrace();
            throw new WesternUnionResponseFaultException(e.getMessage(), "UNKNOWN");
        }
    }

    private SOAPPart getSoapPart(MessageContext messageContext) {
        SaajSoapMessage saajSoapMessage = (SaajSoapMessage) messageContext.getResponse();
        SOAPMessage soapMessage = saajSoapMessage.getSaajMessage();
        return soapMessage.getSOAPPart();
    }

    private SOAPFault getSoapFaultFromSoapPart(SOAPPart soapPart) throws SOAPException {
        SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
        SOAPBody soapBody = soapEnvelope.getBody();
        return soapBody.getFault();
    }

    @Override
    public void afterCompletion(MessageContext messageContext, Exception e) throws WebServiceClientException {

    }

}
