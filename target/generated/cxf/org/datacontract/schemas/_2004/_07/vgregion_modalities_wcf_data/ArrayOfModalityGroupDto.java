
package org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfModalityGroupDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfModalityGroupDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ModalityGroupDto" type="{http://schemas.datacontract.org/2004/07/Vgregion.Modalities.Wcf.Data.Contract}ModalityGroupDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfModalityGroupDto", propOrder = {
    "modalityGroupDto"
})
public class ArrayOfModalityGroupDto {

    @XmlElement(name = "ModalityGroupDto", nillable = true)
    protected List<ModalityGroupDto> modalityGroupDto;

    /**
     * Gets the value of the modalityGroupDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modalityGroupDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModalityGroupDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModalityGroupDto }
     * 
     * 
     */
    public List<ModalityGroupDto> getModalityGroupDto() {
        if (modalityGroupDto == null) {
            modalityGroupDto = new ArrayList<ModalityGroupDto>();
        }
        return this.modalityGroupDto;
    }

}
