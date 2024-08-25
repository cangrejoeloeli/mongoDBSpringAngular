//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.08.21 a las 06:29:15 PM UTC 
//

package com.gsj.clienteunico.models.PersonaGSJ;

import java.util.ArrayList;
import java.util.List;

public class DatosMonotributo {

    protected List<Actividad> actividad;
    protected Actividad actividadMonotributista;
    protected Categoria categoriaMonotributo;

    protected List<Relacion> componenteDeSociedad;

    protected List<Impuesto> impuesto;

    public DatosMonotributo() {
    }

    public DatosMonotributo(com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.DatosMonotributo dm) {

        if (dm.isActividadSpecified()) {
            this.actividad = new ArrayList<Actividad>();
            for (com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.Actividad a : dm.getActividad()) {
                this.actividad.add(new Actividad(a));
            }
        }
        if (dm.isActividadMonotributistaSpecified())
            this.actividadMonotributista = new Actividad(dm.getActividadMonotributista());

        if (dm.isCategoriaMonotributoSpecified())
            this.categoriaMonotributo = new Categoria(dm.getCategoriaMonotributo());

        if (dm.isComponenteDeSociedadSpecified()) {
            this.componenteDeSociedad = new ArrayList<Relacion>();
            for (com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.Relacion r : dm.getComponenteDeSociedad()) {
                this.componenteDeSociedad.add(new Relacion(r));
            }
        }
        if (dm.isImpuestoSpecified()) {
            this.impuesto = new ArrayList<Impuesto>();
            for (com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.Impuesto i : dm.getImpuesto()) {
                this.impuesto.add(new Impuesto(i));
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
     * Obtiene el valor de la propiedad actividadMonotributista.
     * 
     * @return
     *         possible object is
     *         {@link Actividad }
     * 
     */
    public Actividad getActividadMonotributista() {
        return actividadMonotributista;
    }

    /**
     * Define el valor de la propiedad actividadMonotributista.
     * 
     * @param value
     *              allowed object is
     *              {@link Actividad }
     * 
     */
    public void setActividadMonotributista(Actividad value) {
        this.actividadMonotributista = value;
    }

    /**
     * Obtiene el valor de la propiedad categoriaMonotributo.
     * 
     * @return
     *         possible object is
     *         {@link Categoria }
     * 
     */
    public Categoria getCategoriaMonotributo() {
        return categoriaMonotributo;
    }

    /**
     * Define el valor de la propiedad categoriaMonotributo.
     * 
     * @param value
     *              allowed object is
     *              {@link Categoria }
     * 
     */
    public void setCategoriaMonotributo(Categoria value) {
        this.categoriaMonotributo = value;
    }

    /**
     * Gets the value of the componenteDeSociedad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * componenteDeSociedad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getComponenteDeSociedad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Relacion }
     * 
     * 
     */
    public List<Relacion> getComponenteDeSociedad() {
        if (componenteDeSociedad == null) {
            componenteDeSociedad = new ArrayList<Relacion>();
        }
        return this.componenteDeSociedad;
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

}
