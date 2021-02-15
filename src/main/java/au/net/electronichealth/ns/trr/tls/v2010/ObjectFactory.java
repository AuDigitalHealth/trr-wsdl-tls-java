
package au.net.electronichealth.ns.trr.tls.v2010;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.trr.tls.v2010 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RetrieveError_QNAME = new QName("http://ns.electronichealth.net.au/smd/svc/TransportResponseRetrieval/2010", "retrieveError");
    private final static QName _RemoveError_QNAME = new QName("http://ns.electronichealth.net.au/smd/svc/TransportResponseRetrieval/2010", "removeError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.trr.tls.v2010
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetrieveErrorType }
     * 
     */
    public RetrieveErrorType createRetrieveErrorType() {
        return new RetrieveErrorType();
    }

    /**
     * Create an instance of {@link Remove }
     * 
     */
    public Remove createRemove() {
        return new Remove();
    }

    /**
     * Create an instance of {@link RemoveErrorType }
     * 
     */
    public RemoveErrorType createRemoveErrorType() {
        return new RemoveErrorType();
    }

    /**
     * Create an instance of {@link Retrieve }
     * 
     */
    public Retrieve createRetrieve() {
        return new Retrieve();
    }

    /**
     * Create an instance of {@link RemoveResponse }
     * 
     */
    public RemoveResponse createRemoveResponse() {
        return new RemoveResponse();
    }

    /**
     * Create an instance of {@link RemoveResultType }
     * 
     */
    public RemoveResultType createRemoveResultType() {
        return new RemoveResultType();
    }

    /**
     * Create an instance of {@link RetrieveResponse }
     * 
     */
    public RetrieveResponse createRetrieveResponse() {
        return new RetrieveResponse();
    }

    /**
     * Create an instance of {@link TransportResponseListType }
     * 
     */
    public TransportResponseListType createTransportResponseListType() {
        return new TransportResponseListType();
    }

    /**
     * Create an instance of {@link TransportResponseKey }
     * 
     */
    public TransportResponseKey createTransportResponseKey() {
        return new TransportResponseKey();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/smd/svc/TransportResponseRetrieval/2010", name = "retrieveError")
    public JAXBElement<RetrieveErrorType> createRetrieveError(RetrieveErrorType value) {
        return new JAXBElement<RetrieveErrorType>(_RetrieveError_QNAME, RetrieveErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/smd/svc/TransportResponseRetrieval/2010", name = "removeError")
    public JAXBElement<RemoveErrorType> createRemoveError(RemoveErrorType value) {
        return new JAXBElement<RemoveErrorType>(_RemoveError_QNAME, RemoveErrorType.class, null, value);
    }

}
