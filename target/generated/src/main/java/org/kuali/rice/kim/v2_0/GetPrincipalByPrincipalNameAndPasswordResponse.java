
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPrincipalByPrincipalNameAndPasswordResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPrincipalByPrincipalNameAndPasswordResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rice.kuali.org/kim/v2_0}principal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPrincipalByPrincipalNameAndPasswordResponse", propOrder = {
    "principal"
})
public class GetPrincipalByPrincipalNameAndPasswordResponse {

    protected PrincipalType principal;

    /**
     * Gets the value of the principal property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalType }
     *     
     */
    public PrincipalType getPrincipal() {
        return principal;
    }

    /**
     * Sets the value of the principal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalType }
     *     
     */
    public void setPrincipal(PrincipalType value) {
        this.principal = value;
    }

}
