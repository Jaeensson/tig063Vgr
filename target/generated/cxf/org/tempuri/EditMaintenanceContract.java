
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.MaintenanceContractDto;


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
 *         &lt;element name="maintenanceContractDto" type="{http://schemas.datacontract.org/2004/07/Vgregion.Modalities.Wcf.Data.Contract}MaintenanceContractDto" minOccurs="0"/>
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
    "maintenanceContractDto"
})
@XmlRootElement(name = "EditMaintenanceContract")
public class EditMaintenanceContract {

    @XmlElementRef(name = "maintenanceContractDto", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<MaintenanceContractDto> maintenanceContractDto;

    /**
     * Gets the value of the maintenanceContractDto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MaintenanceContractDto }{@code >}
     *     
     */
    public JAXBElement<MaintenanceContractDto> getMaintenanceContractDto() {
        return maintenanceContractDto;
    }

    /**
     * Sets the value of the maintenanceContractDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MaintenanceContractDto }{@code >}
     *     
     */
    public void setMaintenanceContractDto(JAXBElement<MaintenanceContractDto> value) {
        this.maintenanceContractDto = value;
    }

}
