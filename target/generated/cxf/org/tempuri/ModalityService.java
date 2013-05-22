package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.4
 * 2013-05-22T19:31:30.730+02:00
 * Generated source version: 2.7.4
 * 
 */
@WebServiceClient(name = "ModalityService", 
                  wsdlLocation = "http://157.180.240.51:92/ModalityService.svc?singleWsdl",
                  targetNamespace = "http://tempuri.org/") 
public class ModalityService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "ModalityService");
    public final static QName BasicHttpBindingIModalityService = new QName("http://tempuri.org/", "BasicHttpBinding_IModalityService");
    static {
        URL url = null;
        try {
            url = new URL("http://157.180.240.51:92/ModalityService.svc?singleWsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ModalityService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://157.180.240.51:92/ModalityService.svc?singleWsdl");
        }
        WSDL_LOCATION = url;
    }

    public ModalityService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ModalityService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ModalityService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ModalityService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ModalityService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ModalityService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns IModalityService
     */
    @WebEndpoint(name = "BasicHttpBinding_IModalityService")
    public IModalityService getBasicHttpBindingIModalityService() {
        return super.getPort(BasicHttpBindingIModalityService, IModalityService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IModalityService
     */
    @WebEndpoint(name = "BasicHttpBinding_IModalityService")
    public IModalityService getBasicHttpBindingIModalityService(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingIModalityService, IModalityService.class, features);
    }

}
