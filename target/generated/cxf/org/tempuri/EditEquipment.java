
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.EquipmentDto;


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
 *         &lt;element name="equipmentDto" type="{http://schemas.datacontract.org/2004/07/Vgregion.Modalities.Wcf.Data.Contract}EquipmentDto" minOccurs="0"/>
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
    "equipmentDto"
})
@XmlRootElement(name = "EditEquipment")
public class EditEquipment {

    @XmlElementRef(name = "equipmentDto", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<EquipmentDto> equipmentDto;

    /**
     * Gets the value of the equipmentDto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EquipmentDto }{@code >}
     *     
     */
    public JAXBElement<EquipmentDto> getEquipmentDto() {
        return equipmentDto;
    }

    /**
     * Sets the value of the equipmentDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EquipmentDto }{@code >}
     *     
     */
    public void setEquipmentDto(JAXBElement<EquipmentDto> value) {
        this.equipmentDto = value;
    }

}
