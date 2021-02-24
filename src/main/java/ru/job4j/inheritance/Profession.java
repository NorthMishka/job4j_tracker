package ru.job4j.inheritance;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private int birthday;

    public Profession(String name1, String surname1, String education1, int birthday1) {
        this.name = name1;
        this.surname = surname1;
        this.education = education1;
        this.birthday = birthday1;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public int getBirthday() {
        return birthday;
    }
}
