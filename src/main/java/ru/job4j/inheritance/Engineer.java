package ru.job4j.inheritance;

public class Engineer extends Profession{
    private String skills;

    public Engineer(String name1, String surname1, String education1, int birthday1, String skills1) {
        super(name1, surname1, education1, birthday1);
        this.skills = skills1;
    }

    public String getSkills() {
        return skills;
    }
}
