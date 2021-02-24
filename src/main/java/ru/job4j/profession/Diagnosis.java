package ru.job4j.profession;

public class Diagnosis extends Doctor {
    private String diagnostic;

    public Diagnosis(String name1, String surname1, String education1, int birthday1, String medicine1, String diagnostic1) {
        super(name1, surname1, education1, birthday1, medicine1);
        this.diagnostic = diagnostic1;
    }

    public String getDiagnostic() {
        return diagnostic;
    }
    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }
}
