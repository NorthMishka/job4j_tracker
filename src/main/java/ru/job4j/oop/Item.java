package ru.job4j.oop;

import java.time.LocalDateTime;

public class Item {
    private String name;
    private int id;
    private LocalDateTime created = LocalDateTime.now();

    public Item() {
    }
    public Item(int id) {

        this.id = id;
    }
    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public LocalDateTime getCreated() {
        return created;
    }
    public static void main(String[] args) {
        Item item = new Item();
    }
}
