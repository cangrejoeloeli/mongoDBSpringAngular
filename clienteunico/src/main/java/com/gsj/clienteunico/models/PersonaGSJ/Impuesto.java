//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.08.21 a las 06:29:15 PM UTC 
//

package com.gsj.clienteunico.models.PersonaGSJ;

public class Impuesto {

    protected String descripcionImpuesto;
    protected Integer idImpuesto;
    protected Integer periodo;

    public Impuesto() {
    }

    public Impuesto(com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.Impuesto i) {
        if (i.isPeriodoSpecified())
            this.descripcionImpuesto = i.getDescripcionImpuesto();
        if (i.isIdImpuestoSpecified())
            this.idImpuesto = i.getIdImpuesto();
        if (i.isPeriodoSpecified())
            this.periodo = i.getPeriodo();
    }

    /**
     * Obtiene el valor de la propiedad descripcionImpuesto.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getDescripcionImpuesto() {
        return descripcionImpuesto;
    }

    /**
     * Define el valor de la propiedad descripcionImpuesto.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setDescripcionImpuesto(String value) {
        this.descripcionImpuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad idImpuesto.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getIdImpuesto() {
        return idImpuesto;
    }

    /**
     * Define el valor de la propiedad idImpuesto.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setIdImpuesto(Integer value) {
        this.idImpuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad periodo.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getPeriodo() {
        return periodo;
    }

    /**
     * Define el valor de la propiedad periodo.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setPeriodo(Integer value) {
        this.periodo = value;
    }

}
