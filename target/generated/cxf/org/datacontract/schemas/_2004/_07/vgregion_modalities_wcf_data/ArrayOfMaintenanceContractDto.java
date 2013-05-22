
package org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMaintenanceContractDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMaintenanceContractDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaintenanceContractDto" type="{http://schemas.datacontract.org/2004/07/Vgregion.Modalities.Wcf.Data.Contract}MaintenanceContractDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMaintenanceContractDto", propOrder = {
    "maintenanceContractDto"
})
public class ArrayOfMaintenanceContractDto {

    @XmlElement(name = "MaintenanceContractDto", nillable = true)
    protected List<MaintenanceContractDto> maintenanceContractDto;

    /**
     * Gets the value of the maintenanceContractDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maintenanceContractDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaintenanceContractDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenanceContractDto }
     * 
     * 
     */
    public List<MaintenanceContractDto> getMaintenanceContractDto() {
        if (maintenanceContractDto == null) {
            maintenanceContractDto = new ArrayList<MaintenanceContractDto>();
        }
        return this.maintenanceContractDto;
    }

}
