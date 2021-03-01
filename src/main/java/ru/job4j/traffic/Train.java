package ru.job4j.traffic;

public class Train implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Go by rail");
    }
}
