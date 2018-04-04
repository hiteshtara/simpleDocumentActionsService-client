
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPrivacyPreferencesForPrincipalIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPrivacyPreferencesForPrincipalIdResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rice.kuali.org/kim/v2_0}entityPrivacyPreferences" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPrivacyPreferencesForPrincipalIdResponse", propOrder = {
    "entityPrivacyPreferences"
})
public class GetPrivacyPreferencesForPrincipalIdResponse {

    protected EntityPrivacyPreferencesType entityPrivacyPreferences;

    /**
     * Gets the value of the entityPrivacyPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link EntityPrivacyPreferencesType }
     *     
     */
    public EntityPrivacyPreferencesType getEntityPrivacyPreferences() {
        return entityPrivacyPreferences;
    }

    /**
     * Sets the value of the entityPrivacyPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityPrivacyPreferencesType }
     *     
     */
    public void setEntityPrivacyPreferences(EntityPrivacyPreferencesType value) {
        this.entityPrivacyPreferences = value;
    }

}
