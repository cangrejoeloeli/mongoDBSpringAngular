package com.db.acerca.afip;

/** Validación de cuit cuil */
public class CuitCuilValitador {

    /**
     * Para verificar que es correcto
     * 
     * @param cuitCuil
     * @return
     */
    public static boolean isValidCuitCuil(String cuitCuil) {

        if (cuitCuil == null || cuitCuil.length() != 11) {
            return false;
        }

        try {
            long cuitCuilLong = Long.parseLong(cuitCuil);
        } catch (NumberFormatException e) {
            return false;
        }

        int[] multipliers = { 5, 4, 3, 2, 7, 6, 5, 4, 3, 2 };
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total += Character.getNumericValue(cuitCuil.charAt(i)) * multipliers[i];
        }

        int mod = total % 11;
        int checkDigit = mod == 0 ? 0 : mod == 1 ? 9 : 11 - mod;

        return checkDigit == Character.getNumericValue(cuitCuil.charAt(10));
    }

    /**
     * Para normalizar cuit cuil en caso de caracteres raros
     * 
     * @param texto
     * @return
     */
    public static String normalizarCuitCuil(String texto) {
        texto = texto.toLowerCase().trim();
        texto = texto.replaceAll("[^0-9\\s]", ""); // Eliminar caracteres que no son números
        texto = texto.replaceAll("\\s+", " "); // Eliminar espacios múltiples
        return texto;
    }

}
