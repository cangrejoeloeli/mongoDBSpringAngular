//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.08.21 a las 06:29:15 PM UTC 
//

package com.gsj.clienteunico.models.PersonaGSJ;

public class Actividad {

    protected String descripcionActividad;
    protected Long idActividad;
    protected Integer nomenclador;
    protected Integer orden;
    protected Integer periodo;

    public Actividad() {
    }

    public Actividad(com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.Actividad ac) {
        if (ac.isDescripcionActividadSpecified())
            this.descripcionActividad = ac.getDescripcionActividad();
        if (ac.isIdActividadSpecified())
            this.idActividad = ac.getIdActividad();
        if (ac.isNomencladorSpecified())
            this.nomenclador = ac.getNomenclador();
        if (ac.isOrdenSpecified())
            this.orden = ac.getOrden();
        if (ac.isPeriodoSpecified())
            this.periodo = ac.getPeriodo();
    }

    /**
     * Obtiene el valor de la propiedad descripcionActividad.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getDescripcionActividad() {
        return descripcionActividad;
    }

    /**
     * Define el valor de la propiedad descripcionActividad.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setDescripcionActividad(String value) {
        this.descripcionActividad = value;
    }

    /**
     * Obtiene el valor de la propiedad idActividad.
     * 
     * @return
     *         possible object is
     *         {@link Long }
     * 
     */
    public Long getIdActividad() {
        return idActividad;
    }

    /**
     * Define el valor de la propiedad idActividad.
     * 
     * @param value
     *              allowed object is
     *              {@link Long }
     * 
     */
    public void setIdActividad(Long value) {
        this.idActividad = value;
    }

    /**
     * Obtiene el valor de la propiedad nomenclador.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getNomenclador() {
        return nomenclador;
    }

    /**
     * Define el valor de la propiedad nomenclador.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setNomenclador(Integer value) {
        this.nomenclador = value;
    }

    /**
     * Obtiene el valor de la propiedad orden.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getOrden() {
        return orden;
    }

    /**
     * Define el valor de la propiedad orden.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setOrden(Integer value) {
        this.orden = value;
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
