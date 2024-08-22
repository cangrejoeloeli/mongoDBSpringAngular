//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.08.21 a las 06:29:15 PM UTC 
//

package com.gsj.clienteunico.models.PersonaGSJ;

import java.util.ArrayList;
import java.util.List;

public class DatosRegimenGeneral {

    protected List<Actividad> actividad;
    protected Categoria categoriaAutonomo;
    protected List<Impuesto> impuesto;
    protected List<Regimen> regimen;

    public DatosRegimenGeneral() {
    }

    public DatosRegimenGeneral(com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.DatosRegimenGeneral d) {
        if (d.isActividadSpecified()) {
            this.actividad = new ArrayList<Actividad>();
            for (com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.Actividad a : d.getActividad()) {
                this.actividad.add(new Actividad(a));
            }
        }
        if (d.isCategoriaAutonomoSpecified())
            this.categoriaAutonomo = new Categoria(d.getCategoriaAutonomo());

        if (d.isImpuestoSpecified()) {
            this.impuesto = new ArrayList<Impuesto>();
            for (com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.Impuesto i : d.getImpuesto()) {
                this.impuesto.add(new Impuesto(i));
            }
        }
        if (d.isRegimenSpecified()) {
            this.regimen = new ArrayList<Regimen>();
            for (com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.Regimen r : d.getRegimen()) {
                this.regimen.add(new Regimen(r));
            }
        }
    }

    /**
     * Gets the value of the actividad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actividad
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getActividad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Actividad }
     * 
     * 
     */
    public List<Actividad> getActividad() {
        if (actividad == null) {
            actividad = new ArrayList<Actividad>();
        }
        return this.actividad;
    }

    /**
     * Obtiene el valor de la propiedad categoriaAutonomo.
     * 
     * @return
     *         possible object is
     *         {@link Categoria }
     * 
     */
    public Categoria getCategoriaAutonomo() {
        return categoriaAutonomo;
    }

    /**
     * Define el valor de la propiedad categoriaAutonomo.
     * 
     * @param value
     *              allowed object is
     *              {@link Categoria }
     * 
     */
    public void setCategoriaAutonomo(Categoria value) {
        this.categoriaAutonomo = value;
    }

    /**
     * Gets the value of the impuesto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the impuesto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getImpuesto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Impuesto }
     * 
     * 
     */
    public List<Impuesto> getImpuesto() {
        if (impuesto == null) {
            impuesto = new ArrayList<Impuesto>();
        }
        return this.impuesto;
    }

    /**
     * Gets the value of the regimen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regimen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getRegimen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Regimen }
     * 
     * 
     */
    public List<Regimen> getRegimen() {
        if (regimen == null) {
            regimen = new ArrayList<Regimen>();
        }
        return this.regimen;
    }

}
