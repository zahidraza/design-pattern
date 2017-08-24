package com.jazasoft.adapter;

/**
 * Created by mdzahidraza on 25/08/17.
 */
public class CsvFormatter implements CsvFormattable {
    public String formatCsvText(String text) {
        String formattedText=text.replace(".",",");
        return formattedText;
    }
}
