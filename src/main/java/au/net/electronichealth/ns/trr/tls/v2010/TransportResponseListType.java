
package au.net.electronichealth.ns.trr.tls.v2010;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.smd.xsd.transportresponse._2010.TransportResponseType;


/**
 * <p>Java class for TransportResponseListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportResponseListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalNumberAvailable" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="response" type="{http://ns.electronichealth.net.au/smd/xsd/TransportResponse/2010}TransportResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportResponseListType", propOrder = {
    "totalNumberAvailable",
    "response"
})
public class TransportResponseListType {

    protected int totalNumberAvailable;
    protected List<TransportResponseType> response;

    /**
     * Gets the value of the totalNumberAvailable property.
     * 
     */
    public int getTotalNumberAvailable() {
        return totalNumberAvailable;
    }

    /**
     * Sets the value of the totalNumberAvailable property.
     * 
     */
    public void setTotalNumberAvailable(int value) {
        this.totalNumberAvailable = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the response property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportResponseType }
     * 
     * 
     */
    public List<TransportResponseType> getResponse() {
        if (response == null) {
            response = new ArrayList<TransportResponseType>();
        }
        return this.response;
    }

}
