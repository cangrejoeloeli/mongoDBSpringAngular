package com.gsj.clienteunico.validators;

import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

import com.gsj.clienteunico.anotations.ValidEmailMX;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.Hashtable;

public class EmailMXValidator implements ConstraintValidator<ValidEmailMX, String> {

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        // Extraer el dominio del correo electrónico
        String[] emailParts = email.split("@");
        if (emailParts.length != 2) {
            return false;
        }
        String domain = emailParts[1];

        try {
            // Configurar el contexto para realizar la consulta DNS
            Hashtable<String, String> env = new Hashtable<>();
            env.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
            DirContext dirContext = new InitialDirContext(env);

            // Obtener los registros MX del dominio
            Attributes attributes = dirContext.getAttributes(domain, new String[] { "MX" });

            // Si el dominio tiene registros MX, es válido
            return attributes != null && attributes.size() > 0;
        } catch (NamingException e) {
            // En caso de error al consultar el DNS, el dominio es inválido
            return false;
        }
    }
}
