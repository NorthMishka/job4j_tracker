package ru.job4j.poly;

public class Bus implements Transport {
    private int people;
    private int price;

    @Override
    public void go() {
        System.out.println("Next station - Chinatown");
    }

    @Override
    public void passengers(int number) {
        int rsl = number - this.people;
    }

    @Override
    public double fuelPrice(double value) {
        return price * value;
    }
}
