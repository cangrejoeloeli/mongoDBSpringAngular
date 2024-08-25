package com.gsj.clienteunico.afipws.services;

public class ValidadorCuit {

    /**
     * Para convertirlo a Long. a debería estar validado
     * 
     * @param cuit
     * @return
     */
    public static Long cuitToLong(String cuit) {
        String cuitCuil = normalizarCuitCuil(cuit);
        return Long.parseLong(cuitCuil);
    }

    /**
     * Para verificar que es correcto
     * 
     * @param cuitCuil
     * @return
     */
    public static boolean isValidCuitCuil(String cuitCuil) {

        cuitCuil = normalizarCuitCuil(cuitCuil);

        if (cuitCuil == null || cuitCuil.length() != 11) {
            return false;
        }

        try {
            Long.parseLong(cuitCuil);
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
    private static String normalizarCuitCuil(String texto) {
        texto = texto.toLowerCase().trim();
        texto = texto.replaceAll("[^0-9\\s]", ""); // Eliminar caracteres que no son números
        texto = texto.replaceAll("\\s+", " "); // Eliminar espacios múltiples
        return texto;
    }

}
