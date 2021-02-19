package ru.job4j.inheritance;

public class Surgeon extends Doctor{
    private String scalpel;

    public void setScalpel(String scalpel) {
        this.scalpel = scalpel;
    }

    public String getScalpel() {
        return scalpel;
    }
}
