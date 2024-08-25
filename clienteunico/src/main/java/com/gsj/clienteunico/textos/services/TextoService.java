package com.gsj.clienteunico.textos.services;

import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

@Service
public class TextoService {

    /**
     * Para ir viendo que sucede con varios valores
     * 
     * @param afip
     * @param gsj
     */
    public String compararDenonimaciones(String afip, String gsj) {

        String afipNormalizada = normalizarString(afip);
        String gsjNormalizada = normalizarString(gsj);

        int distancia = calcularDistanciaLevenshtein(afipNormalizada, gsjNormalizada);
        double indiceJaccard = calcularIndiceJaccard(afipNormalizada, gsjNormalizada);
        boolean pasa = false;
        if (distancia <= 2 && indiceJaccard >= 0.8) {
            pasa = true;
        }
        return "Levenshtein " + String.valueOf(distancia) + " Jaccard " + String.valueOf(indiceJaccard) + " rta "
                + String.valueOf(pasa);
    }

    /**
     * Sacar carateres especiales, espacios multiples y dejar todo en minúscula
     * 
     * @param texto
     * @return
     */
    public String normalizarString(String texto) {
        texto = texto.toLowerCase().trim();
        texto = texto.replaceAll("[áàäâ]", "a")
                .replaceAll("[éèëê]", "e")
                .replaceAll("[íìïî]", "i")
                .replaceAll("[óòöô]", "o")
                .replaceAll("[úùüû]", "u");
        texto = texto.replaceAll("[^a-z0-9\\s]", ""); // Eliminar caracteres especiales
        texto = texto.replaceAll("\\s+", " "); // Eliminar espacios múltiples
        return texto;
    }

    /**
     * Determina que tan distintos son los 2 strings
     * Descripción:
     * Mide la cantidad mínima de operaciones (inserciones,
     * eliminaciones o sustituciones) necesarias para transformar una cadena de
     * texto en otra.
     * Aplicación:
     * Útil para detectar similitudes en textos donde pueden existir
     * pequeños errores o diferencias tipográficas.
     * Ejemplo: Comparación entre "gato" y "pato", donde la distancia de Levenshtein
     * es 1 (una sustitución).
     * 
     * @param str1
     * @param str2
     * @return
     */
    public int calcularDistanciaLevenshtein(String str1, String str2) {
        int[][] dist = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 0; i <= str1.length(); i++) {
            for (int j = 0; j <= str2.length(); j++) {
                if (i == 0) {
                    dist[i][j] = j;
                } else if (j == 0) {
                    dist[i][j] = i;
                } else {
                    int cost = (str1.charAt(i - 1) == str2.charAt(j - 1)) ? 0 : 1;
                    dist[i][j] = Math.min(Math.min(dist[i - 1][j] + 1, dist[i][j - 1] + 1), dist[i - 1][j - 1] + cost);
                }
            }
        }
        return dist[str1.length()][str2.length()];
    }

    /**
     * Para determinar diferncias por palabras
     * Índice de Jaccard
     * Descripción:
     * Mide la similitud entre dos conjuntos comparando la intersección
     * y la unión de los conjuntos de palabras.
     * Aplicación:
     * Adecuado para comparar textos que se pueden representar como
     * conjuntos de palabras, como frases o párrafos.
     * Ejemplo: Comparación entre las frases "El gato negro" y "El gato blanco",
     * donde el índice de Jaccard es la proporción de palabras comunes respecto al
     * total de palabras.
     * 
     * @param str1
     * @param str2
     * @return
     */
    public double calcularIndiceJaccard(String str1, String str2) {
        Set<String> set1 = new HashSet<>(Arrays.asList(str1.split("\\s+")));
        Set<String> set2 = new HashSet<>(Arrays.asList(str2.split("\\s+")));

        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);

        return (double) intersection.size() / union.size();
    }
}
