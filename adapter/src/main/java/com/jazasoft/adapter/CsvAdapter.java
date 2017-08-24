package com.jazasoft.adapter;

/**
 * Created by mdzahidraza on 25/08/17.
 */
public class CsvAdapter implements TextFormattable {
    CsvFormattable csvFormatter;
    public CsvAdapter(CsvFormattable csvFormatter) {
        this.csvFormatter = csvFormatter;
    }
    public String formatText(String text) {
        String formattedText = csvFormatter.formatCsvText(text);
        return formattedText;
    }
}
