
package au.net.electronichealth.ns.trr.tls.v2010;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoveErrorCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RemoveErrorCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="unknownResponse"/>
 *     &lt;enumeration value="unknownOrganisation"/>
 *     &lt;enumeration value="hasNotBeenRetrieved"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RemoveErrorCodeType")
@XmlEnum
public enum RemoveErrorCodeType {

    @XmlEnumValue("unknownResponse")
    UNKNOWN_RESPONSE("unknownResponse"),
    @XmlEnumValue("unknownOrganisation")
    UNKNOWN_ORGANISATION("unknownOrganisation"),
    @XmlEnumValue("hasNotBeenRetrieved")
    HAS_NOT_BEEN_RETRIEVED("hasNotBeenRetrieved");
    private final String value;

    RemoveErrorCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RemoveErrorCodeType fromValue(String v) {
        for (RemoveErrorCodeType c: RemoveErrorCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
