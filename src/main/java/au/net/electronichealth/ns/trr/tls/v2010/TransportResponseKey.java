
package au.net.electronichealth.ns.trr.tls.v2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportResponseKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportResponseKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceOrganisation" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportResponseKey", propOrder = {
    "responseId",
    "sourceOrganisation"
})
public class TransportResponseKey {

    @XmlElement(required = true)
    protected String responseId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String sourceOrganisation;

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
     * Gets the value of the sourceOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOrganisation() {
        return sourceOrganisation;
    }

    /**
     * Sets the value of the sourceOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOrganisation(String value) {
        this.sourceOrganisation = value;
    }

}
