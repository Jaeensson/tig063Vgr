
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.ArrayOfModalityGroupDto;


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
 *         &lt;element name="GetModalityGroupsResult" type="{http://schemas.datacontract.org/2004/07/Vgregion.Modalities.Wcf.Data.Contract}ArrayOfModalityGroupDto" minOccurs="0"/>
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
    "getModalityGroupsResult"
})
@XmlRootElement(name = "GetModalityGroupsResponse")
public class GetModalityGroupsResponse {

    @XmlElementRef(name = "GetModalityGroupsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfModalityGroupDto> getModalityGroupsResult;

    /**
     * Gets the value of the getModalityGroupsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfModalityGroupDto }{@code >}
     *     
     */
    public JAXBElement<ArrayOfModalityGroupDto> getGetModalityGroupsResult() {
        return getModalityGroupsResult;
    }

    /**
     * Sets the value of the getModalityGroupsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfModalityGroupDto }{@code >}
     *     
     */
    public void setGetModalityGroupsResult(JAXBElement<ArrayOfModalityGroupDto> value) {
        this.getModalityGroupsResult = value;
    }

}
