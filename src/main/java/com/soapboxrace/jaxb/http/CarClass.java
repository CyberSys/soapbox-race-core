//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.04.20 às 09:47:17 PM AMT 
//


package com.soapboxrace.jaxb.http;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CarClass complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CarClass">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarClassHash" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaxRating" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="MinRating" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarClass", propOrder = {
    "carClassHash",
    "maxRating",
    "minRating"
})
public class CarClass {

    @XmlElement(name = "CarClassHash")
    protected int carClassHash;
    @XmlElement(name = "MaxRating")
    protected short maxRating;
    @XmlElement(name = "MinRating")
    protected short minRating;

    /**
     * Obtém o valor da propriedade carClassHash.
     * 
     */
    public int getCarClassHash() {
        return carClassHash;
    }

    /**
     * Define o valor da propriedade carClassHash.
     * 
     */
    public void setCarClassHash(int value) {
        this.carClassHash = value;
    }

    /**
     * Obtém o valor da propriedade maxRating.
     * 
     */
    public short getMaxRating() {
        return maxRating;
    }

    /**
     * Define o valor da propriedade maxRating.
     * 
     */
    public void setMaxRating(short value) {
        this.maxRating = value;
    }

    /**
     * Obtém o valor da propriedade minRating.
     * 
     */
    public short getMinRating() {
        return minRating;
    }

    /**
     * Define o valor da propriedade minRating.
     * 
     */
    public void setMinRating(short value) {
        this.minRating = value;
    }

}