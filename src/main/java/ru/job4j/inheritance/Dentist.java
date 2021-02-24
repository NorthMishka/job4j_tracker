package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String perforator;

    public Dentist(String name1, String surname1, String education1, int birthday1, String medicine1, String perforator1) {
        super(name1, surname1, education1, birthday1, medicine1);
        this.perforator = perforator1;
    }

    public Dentist setPerforator(String perforator) {
        this.perforator = perforator;
        return this;
    }

    public String getPerforator() {
        return perforator;
    }
}

