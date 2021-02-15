
package au.net.electronichealth.ns.trr.tls.v2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoveResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseId" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="status" type="{http://ns.electronichealth.net.au/smd/svc/TransportResponseRetrieval/2010}RemoveStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveResultType", propOrder = {
    "responseId",
    "status"
})
public class RemoveResultType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String responseId;
    @XmlElement(required = true)
    protected RemoveStatusType status;

    /**
     * Gets the value of the responseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseId() {
        return responseId;
    }

    /**
     * Sets the value of the responseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseId(String value) {
        this.responseId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link RemoveStatusType }
     *     
     */
    public RemoveStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoveStatusType }
     *     
     */
    public void setStatus(RemoveStatusType value) {
        this.status = value;
    }

}
