package ru.job4j.traffic;

public class Main {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();

        Vehicle[] array = new Vehicle[]{airplane, train, bus};
        for (Vehicle vehicle : array) {
            vehicle.move();
        }
    }
}
