package ru.job4j.profession;

public class Surgeon extends Doctor{
    private String scalpel;

    public Surgeon(String name1, String surname1, String education1, int birthday1, String medicine1, String scalpel1) {
        super(name1, surname1, education1, birthday1, medicine1);
        this.scalpel = scalpel1;
    }

    public void setScalpel(String scalpel) {
        this.scalpel = scalpel;
    }

    public String getScalpel() {
        return scalpel;
    }
}
