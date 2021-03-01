package ru.job4j.traffic;

public class Bus implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Go by city station");
    }
}
