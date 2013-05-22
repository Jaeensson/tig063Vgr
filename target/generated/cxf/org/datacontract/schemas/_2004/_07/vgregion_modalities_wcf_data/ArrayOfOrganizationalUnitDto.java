
package org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOrganizationalUnitDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrganizationalUnitDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganizationalUnitDto" type="{http://schemas.datacontract.org/2004/07/Vgregion.Modalities.Wcf.Data.Contract}OrganizationalUnitDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrganizationalUnitDto", propOrder = {
    "organizationalUnitDto"
})
public class ArrayOfOrganizationalUnitDto {

    @XmlElement(name = "OrganizationalUnitDto", nillable = true)
    protected List<OrganizationalUnitDto> organizationalUnitDto;

    /**
     * Gets the value of the organizationalUnitDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationalUnitDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationalUnitDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationalUnitDto }
     * 
     * 
     */
    public List<OrganizationalUnitDto> getOrganizationalUnitDto() {
        if (organizationalUnitDto == null) {
            organizationalUnitDto = new ArrayList<OrganizationalUnitDto>();
        }
        return this.organizationalUnitDto;
    }

}
