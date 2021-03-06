
package au.net.electronichealth.ns.trr.tls.v2010;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.3-b01-
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "removeError", targetNamespace = "http://ns.electronichealth.net.au/smd/svc/TransportResponseRetrieval/2010")
public class RemoveErrorMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private RemoveErrorType faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public RemoveErrorMsg(String message, RemoveErrorType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public RemoveErrorMsg(String message, RemoveErrorType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: au.net.electronichealth.ns.trr.tls.v2010.RemoveErrorType
     */
    public RemoveErrorType getFaultInfo() {
        return faultInfo;
    }

}
