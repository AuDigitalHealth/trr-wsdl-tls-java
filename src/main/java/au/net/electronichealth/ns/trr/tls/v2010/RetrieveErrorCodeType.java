
package au.net.electronichealth.ns.trr.tls.v2010;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveErrorCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RetrieveErrorCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="unknownOrganisation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RetrieveErrorCodeType")
@XmlEnum
public enum RetrieveErrorCodeType {

    @XmlEnumValue("unknownOrganisation")
    UNKNOWN_ORGANISATION("unknownOrganisation");
    private final String value;

    RetrieveErrorCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RetrieveErrorCodeType fromValue(String v) {
        for (RetrieveErrorCodeType c: RetrieveErrorCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
