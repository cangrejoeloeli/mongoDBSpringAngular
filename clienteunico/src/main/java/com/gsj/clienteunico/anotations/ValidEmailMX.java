package com.gsj.clienteunico.anotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.gsj.clienteunico.validators.EmailMXValidator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = EmailMXValidator.class)
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidEmailMX {
    String message() default "El dominio del correo no tiene un registro MX válido";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
