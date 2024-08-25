//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.08.21 a las 06:29:15 PM UTC 
//

package com.gsj.clienteunico.models.PersonaGSJ;

import javax.xml.datatype.XMLGregorianCalendar;

public class Metadata {

    protected XMLGregorianCalendar fechaHora;
    protected String servidor;

    /**
     * Obtiene el valor de la propiedad fechaHora.
     * 
     * @return
     *         possible object is
     *         {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getFechaHora() {
        return fechaHora;
    }

    /**
     * Define el valor de la propiedad fechaHora.
     * 
     * @param value
     *              allowed object is
     *              {@link XMLGregorianCalendar }
     * 
     */
    public void setFechaHora(XMLGregorianCalendar value) {
        this.fechaHora = value;
    }

    /**
     * Obtiene el valor de la propiedad servidor.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getServidor() {
        return servidor;
    }

    /**
     * Define el valor de la propiedad servidor.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setServidor(String value) {
        this.servidor = value;
    }

}
