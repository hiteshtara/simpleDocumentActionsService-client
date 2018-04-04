
package org.kuali.rice.core.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for abstractPredicate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="abstractPredicate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractPredicate")
@XmlSeeAlso({
    EqualType.class,
    EqualIgnoreCaseType.class,
    ExistsSubQueryType.class,
    GreaterThanType.class,
    GreaterThanOrEqualType.class,
    InType.class,
    InIgnoreCaseType.class,
    LessThanType.class,
    LessThanOrEqualType.class,
    LikeType.class,
    LikeIgnoreCaseType.class,
    NotEqualType.class,
    NotEqualIgnoreCaseType.class,
    NotInType.class,
    NotInIgnoreCaseType.class,
    NotLikeType.class,
    NotLikeIgnoreCaseType.class,
    NotNullType.class,
    NullType.class,
    CompositePredicateType.class
})
public abstract class AbstractPredicate {


}
