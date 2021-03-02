package ru.job4j.tracker;


public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new task ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }
    public static void findAllItem(Tracker tracker) {
        System.out.println("=== Show all task ====");
        Item[] items = tracker.findAll();
        for (Item item : items) {
            System.out.println(item);
        }
    }
    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit task ====");
        int id = Integer.parseInt(input.askStr("Enter id: "));
        String name = input.askStr("Enter new name: ");
        Item item = new Item(name);
        boolean result = tracker.replace(id, item);
        if (result) {
            System.out.println("Task id " + id + " edit");
        } else {
            System.out.println("Unknown task");
        }
    }
    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete task ====");
        int id = Integer.parseInt(input.askStr("Enter id: "));
        System.out.println(id);
        boolean result = tracker.delete(id);
        if (result) {
            System.out.println("Task id " + id + " delete");
        } else {
            System.out.println("Unknown task");
        }
    }
    public static void findByIdItem(Input input, Tracker tracker) {
        System.out.println("=== Find task by Id ====");
        int id = Integer.parseInt(input.askStr("Enter id: "));
        System.out.println(id);
        Item result = tracker.findById(id);
        if (result != null) {
            System.out.println("Name: " + result.getName() + " id: " + result.getId());
        } else {
            System.out.println("Unknown task");
        }
    }
    public static void findByNameItem(Input input, Tracker tracker) {
        System.out.println("===  Find task by name ====");
        String name = input.askStr("Enter name: ");
        Item[] item = tracker.findByName(name);
        if (item.length > 0) {
            for (Item value : item) {
                System.out.println(value);
            }
        } else {
            System.out.println("Unknown task");
        }
    }
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int enter = Integer.parseInt(input.askStr("Select: "));
            switch (enter) {
                case 0:
                    StartUI.createItem(input, tracker);
                    break;
                case 1:
                    StartUI.findAllItem(tracker);
                    break;
                case 2:
                    StartUI.replaceItem(input, tracker);
                    break;
                case 3:
                    StartUI.deleteItem(input, tracker);
                    break;
                case 4:
                    StartUI.findByIdItem(input, tracker);
                    break;
                case 5:
                    StartUI.findByNameItem(input, tracker);
                    break;
                case 6:
                    run = false;
                    break;
                default:
                    System.out.println("Unknown request!");
                    break;
            }
        }
    }
    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
