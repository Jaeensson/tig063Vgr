package com.example.tig063vgr_f;

import java.util.ArrayList;
import java.util.List;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

/**
 * Handler resolver.
 * 
 * @author Johan S�ll Larsson
 */
public class HeaderHandlerResolver implements HandlerResolver {

	@Override
	@SuppressWarnings("rawtypes")
	public List<Handler> getHandlerChain(PortInfo arg0) {
		List<Handler> handlerChain = new ArrayList<Handler>();
		HeaderHandler headerHandler = new HeaderHandler();
		handlerChain.add(headerHandler);
		return handlerChain;
	}

}
