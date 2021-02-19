package ru.job4j.inheritance;

public class Programmer extends Engineer{
    private String telework;

    public String getTelework() {
        return telework;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
