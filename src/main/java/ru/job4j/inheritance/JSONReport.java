package ru.job4j.inheritance;

public class JSONReport extends TextReport{
    @Override
    public String generate(String name, String body) {
        char quote = '"';
        return "{"+ System.lineSeparator() + "  " + quote + "name" + quote + " : " + quote + name + quote + "," + System.lineSeparator() + "  " + quote + "body" + quote + " : " + quote + body + quote + System.lineSeparator() + "}";
    }
}

