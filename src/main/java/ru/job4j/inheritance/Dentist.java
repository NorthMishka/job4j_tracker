package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String perforator;

    public Dentist setPerforator(String perforator) {
        this.perforator = perforator;
        return this;
    }

    public String getPerforator() {
        return perforator;
    }
}

