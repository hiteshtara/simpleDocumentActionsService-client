
package org.kuali.rice.core.v2_0;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * <p>Java class for GreaterThanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GreaterThanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rice.kuali.org/core/v2_0}abstractPredicate"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}stringValue"/&gt;
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}propertyPathValue"/&gt;
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}decimalValue"/&gt;
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}kualiDecimalValue"/&gt;
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}kualiPercentValue"/&gt;
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}kualiIntegerValue"/&gt;
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}integerValue"/&gt;
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}dateTimeValue"/&gt;
 *         &lt;/choice&gt;
 *         &lt;any processContents='skip' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="propertyPath" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GreaterThanType", propOrder = {
    "stringValue",
    "propertyPathValue",
    "decimalValue",
    "kualiDecimalValue",
    "kualiPercentValue",
    "kualiIntegerValue",
    "integerValue",
    "dateTimeValue",
    "any"
})
public class GreaterThanType
    extends AbstractPredicate
{

    protected String stringValue;
    protected CriteriaPropertyPathValueType propertyPathValue;
    protected BigDecimal decimalValue;
    protected BigDecimal kualiDecimalValue;
    protected BigDecimal kualiPercentValue;
    protected BigInteger kualiIntegerValue;
    protected BigInteger integerValue;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeValue;
    @XmlAnyElement
    protected List<Element> any;
    @XmlAttribute(name = "propertyPath")
    protected String propertyPath;

    /**
     * Gets the value of the stringValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * Sets the value of the stringValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringValue(String value) {
        this.stringValue = value;
    }

    /**
     * Gets the value of the propertyPathValue property.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaPropertyPathValueType }
     *     
     */
    public CriteriaPropertyPathValueType getPropertyPathValue() {
        return propertyPathValue;
    }

    /**
     * Sets the value of the propertyPathValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaPropertyPathValueType }
     *     
     */
    public void setPropertyPathValue(CriteriaPropertyPathValueType value) {
        this.propertyPathValue = value;
    }

    /**
     * Gets the value of the decimalValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecimalValue() {
        return decimalValue;
    }

    /**
     * Sets the value of the decimalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecimalValue(BigDecimal value) {
        this.decimalValue = value;
    }

    /**
     * Gets the value of the kualiDecimalValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKualiDecimalValue() {
        return kualiDecimalValue;
    }

    /**
     * Sets the value of the kualiDecimalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKualiDecimalValue(BigDecimal value) {
        this.kualiDecimalValue = value;
    }

    /**
     * Gets the value of the kualiPercentValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKualiPercentValue() {
        return kualiPercentValue;
    }

    /**
     * Sets the value of the kualiPercentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKualiPercentValue(BigDecimal value) {
        this.kualiPercentValue = value;
    }

    /**
     * Gets the value of the kualiIntegerValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKualiIntegerValue() {
        return kualiIntegerValue;
    }

    /**
     * Sets the value of the kualiIntegerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKualiIntegerValue(BigInteger value) {
        this.kualiIntegerValue = value;
    }

    /**
     * Gets the value of the integerValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntegerValue() {
        return integerValue;
    }

    /**
     * Sets the value of the integerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntegerValue(BigInteger value) {
        this.integerValue = value;
    }

    /**
     * Gets the value of the dateTimeValue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeValue() {
        return dateTimeValue;
    }

    /**
     * Sets the value of the dateTimeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeValue(XMLGregorianCalendar value) {
        this.dateTimeValue = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }

    /**
     * Gets the value of the propertyPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyPath() {
        return propertyPath;
    }

    /**
     * Sets the value of the propertyPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyPath(String value) {
        this.propertyPath = value;
    }

}
