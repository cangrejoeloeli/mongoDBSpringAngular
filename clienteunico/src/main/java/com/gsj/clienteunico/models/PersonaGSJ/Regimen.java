//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.08.21 a las 06:29:15 PM UTC 
//

package com.gsj.clienteunico.models.PersonaGSJ;

public class Regimen {

    protected String descripcionRegimen;
    protected Integer idImpuesto;
    protected Integer idRegimen;
    protected Integer periodo;
    protected String tipoRegimen;

    public Regimen() {
    }

    public Regimen(com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.Regimen r) {
        if (r.isDescripcionRegimenSpecified())
            this.descripcionRegimen = r.getDescripcionRegimen();
        if (r.isIdImpuestoSpecified())
            this.idImpuesto = r.getIdImpuesto();
        if (r.isIdRegimenSpecified())
            this.idRegimen = r.getIdRegimen();
        if (r.isPeriodoSpecified())
            this.periodo = r.getPeriodo();
        if (r.isTipoRegimenSpecified())
            this.tipoRegimen = r.getTipoRegimen();
    }

    /**
     * Obtiene el valor de la propiedad descripcionRegimen.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getDescripcionRegimen() {
        return descripcionRegimen;
    }

    /**
     * Define el valor de la propiedad descripcionRegimen.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setDescripcionRegimen(String value) {
        this.descripcionRegimen = value;
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
     * Obtiene el valor de la propiedad idRegimen.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getIdRegimen() {
        return idRegimen;
    }

    /**
     * Define el valor de la propiedad idRegimen.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setIdRegimen(Integer value) {
        this.idRegimen = value;
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

    /**
     * Obtiene el valor de la propiedad tipoRegimen.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getTipoRegimen() {
        return tipoRegimen;
    }

    /**
     * Define el valor de la propiedad tipoRegimen.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setTipoRegimen(String value) {
        this.tipoRegimen = value;
    }

}
