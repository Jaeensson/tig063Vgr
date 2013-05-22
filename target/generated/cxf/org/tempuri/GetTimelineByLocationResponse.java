
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.ArrayOfTimelineDto;


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
 *         &lt;element name="GetTimelineByLocationResult" type="{http://schemas.datacontract.org/2004/07/Vgregion.Modalities.Wcf.Data.Contract}ArrayOfTimelineDto" minOccurs="0"/>
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
    "getTimelineByLocationResult"
})
@XmlRootElement(name = "GetTimelineByLocationResponse")
public class GetTimelineByLocationResponse {

    @XmlElementRef(name = "GetTimelineByLocationResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTimelineDto> getTimelineByLocationResult;

    /**
     * Gets the value of the getTimelineByLocationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTimelineDto }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTimelineDto> getGetTimelineByLocationResult() {
        return getTimelineByLocationResult;
    }

    /**
     * Sets the value of the getTimelineByLocationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTimelineDto }{@code >}
     *     
     */
    public void setGetTimelineByLocationResult(JAXBElement<ArrayOfTimelineDto> value) {
        this.getTimelineByLocationResult = value;
    }

}
