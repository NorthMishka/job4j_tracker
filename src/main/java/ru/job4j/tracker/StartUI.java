package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int input = Integer.parseInt(scanner.nextLine());
            switch (input){
                case 0:
                    System.out.println("Creating a new task");
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    Item item = new Item(name);
                    tracker.add(item);
                    break;
                case 1:
                    System.out.println("All tasks:");
                    Item[] items = tracker.findAll();
                    for (int i = 0; i < items.length; i++) {
                        System.out.println(items[i]);
                    }
                    break;
                case 2:
                    System.out.println("Edit task");
                    System.out.print("Enter id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter new name task: ");
                    String name2 = scanner.nextLine();
                    Item item2 = new Item(name2);
                    boolean rls = tracker.replace(id, item2);
                    if (rls) {
                        System.out.println("Task id " + id + " edit " + item2);
                    } else {
                        System.out.println("Unknown task");
                    }
                    break;
                case 3:
                    System.out.println("Delete task");
                    System.out.print("Enter id: ");
                    int id3 = Integer.parseInt(scanner.nextLine());
                    System.out.println(id3);
                    boolean rls3 = tracker.delete(id3);
                    if (rls3) {
                        System.out.println("Task id " + id3 + " delete");
                    } else {
                        System.out.println("Unknown task");
                    }
                    break;
                case 4:
                    System.out.println("Find task by Id");
                    System.out.print("Enter id: ");
                    int id4 = Integer.parseInt(scanner.nextLine());
                    System.out.println(id4);
                    Item rls4 = tracker.findById(id4);
                    if (rls4 != null) {
                        System.out.println("Name " + rls4.getName() + " id " + rls4.getId());
                    } else {
                        System.out.println("Unknown task");
                    }
                    break;
                case 5:
                    System.out.println("Find task by name");
                    System.out.print("Enter name: ");
                    String name5 = scanner.nextLine();
                    Item[] item5 = tracker.findByName(name5);
                        if (item5.length > 0) {
                            for (Item value : item5) {
                                System.out.println(value);
                            }
                        } else {
                            System.out.println("Unknown task");
                        }
                    break;
                case 6:
                    run = false;
                    break;

                default:
                    System.out.println("ДОПИСАТЬ!");
                    break;
            }
            /* if */
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
        /* добавить остальные пункты меню. */
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
