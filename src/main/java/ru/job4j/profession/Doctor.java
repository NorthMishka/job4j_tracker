package ru.job4j.profession;

public class Doctor extends Profession{
    private String medicine;

    public Doctor(String name1, String surname1, String education1, int birthday1, String medicine1) {
        super(name1, surname1, education1, birthday1);
        this.medicine = medicine1;
    }

    public String getMedicine() {
        return medicine;
    }
}
