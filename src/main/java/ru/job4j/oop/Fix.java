package ru.job4j.oop;

public class Fix {
    private String desc;
    public Fix(String text){
        this.desc = text;
    }

    public static void main(String[] args) {
        String issue = "Fix done";
        Fix fix = new Fix(issue);
    }
}
