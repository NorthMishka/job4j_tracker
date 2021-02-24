package ru.job4j.inheritance;

public class Builder extends Engineer{
    private String instrument;

    public Builder(String name1, String surname1, String education1, int birthday1, String skills1, String instrument1) {
        super(name1, surname1, education1, birthday1, skills1);
        this.instrument = instrument1;
    }

    public String getInstrument() {
        return instrument;
    }
}
