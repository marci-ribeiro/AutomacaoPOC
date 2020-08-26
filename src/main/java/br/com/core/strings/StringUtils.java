package br.com.core.strings;

import java.text.Normalizer;

public class StringUtils {
    /**
     * Replace caraters with accent and special caracters
     * @param value  driver of the application
     * @return Returns caracters without accent and special caracters
     */
    public static String unaccent(String value) {
        return Normalizer
                .normalize(value, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "");
    }
}
