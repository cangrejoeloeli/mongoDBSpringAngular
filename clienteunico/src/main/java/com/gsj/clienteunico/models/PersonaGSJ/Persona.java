//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.08.21 a las 06:29:15 PM UTC 
//

package com.gsj.clienteunico.models.PersonaGSJ;

import org.springframework.data.annotation.Id;

public class Persona {

    protected DatosGenerales datosGenerales;
    protected DatosMonotributo datosMonotributo;
    protected DatosRegimenGeneral datosRegimenGeneral;
    protected ErrorConstancia errorConstancia;
    protected ErrorMonotributo errorMonotributo;
    protected ErrorRegimenGeneral errorRegimenGeneral;

    private String mensaje;

    public Persona() {
    };

    public Persona(
            com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.PersonaReturn p,
            Long id) {

        if (p.isDatosGeneralesSpecified())
            this.datosGenerales = new DatosGenerales(p.getDatosGenerales());
        if (p.isDatosMonotributoSpecified())
            this.datosMonotributo = new DatosMonotributo(p.getDatosMonotributo());
        if (p.isDatosRegimenGeneralSpecified())
            this.datosRegimenGeneral = new DatosRegimenGeneral(p.getDatosRegimenGeneral());
        if (p.isErrorConstanciaSpecified())
            this.errorConstancia = new ErrorConstancia(p.getErrorConstancia());
        if (p.isErrorMonotributoSpecified())
            this.errorMonotributo = new ErrorMonotributo(p.getErrorMonotributo());
        if (p.isErrorRegimenGeneralSpecified())
            this.errorRegimenGeneral = new ErrorRegimenGeneral(p.getErrorRegimenGeneral());
        this.id = id;
    }

    @Id
    private Long id;

    /**
     * Obtiene el valor de la propiedad datosGenerales.
     * 
     * @return
     *         possible object is
     *         {@link DatosGenerales }
     * 
     */
    public DatosGenerales getDatosGenerales() {
        return datosGenerales;
    }

    /**
     * Define el valor de la propiedad datosGenerales.
     * 
     * @param value
     *              allowed object is
     *              {@link DatosGenerales }
     * 
     */
    public void setDatosGenerales(DatosGenerales value) {
        this.datosGenerales = value;
    }

    /**
     * Obtiene el valor de la propiedad datosMonotributo.
     * 
     * @return
     *         possible object is
     *         {@link DatosMonotributo }
     * 
     */
    public DatosMonotributo getDatosMonotributo() {
        return datosMonotributo;
    }

    /**
     * Define el valor de la propiedad datosMonotributo.
     * 
     * @param value
     *              allowed object is
     *              {@link DatosMonotributo }
     * 
     */
    public void setDatosMonotributo(DatosMonotributo value) {
        this.datosMonotributo = value;
    }

    /**
     * Obtiene el valor de la propiedad datosRegimenGeneral.
     * 
     * @return
     *         possible object is
     *         {@link DatosRegimenGeneral }
     * 
     */
    public DatosRegimenGeneral getDatosRegimenGeneral() {
        return datosRegimenGeneral;
    }

    /**
     * Define el valor de la propiedad datosRegimenGeneral.
     * 
     * @param value
     *              allowed object is
     *              {@link DatosRegimenGeneral }
     * 
     */
    public void setDatosRegimenGeneral(DatosRegimenGeneral value) {
        this.datosRegimenGeneral = value;
    }

    /**
     * Obtiene el valor de la propiedad errorConstancia.
     * 
     * @return
     *         possible object is
     *         {@link ErrorConstancia }
     * 
     */
    public ErrorConstancia getErrorConstancia() {
        return errorConstancia;
    }

    /**
     * Define el valor de la propiedad errorConstancia.
     * 
     * @param value
     *              allowed object is
     *              {@link ErrorConstancia }
     * 
     */
    public void setErrorConstancia(ErrorConstancia value) {
        this.errorConstancia = value;
    }

    /**
     * Obtiene el valor de la propiedad errorMonotributo.
     * 
     * @return
     *         possible object is
     *         {@link ErrorMonotributo }
     * 
     */
    public ErrorMonotributo getErrorMonotributo() {
        return errorMonotributo;
    }

    /**
     * Define el valor de la propiedad errorMonotributo.
     * 
     * @param value
     *              allowed object is
     *              {@link ErrorMonotributo }
     * 
     */
    public void setErrorMonotributo(ErrorMonotributo value) {
        this.errorMonotributo = value;
    }

    /**
     * Obtiene el valor de la propiedad errorRegimenGeneral.
     * 
     * @return
     *         possible object is
     *         {@link ErrorRegimenGeneral }
     * 
     */
    public ErrorRegimenGeneral getErrorRegimenGeneral() {
        return errorRegimenGeneral;
    }

    /**
     * Define el valor de la propiedad errorRegimenGeneral.
     * 
     * @param value
     *              allowed object is
     *              {@link ErrorRegimenGeneral }
     * 
     */
    public void setErrorRegimenGeneral(ErrorRegimenGeneral value) {
        this.errorRegimenGeneral = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
