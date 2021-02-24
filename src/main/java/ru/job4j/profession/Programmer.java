package ru.job4j.profession;

public class Programmer extends Engineer{
    private String telework;

    public Programmer(String name1, String surname1, String education1, int birthday1, String skills1, String telework1) {
        super(name1, surname1, education1, birthday1, skills1);
        this.telework = telework1;
    }

    public String getTelework() {
        return telework;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
