
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.TimelineDto;


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
 *         &lt;element name="GetTimelineResult" type="{http://schemas.datacontract.org/2004/07/Vgregion.Modalities.Wcf.Data.Contract}TimelineDto" minOccurs="0"/>
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
    "getTimelineResult"
})
@XmlRootElement(name = "GetTimelineResponse")
public class GetTimelineResponse {

    @XmlElementRef(name = "GetTimelineResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<TimelineDto> getTimelineResult;

    /**
     * Gets the value of the getTimelineResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimelineDto }{@code >}
     *     
     */
    public JAXBElement<TimelineDto> getGetTimelineResult() {
        return getTimelineResult;
    }

    /**
     * Sets the value of the getTimelineResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimelineDto }{@code >}
     *     
     */
    public void setGetTimelineResult(JAXBElement<TimelineDto> value) {
        this.getTimelineResult = value;
    }

}
