//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.08.21 a las 06:29:15 PM UTC 
//

package com.gsj.clienteunico.models.PersonaGSJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class DatosGenerales {

    protected String apellido;

    protected List<Caracterizacion> caracterizacion;
    protected Dependencia dependencia;
    protected Domicilio domicilioFiscal;
    protected String esSucesion;
    protected String estadoClave;

    protected Date fechaContratoSocial;

    protected Date fechaFallecimiento;

    protected Long idPersona;
    protected Integer mesCierre;
    protected String nombre;
    protected String razonSocial;
    protected String tipoClave;
    protected String tipoPersona;

    public DatosGenerales() {
    }

    /**
     * Para construit desde afip
     * 
     * @param dg
     * @return
     */
    public DatosGenerales(com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.DatosGenerales dg) {
        if (dg.isApellidoSpecified())
            this.apellido = dg.getApellido();

        // Para cada caracterizacion en datosGenerales afip crea una para la clase grupo
        if (dg.isCaracterizacionSpecified()) {
            this.caracterizacion = new ArrayList<Caracterizacion>();
            for (com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.Caracterizacion c : dg.getCaracterizacion()) {
                this.caracterizacion.add(new Caracterizacion(c));
            }
        }
        if (dg.isDependenciaSpecified())
            this.dependencia = new Dependencia(dg.getDependencia());
        if (dg.isDomicilioFiscalSpecified())
            this.domicilioFiscal = new Domicilio(dg.getDomicilioFiscal());
        if (dg.isEsSucesionSpecified())
            this.esSucesion = dg.getEsSucesion();
        if (dg.isEstadoClaveSpecified())
            this.estadoClave = dg.getEstadoClave();
        if (dg.isFechaContratoSocialSpecified())
            this.fechaContratoSocial = dg.getFechaContratoSocial().getTime();
        if (dg.isFechaFallecimientoSpecified())
            this.fechaFallecimiento = dg.getFechaFallecimiento().getTime();
        if (dg.isIdPersonaSpecified())
            this.idPersona = dg.getIdPersona();
        if (dg.isMesCierreSpecified())
            this.mesCierre = dg.getMesCierre();
        if (dg.isNombreSpecified())
            this.nombre = dg.getNombre();
        if (dg.isRazonSocialSpecified())
            this.razonSocial = dg.getRazonSocial();
        if (dg.isTipoClaveSpecified())
            this.tipoClave = dg.getTipoClave();
        if (dg.isTipoPersonaSpecified())
            this.tipoPersona = dg.getTipoPersona();
    }

    /**
     * Obtiene el valor de la propiedad apellido.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Define el valor de la propiedad apellido.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setApellido(String value) {
        this.apellido = value;
    }

    /**
     * Gets the value of the caracterizacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caracterizacion
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getCaracterizacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Caracterizacion }
     * 
     * 
     */
    public List<Caracterizacion> getCaracterizacion() {
        if (caracterizacion == null) {
            caracterizacion = new ArrayList<Caracterizacion>();
        }
        return this.caracterizacion;
    }

    /**
     * Obtiene el valor de la propiedad dependencia.
     * 
     * @return
     *         possible object is
     *         {@link Dependencia }
     * 
     */
    public Dependencia getDependencia() {
        return dependencia;
    }

    /**
     * Define el valor de la propiedad dependencia.
     * 
     * @param value
     *              allowed object is
     *              {@link Dependencia }
     * 
     */
    public void setDependencia(Dependencia value) {
        this.dependencia = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilioFiscal.
     * 
     * @return
     *         possible object is
     *         {@link Domicilio }
     * 
     */
    public Domicilio getDomicilioFiscal() {
        return domicilioFiscal;
    }

    /**
     * Define el valor de la propiedad domicilioFiscal.
     * 
     * @param value
     *              allowed object is
     *              {@link Domicilio }
     * 
     */
    public void setDomicilioFiscal(Domicilio value) {
        this.domicilioFiscal = value;
    }

    /**
     * Obtiene el valor de la propiedad esSucesion.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getEsSucesion() {
        return esSucesion;
    }

    /**
     * Define el valor de la propiedad esSucesion.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setEsSucesion(String value) {
        this.esSucesion = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoClave.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getEstadoClave() {
        return estadoClave;
    }

    /**
     * Define el valor de la propiedad estadoClave.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setEstadoClave(String value) {
        this.estadoClave = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaContratoSocial.
     * 
     * @return
     *         possible object is
     *         {@link Calendar }
     * 
     */
    public Date getFechaContratoSocial() {
        return fechaContratoSocial;
    }

    /**
     * Define el valor de la propiedad fechaContratoSocial.
     * 
     * @param value
     *              allowed object is
     *              {@link Date }
     * 
     */
    public void setFechaContratoSocial(Date value) {
        this.fechaContratoSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFallecimiento.
     * 
     * @return
     *         possible object is
     *         {@link Date }
     * 
     */
    public Date getFechaFallecimiento() {
        return fechaFallecimiento;
    }

    /**
     * Define el valor de la propiedad fechaFallecimiento.
     * 
     * @param value
     *              allowed object is
     *              {@link Date }
     * 
     */
    public void setFechaFallecimiento(Date value) {
        this.fechaFallecimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad idPersona.
     * 
     * @return
     *         possible object is
     *         {@link Long }
     * 
     */
    public Long getIdPersona() {
        return idPersona;
    }

    /**
     * Define el valor de la propiedad idPersona.
     * 
     * @param value
     *              allowed object is
     *              {@link Long }
     * 
     */
    public void setIdPersona(Long value) {
        this.idPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad mesCierre.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getMesCierre() {
        return mesCierre;
    }

    /**
     * Define el valor de la propiedad mesCierre.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setMesCierre(Integer value) {
        this.mesCierre = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad razonSocial.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Define el valor de la propiedad razonSocial.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoClave.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getTipoClave() {
        return tipoClave;
    }

    /**
     * Define el valor de la propiedad tipoClave.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setTipoClave(String value) {
        this.tipoClave = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPersona.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getTipoPersona() {
        return tipoPersona;
    }

    /**
     * Define el valor de la propiedad tipoPersona.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setTipoPersona(String value) {
        this.tipoPersona = value;
    }

}
