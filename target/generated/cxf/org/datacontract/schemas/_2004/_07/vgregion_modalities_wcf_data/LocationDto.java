
package org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Vgregion.Modalities.Wcf.Data.Contract}EntityDto">
 *       &lt;sequence>
 *         &lt;element name="AeTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForeignRoomId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationalUnitId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationDto", propOrder = {
    "aeTitle",
    "description",
    "foreignRoomId",
    "latitude",
    "longitude",
    "name",
    "organizationalUnitId"
})
public class LocationDto
    extends EntityDto
{

    @XmlElementRef(name = "AeTitle", namespace = "http://schemas.datacontract.org/2004/07/Vgregion.Modalities.Wcf.Data.Contract", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aeTitle;
    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/Vgregion.Modalities.Wcf.Data.Contract", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "ForeignRoomId", namespace = "http://schemas.datacontract.org/2004/07/Vgregion.Modalities.Wcf.Data.Contract", type = JAXBElement.class, required = false)
    protected JAXBElement<String> foreignRoomId;
    @XmlElement(name = "Latitude")
    protected Double latitude;
    @XmlElement(name = "Longitude")
    protected Double longitude;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/Vgregion.Modalities.Wcf.Data.Contract", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "OrganizationalUnitId")
    protected String organizationalUnitId;

    /**
     * Gets the value of the aeTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAeTitle() {
        return aeTitle;
    }

    /**
     * Sets the value of the aeTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAeTitle(JAXBElement<String> value) {
        this.aeTitle = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the foreignRoomId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForeignRoomId() {
        return foreignRoomId;
    }

    /**
     * Sets the value of the foreignRoomId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForeignRoomId(JAXBElement<String> value) {
        this.foreignRoomId = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLatitude(Double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongitude(Double value) {
        this.longitude = value;
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

    /**
     * Gets the value of the organizationalUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationalUnitId() {
        return organizationalUnitId;
    }

    /**
     * Sets the value of the organizationalUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationalUnitId(String value) {
        this.organizationalUnitId = value;
    }

}
