package com.codecool.usecase1.common_method_to_different_types.view;

import java.util.List;
import java.util.regex.Pattern;

import static org.fusesource.jansi.Ansi.Color.RED;
import static org.fusesource.jansi.Ansi.ansi;

public class TerminalOutput {

    public <T> void renderList(List<T> list) {
        System.out.println('[');
        StringBuilder builder = new StringBuilder();
        for (T element : list) {
            builder.append("\t"+element+",\n");
        }
        replaceLastTwoChars(builder);
        System.out.print(builder.toString());
        System.out.println(']');
    }

    private void replaceLastTwoChars(StringBuilder builder) {
        builder
                .delete(builder.length()-2, builder.length())
                .append("\n");
    }




    public <T> void renderListHighLightingWord(List<T> list, String word) {
        System.out.println('[');
        StringBuilder builder = new StringBuilder();
        for (T element : list) {
            builder.append("\t"+highlightWordInString(word, element.toString())+",\n");
        }
        replaceLastTwoChars(builder);
        System.out.print(builder.toString());
        System.out.println(']');


    }

    private static String highlightWordInString(String word, String string) {
        Pattern regexPattern = Pattern.compile("("+word.toLowerCase()+")", Pattern.CASE_INSENSITIVE);
        return regexPattern.matcher(string).replaceAll(asRedText("$1"));
    }

    private static String asRedText(String word) {
        return ansi().fg(RED).a(word).reset().toString();
    }
}
