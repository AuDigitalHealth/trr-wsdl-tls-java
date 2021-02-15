
package au.net.electronichealth.ns.trr.tls.v2010;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoveStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RemoveStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ok"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RemoveStatusType")
@XmlEnum
public enum RemoveStatusType {

    @XmlEnumValue("ok")
    OK("ok");
    private final String value;

    RemoveStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RemoveStatusType fromValue(String v) {
        for (RemoveStatusType c: RemoveStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
