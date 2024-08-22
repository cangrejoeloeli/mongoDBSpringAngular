//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.08.21 a las 06:29:15 PM UTC 
//

package com.gsj.clienteunico.models.PersonaGSJ;

import java.util.ArrayList;
import java.util.List;

public class ErrorMonotributo {

    protected List<String> error;
    protected String mensaje;

    public ErrorMonotributo() {
    }

    public ErrorMonotributo(com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.ErrorMonotributo e) {

        if (e.isErrorSpecified()) {
            this.error = new ArrayList<String>();
            for (String s : e.getError()) {
                this.error.add(s);
            }
        }
        if (e.isMensajeSpecified())
            this.mensaje = e.getMensaje();
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getError() {
        if (error == null) {
            error = new ArrayList<String>();
        }
        return this.error;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

}
