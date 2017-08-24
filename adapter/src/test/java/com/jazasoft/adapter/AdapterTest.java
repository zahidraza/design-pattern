package com.jazasoft.adapter;

import org.testng.annotations.Test;

/**
 * Created by mdzahidraza on 25/08/17.
 */
public class AdapterTest {

    @Test
    public void testFormatText() {
        String testString = " Formatting line 1. Formatting line 2. Formatting line 3.";
        TextFormattable newLineFormatter = new NewLineFormatter();
        String resultString = newLineFormatter.formatText(testString);
        System.out.println(resultString);

        CsvFormattable csvFormatter = new CsvFormatter();
        TextFormattable csvAdapter = new CsvAdapter(csvFormatter);
        String resultCsvString = csvAdapter.formatText(testString);
        System.out.println(resultCsvString);
    }
}
