//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.08.21 a las 06:29:15 PM UTC 
//

package com.gsj.clienteunico.models.PersonaGSJ;

import java.util.Date;

public class Relacion {

    protected String apellidoPersonaAsociada;
    protected Date ffRelacion;
    protected Date ffVencimiento;
    protected Long idPersonaAsociada;
    protected String nombrePersonaAsociada;
    protected String razonSocialPersonaAsociada;
    protected String tipoComponente;

    public Relacion() {
    }

    public Relacion(com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.Relacion r) {

        if (r.isApellidoPersonaAsociadaSpecified())
            this.apellidoPersonaAsociada = r.getApellidoPersonaAsociada();
        if (r.isFfRelacionSpecified())
            this.ffRelacion = r.getFfRelacion().getTime();

        if (r.isFfVencimientoSpecified())
            this.ffVencimiento = r.getFfVencimiento().getTime();
        if (r.isIdPersonaAsociadaSpecified())
            this.idPersonaAsociada = r.getIdPersonaAsociada();
        if (r.isNombrePersonaAsociadaSpecified())
            this.nombrePersonaAsociada = r.getNombrePersonaAsociada();
        if (r.isRazonSocialPersonaAsociadaSpecified())
            this.razonSocialPersonaAsociada = r.getRazonSocialPersonaAsociada();
        if (r.isTipoComponenteSpecified())
            this.tipoComponente = r.getTipoComponente();
    }

    /**
     * Obtiene el valor de la propiedad apellidoPersonaAsociada.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getApellidoPersonaAsociada() {
        return apellidoPersonaAsociada;
    }

    /**
     * Define el valor de la propiedad apellidoPersonaAsociada.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setApellidoPersonaAsociada(String value) {
        this.apellidoPersonaAsociada = value;
    }

    /**
     * Obtiene el valor de la propiedad ffRelacion.
     * 
     * @return
     *         possible object is
     *         {@link Date }
     * 
     */
    public Date getFfRelacion() {
        return ffRelacion;
    }

    /**
     * Define el valor de la propiedad ffRelacion.
     * 
     * @param value
     *              allowed object is
     *              {@link Date }
     * 
     */
    public void setFfRelacion(Date value) {
        this.ffRelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad ffVencimiento.
     * 
     * @return
     *         possible object is
     *         {@link Date }
     * 
     */
    public Date getFfVencimiento() {
        return ffVencimiento;
    }

    /**
     * Define el valor de la propiedad ffVencimiento.
     * 
     * @param value
     *              allowed object is
     *              {@link Date }
     * 
     */
    public void setFfVencimiento(Date value) {
        this.ffVencimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad idPersonaAsociada.
     * 
     * @return
     *         possible object is
     *         {@link Long }
     * 
     */
    public Long getIdPersonaAsociada() {
        return idPersonaAsociada;
    }

    /**
     * Define el valor de la propiedad idPersonaAsociada.
     * 
     * @param value
     *              allowed object is
     *              {@link Long }
     * 
     */
    public void setIdPersonaAsociada(Long value) {
        this.idPersonaAsociada = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePersonaAsociada.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getNombrePersonaAsociada() {
        return nombrePersonaAsociada;
    }

    /**
     * Define el valor de la propiedad nombrePersonaAsociada.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setNombrePersonaAsociada(String value) {
        this.nombrePersonaAsociada = value;
    }

    /**
     * Obtiene el valor de la propiedad razonSocialPersonaAsociada.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getRazonSocialPersonaAsociada() {
        return razonSocialPersonaAsociada;
    }

    /**
     * Define el valor de la propiedad razonSocialPersonaAsociada.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setRazonSocialPersonaAsociada(String value) {
        this.razonSocialPersonaAsociada = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoComponente.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getTipoComponente() {
        return tipoComponente;
    }

    /**
     * Define el valor de la propiedad tipoComponente.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setTipoComponente(String value) {
        this.tipoComponente = value;
    }

}
