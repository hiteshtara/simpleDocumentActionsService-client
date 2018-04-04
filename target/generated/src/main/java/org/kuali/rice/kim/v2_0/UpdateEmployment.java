
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateEmployment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateEmployment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="employment" type="{http://rice.kuali.org/kim/v2_0}EntityEmploymentType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateEmployment", propOrder = {
    "employment"
})
public class UpdateEmployment {

    protected EntityEmploymentType employment;

    /**
     * Gets the value of the employment property.
     * 
     * @return
     *     possible object is
     *     {@link EntityEmploymentType }
     *     
     */
    public EntityEmploymentType getEmployment() {
        return employment;
    }

    /**
     * Sets the value of the employment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityEmploymentType }
     *     
     */
    public void setEmployment(EntityEmploymentType value) {
        this.employment = value;
    }

}
