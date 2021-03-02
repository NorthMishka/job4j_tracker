package ru.job4j.strategy;

public class Hexagon implements Shape{
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return    " ___ " + ln
                + "/   \\" + ln
                + "\\___/" + ln;
    }

    public static void main(String[] args) {
        System.out.println(new Triangle().draw());
    }
}