//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.08.21 a las 06:29:15 PM UTC 
//

package com.gsj.clienteunico.models.PersonaGSJ;

public class Dependencia {

    protected String codPostal;
    protected String descripcionDependencia;
    protected String descripcionProvincia;
    protected String direccion;
    protected Integer idDependencia;
    protected Integer idProvincia;
    protected String localidad;

    public Dependencia() {
    }

    /**
     * Para construir desde datos de afip directamente
     * 
     * @param dep
     */
    public Dependencia(com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.Dependencia dep) {
        this.codPostal = dep.getCodPostal();
        this.descripcionDependencia = dep.getDescripcionDependencia();
        this.descripcionProvincia = dep.getDescripcionProvincia();
        this.direccion = dep.getDireccion();
        this.idDependencia = dep.getIdDependencia();
        this.idProvincia = dep.getIdProvincia();
        this.localidad = dep.getLocalidad();
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
     * Obtiene el valor de la propiedad descripcionDependencia.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getDescripcionDependencia() {
        return descripcionDependencia;
    }

    /**
     * Define el valor de la propiedad descripcionDependencia.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setDescripcionDependencia(String value) {
        this.descripcionDependencia = value;
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
     * Obtiene el valor de la propiedad idDependencia.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getIdDependencia() {
        return idDependencia;
    }

    /**
     * Define el valor de la propiedad idDependencia.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setIdDependencia(Integer value) {
        this.idDependencia = value;
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

}
