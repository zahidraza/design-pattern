package com.jazasoft.adapter;

/**
 * Created by mdzahidraza on 25/08/17.
 */
public class NewLineFormatter implements TextFormattable {

    public String formatText(String text) {
        String formattedText=text.replace(".","\n");
        return formattedText;
    }
}
