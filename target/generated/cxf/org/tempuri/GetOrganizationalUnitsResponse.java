
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.ArrayOfOrganizationalUnitDto;


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
 *         &lt;element name="GetOrganizationalUnitsResult" type="{http://schemas.datacontract.org/2004/07/Vgregion.Modalities.Wcf.Data.Contract}ArrayOfOrganizationalUnitDto" minOccurs="0"/>
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
    "getOrganizationalUnitsResult"
})
@XmlRootElement(name = "GetOrganizationalUnitsResponse")
public class GetOrganizationalUnitsResponse {

    @XmlElementRef(name = "GetOrganizationalUnitsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrganizationalUnitDto> getOrganizationalUnitsResult;

    /**
     * Gets the value of the getOrganizationalUnitsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrganizationalUnitDto }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrganizationalUnitDto> getGetOrganizationalUnitsResult() {
        return getOrganizationalUnitsResult;
    }

    /**
     * Sets the value of the getOrganizationalUnitsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrganizationalUnitDto }{@code >}
     *     
     */
    public void setGetOrganizationalUnitsResult(JAXBElement<ArrayOfOrganizationalUnitDto> value) {
        this.getOrganizationalUnitsResult = value;
    }

}
