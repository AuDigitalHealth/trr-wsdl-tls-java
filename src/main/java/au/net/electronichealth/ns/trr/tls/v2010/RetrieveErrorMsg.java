
package au.net.electronichealth.ns.trr.tls.v2010;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.3-b01-
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "retrieveError", targetNamespace = "http://ns.electronichealth.net.au/smd/svc/TransportResponseRetrieval/2010")
public class RetrieveErrorMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private RetrieveErrorType faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public RetrieveErrorMsg(String message, RetrieveErrorType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public RetrieveErrorMsg(String message, RetrieveErrorType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: au.net.electronichealth.ns.trr.tls.v2010.RetrieveErrorType
     */
    public RetrieveErrorType getFaultInfo() {
        return faultInfo;
    }

}
