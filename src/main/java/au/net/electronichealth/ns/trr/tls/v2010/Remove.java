
package au.net.electronichealth.ns.trr.tls.v2010;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="force" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="organisation" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="responseId" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "force",
    "organisation",
    "responseId"
})
@XmlRootElement(name = "remove")
public class Remove {

    protected boolean force;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String organisation;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> responseId;

    /**
     * Gets the value of the force property.
     * 
     */
    public boolean isForce() {
        return force;
    }

    /**
     * Sets the value of the force property.
     * 
     */
    public void setForce(boolean value) {
        this.force = value;
    }

    /**
     * Gets the value of the organisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisation() {
        return organisation;
    }

    /**
     * Sets the value of the organisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisation(String value) {
        this.organisation = value;
    }

    /**
     * Gets the value of the responseId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResponseId() {
        if (responseId == null) {
            responseId = new ArrayList<String>();
        }
        return this.responseId;
    }

}
