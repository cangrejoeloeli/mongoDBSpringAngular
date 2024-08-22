//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.08.21 a las 06:29:15 PM UTC 
//

package com.gsj.clienteunico.models.PersonaGSJ;

public class Categoria {

    protected String descripcionCategoria;
    protected Integer idCategoria;
    protected Integer idImpuesto;
    protected Integer periodo;

    public Categoria() {
    }

    public Categoria(com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.Categoria ca) {
        if (ca.isDescripcionCategoriaSpecified())
            this.descripcionCategoria = ca.getDescripcionCategoria();
        if (ca.isIdCategoriaSpecified())
            this.idCategoria = ca.getIdCategoria();
        if (ca.isIdImpuestoSpecified())
            this.idImpuesto = ca.getIdImpuesto();
        if (ca.isPeriodoSpecified())
            this.periodo = ca.getPeriodo();
    }

    /**
     * Obtiene el valor de la propiedad descripcionCategoria.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    /**
     * Define el valor de la propiedad descripcionCategoria.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setDescripcionCategoria(String value) {
        this.descripcionCategoria = value;
    }

    /**
     * Obtiene el valor de la propiedad idCategoria.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getIdCategoria() {
        return idCategoria;
    }

    /**
     * Define el valor de la propiedad idCategoria.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setIdCategoria(Integer value) {
        this.idCategoria = value;
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
