
package au.net.electronichealth.ns.trr.tls.v2010;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.3-b01-
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TransportResponseRetrievalService", targetNamespace = "http://ns.electronichealth.net.au/smd/svc/TransportResponseRetrieval/2010", wsdlLocation = "smd-TransportResponseRetrieval-TLS-2010.wsdl")
public class TransportResponseRetrievalService
    extends Service
{

    private final static URL TRANSPORTRESPONSERETRIEVALSERVICE_WSDL_LOCATION;
    private final static WebServiceException TRANSPORTRESPONSERETRIEVALSERVICE_EXCEPTION;
    private final static QName TRANSPORTRESPONSERETRIEVALSERVICE_QNAME = new QName("http://ns.electronichealth.net.au/smd/svc/TransportResponseRetrieval/2010", "TransportResponseRetrievalService");

    static {
        TRANSPORTRESPONSERETRIEVALSERVICE_WSDL_LOCATION = au.net.electronichealth.ns.trr.tls.v2010.TransportResponseRetrievalService.class.getResource("smd-TransportResponseRetrieval-TLS-2010.wsdl");
        WebServiceException e = null;
        if (TRANSPORTRESPONSERETRIEVALSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'smd-TransportResponseRetrieval-TLS-2010.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        TRANSPORTRESPONSERETRIEVALSERVICE_EXCEPTION = e;
    }

    public TransportResponseRetrievalService() {
        super(__getWsdlLocation(), TRANSPORTRESPONSERETRIEVALSERVICE_QNAME);
    }

    public TransportResponseRetrievalService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRANSPORTRESPONSERETRIEVALSERVICE_QNAME, features);
    }

    public TransportResponseRetrievalService(URL wsdlLocation) {
        super(wsdlLocation, TRANSPORTRESPONSERETRIEVALSERVICE_QNAME);
    }

    public TransportResponseRetrievalService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRANSPORTRESPONSERETRIEVALSERVICE_QNAME, features);
    }

    public TransportResponseRetrievalService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TransportResponseRetrievalService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TransportResponseRetrieval
     */
    @WebEndpoint(name = "TransportResponseRetrieval")
    public TransportResponseRetrieval getTransportResponseRetrieval() {
        return super.getPort(new QName("http://ns.electronichealth.net.au/smd/svc/TransportResponseRetrieval/2010", "TransportResponseRetrieval"), TransportResponseRetrieval.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TransportResponseRetrieval
     */
    @WebEndpoint(name = "TransportResponseRetrieval")
    public TransportResponseRetrieval getTransportResponseRetrieval(WebServiceFeature... features) {
        return super.getPort(new QName("http://ns.electronichealth.net.au/smd/svc/TransportResponseRetrieval/2010", "TransportResponseRetrieval"), TransportResponseRetrieval.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRANSPORTRESPONSERETRIEVALSERVICE_EXCEPTION!= null) {
            throw TRANSPORTRESPONSERETRIEVALSERVICE_EXCEPTION;
        }
        return TRANSPORTRESPONSERETRIEVALSERVICE_WSDL_LOCATION;
    }

}
