//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.08.21 a las 06:29:15 PM UTC 
//

package com.gsj.clienteunico.models.PersonaGSJ;

public class Caracterizacion {

    protected String descripcionCaracterizacion;
    protected Integer idCaracterizacion;
    protected Integer periodo;

    public Caracterizacion() {
    }

    /**
     * Desde afip
     * 
     * @param cr
     */
    public Caracterizacion(com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.Caracterizacion cr) {
        if (cr.isDescripcionCaracterizacionSpecified())
            this.descripcionCaracterizacion = cr.getDescripcionCaracterizacion();
        if (cr.isIdCaracterizacionSpecified())
            this.idCaracterizacion = cr.getIdCaracterizacion();
        if (cr.isPeriodoSpecified())
            this.periodo = cr.getPeriodo();
    }

    /**
     * Obtiene el valor de la propiedad descripcionCaracterizacion.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getDescripcionCaracterizacion() {
        return descripcionCaracterizacion;
    }

    /**
     * Define el valor de la propiedad descripcionCaracterizacion.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setDescripcionCaracterizacion(String value) {
        this.descripcionCaracterizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idCaracterizacion.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getIdCaracterizacion() {
        return idCaracterizacion;
    }

    /**
     * Define el valor de la propiedad idCaracterizacion.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setIdCaracterizacion(Integer value) {
        this.idCaracterizacion = value;
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
