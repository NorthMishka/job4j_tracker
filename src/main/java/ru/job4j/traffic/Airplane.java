package ru.job4j.traffic;

public class Airplane implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Go by sky");
    }
}
