package com.example.tig063vgr_f;

import java.util.Set;

import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
/**
 * SOAP Header handler.
 * @author Johan S�ll Larsson
 */
@SuppressWarnings("unchecked")
public class HeaderHandler implements SOAPHandler<SOAPMessageContext> {

	/**
	 * The authToken element
	 */
	private final String ELEMENT = "authToken"; 
	
	/**
	 * The authToken namespace.
	 */
	private final String NS = "Vgregion.Security.AuthToken";
	
	/**
	 * The security token (profile).
	 */
	private final String TOKEN = "1421BC7C-5981-497A-A4A0-A18600098E06";
	
	@Override
	public boolean handleMessage(SOAPMessageContext smc) {
        Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (outboundProperty.booleanValue()) {
            try {
                SOAPEnvelope envelope = smc.getMessage().getSOAPPart().getEnvelope();
                SOAPElement security = envelope.addHeader().addChildElement(ELEMENT, "vsa", NS);
                security.addTextNode(TOKEN);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } 
        return outboundProperty;
    }

	@Override
	@SuppressWarnings("rawtypes")
    public Set getHeaders() {
        return null;
    }

	@Override
    public boolean handleFault(SOAPMessageContext context) {
        return true;
    }

	@Override
    public void close(MessageContext context) {

    }
}
