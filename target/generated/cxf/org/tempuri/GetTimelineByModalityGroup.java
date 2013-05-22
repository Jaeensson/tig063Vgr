
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="modalityGroupId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
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
    "modalityGroupId"
})
@XmlRootElement(name = "GetTimelineByModalityGroup")
public class GetTimelineByModalityGroup {

    protected String modalityGroupId;

    /**
     * Gets the value of the modalityGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModalityGroupId() {
        return modalityGroupId;
    }

    /**
     * Sets the value of the modalityGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModalityGroupId(String value) {
        this.modalityGroupId = value;
    }

}
