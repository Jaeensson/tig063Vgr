
package org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModalityDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModalityDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Vgregion.Modalities.Wcf.Data.Contract}EntityDto">
 *       &lt;sequence>
 *         &lt;element name="DicomCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModalityGroupId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModalityDto", propOrder = {
    "dicomCode",
    "modalityGroupId",
    "name"
})
public class ModalityDto
    extends EntityDto
{

    @XmlElementRef(name = "DicomCode", namespace = "http://schemas.datacontract.org/2004/07/Vgregion.Modalities.Wcf.Data.Contract", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dicomCode;
    @XmlElement(name = "ModalityGroupId")
    protected String modalityGroupId;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/Vgregion.Modalities.Wcf.Data.Contract", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;

    /**
     * Gets the value of the dicomCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDicomCode() {
        return dicomCode;
    }

    /**
     * Sets the value of the dicomCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDicomCode(JAXBElement<String> value) {
        this.dicomCode = value;
    }

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

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

}
