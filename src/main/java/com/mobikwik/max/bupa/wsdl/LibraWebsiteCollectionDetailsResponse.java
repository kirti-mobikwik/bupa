//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.09 at 11:44:06 AM IST 
//


package com.mobikwik.max.bupa.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Libra_WebsiteCollectionDetailsResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "libraWebsiteCollectionDetailsResult"
})
@XmlRootElement(name = "Libra_WebsiteCollectionDetailsResponse")
public class LibraWebsiteCollectionDetailsResponse {

    @XmlElement(name = "Libra_WebsiteCollectionDetailsResult")
    protected String libraWebsiteCollectionDetailsResult;

    /**
     * Gets the value of the libraWebsiteCollectionDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraWebsiteCollectionDetailsResult() {
        return libraWebsiteCollectionDetailsResult;
    }

    /**
     * Sets the value of the libraWebsiteCollectionDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraWebsiteCollectionDetailsResult(String value) {
        this.libraWebsiteCollectionDetailsResult = value;
    }

}