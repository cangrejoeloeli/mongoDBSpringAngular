//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.08.21 a las 06:29:15 PM UTC 
//

package com.gsj.clienteunico.models.PersonaGSJ;

public class Domicilio {

    protected String codPostal;
    protected String datoAdicional;
    protected String descripcionProvincia;
    protected String direccion;
    protected Integer idProvincia;
    protected String localidad;
    protected String tipoDatoAdicional;
    protected String tipoDomicilio;

    public Domicilio() {
    }

    /**
     * Construye desde datos de afip
     * 
     * @param dom
     */
    public Domicilio(com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.Domicilio dom) {
        if (dom.isCodPostalSpecified())
            this.codPostal = dom.getCodPostal();
        if (dom.isDatoAdicionalSpecified())
            this.datoAdicional = dom.getDatoAdicional();
        if (dom.isDescripcionProvinciaSpecified())
            this.descripcionProvincia = dom.getDescripcionProvincia();
        if (dom.isDireccionSpecified())
            this.direccion = dom.getDireccion();
        if (dom.isIdProvinciaSpecified())
            this.idProvincia = dom.getIdProvincia();
        if (dom.isLocalidadSpecified())
            this.localidad = dom.getLocalidad();
        if (dom.isDatoAdicionalSpecified())
            this.tipoDatoAdicional = dom.getTipoDatoAdicional();
        if (dom.isTipoDomicilioSpecified())
            this.tipoDomicilio = dom.getTipoDomicilio();
    }

    /**
     * Obtiene el valor de la propiedad codPostal.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getCodPostal() {
        return codPostal;
    }

    /**
     * Define el valor de la propiedad codPostal.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setCodPostal(String value) {
        this.codPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad datoAdicional.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getDatoAdicional() {
        return datoAdicional;
    }

    /**
     * Define el valor de la propiedad datoAdicional.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setDatoAdicional(String value) {
        this.datoAdicional = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionProvincia.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getDescripcionProvincia() {
        return descripcionProvincia;
    }

    /**
     * Define el valor de la propiedad descripcionProvincia.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setDescripcionProvincia(String value) {
        this.descripcionProvincia = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad idProvincia.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getIdProvincia() {
        return idProvincia;
    }

    /**
     * Define el valor de la propiedad idProvincia.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setIdProvincia(Integer value) {
        this.idProvincia = value;
    }

    /**
     * Obtiene el valor de la propiedad localidad.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * Define el valor de la propiedad localidad.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setLocalidad(String value) {
        this.localidad = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDatoAdicional.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getTipoDatoAdicional() {
        return tipoDatoAdicional;
    }

    /**
     * Define el valor de la propiedad tipoDatoAdicional.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setTipoDatoAdicional(String value) {
        this.tipoDatoAdicional = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDomicilio.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getTipoDomicilio() {
        return tipoDomicilio;
    }

    /**
     * Define el valor de la propiedad tipoDomicilio.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setTipoDomicilio(String value) {
        this.tipoDomicilio = value;
    }

}
