package com.example.tig063vgr_f;

import org.tempuri.IModalityService;
import org.tempuri.ModalityService;

/**
 * Service singleton.
 * 
 * @author Johan S�ll Larsson
 */
public class ModalityServiceAgent {

	/**
	 * Thread safe instance.
	 */
	static ModalityServiceAgent instance;

	/**
	 * Read lock to prevent re-initialization.
	 */
	static final Object readLock = new Object();

	/**
	 * The invoice service.
	 */
	IModalityService modalityService;

	/**
	 * Default constructor.
	 */
	ModalityServiceAgent() {
		ModalityService service = new ModalityService();
		HeaderHandlerResolver handlerResolver = new HeaderHandlerResolver();
		service.setHandlerResolver(handlerResolver);
		modalityService = service.getBasicHttpBindingIModalityService();
	}

	/**
	 * Returns the thread safe instance.
	 * 
	 * @return
	 */
	public static ModalityServiceAgent getInstance() {
		if (instance == null) {
			synchronized (readLock) {
				if (instance == null) {
					instance = new ModalityServiceAgent();
				}
			}
		}
		return instance;
	}

	/**
	 * Returns the service.
	 * 
	 * @return
	 */
	public IModalityService getService() {
		return modalityService;
	}

}
