package com.simple.email.utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public final class FormateoDatos {

    public static String getNumber(double number) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');

        DecimalFormat formatter = new DecimalFormat("#,##0.00", symbols);

        return formatter.format(number);
    }

    public static String getFechaActual() {
        // Obtener la fecha y hora actual
        LocalDateTime ahora = LocalDateTime.now();

        // Definir el formato deseado
        // DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd-MM-yyyy
        // HH:mm:ss");
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Formatear la fecha y hora
        return formateador.format(ahora);
    }

    public static String getFecha(Date fechahora) {

        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");

        // Formatear la fecha y hora
        return formateador.format(fechahora);
    }

    public static String getCis(String cis) {
        return cis.substring(0, 3) + " " + cis.substring(3, 7) + " " + cis.substring(7, 11);

    }
}
