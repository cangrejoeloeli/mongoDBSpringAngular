package com.db.acerca.helpers;

public final class StringHelper {

    public static String normalize_nombre(String nombre) {

        return nombre.replace(" ", "").replace(".", "");
    }

}
