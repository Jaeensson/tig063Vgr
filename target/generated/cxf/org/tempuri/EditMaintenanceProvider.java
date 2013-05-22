
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.MaintenanceProviderDto;


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
 *         &lt;element name="maintenanceProviderDto" type="{http://schemas.datacontract.org/2004/07/Vgregion.Modalities.Wcf.Data.Contract}MaintenanceProviderDto" minOccurs="0"/>
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
    "maintenanceProviderDto"
})
@XmlRootElement(name = "EditMaintenanceProvider")
public class EditMaintenanceProvider {

    @XmlElementRef(name = "maintenanceProviderDto", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<MaintenanceProviderDto> maintenanceProviderDto;

    /**
     * Gets the value of the maintenanceProviderDto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MaintenanceProviderDto }{@code >}
     *     
     */
    public JAXBElement<MaintenanceProviderDto> getMaintenanceProviderDto() {
        return maintenanceProviderDto;
    }

    /**
     * Sets the value of the maintenanceProviderDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MaintenanceProviderDto }{@code >}
     *     
     */
    public void setMaintenanceProviderDto(JAXBElement<MaintenanceProviderDto> value) {
        this.maintenanceProviderDto = value;
    }

}
