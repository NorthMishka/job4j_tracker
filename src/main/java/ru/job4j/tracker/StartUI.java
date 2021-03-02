package ru.job4j.tracker;



public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int enter = Integer.parseInt(input.askStr("Select: "));
            switch (enter){
                case 0:
                    System.out.println("Creating a new task");
                    String name = input.askStr("Enter name: ");
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
                    int id = Integer.parseInt(input.askStr("Enter id: "));
                    name = input.askStr("Enter new name task: ");
                    item = new Item(name);
                    boolean rls = tracker.replace(id, item);
                    if (rls) {
                        System.out.println("Task id " + id + " edit " + item);
                    } else {
                        System.out.println("Unknown task");
                    }
                    break;
                case 3:
                    System.out.println("Delete task");
                    id = Integer.parseInt(input.askStr("Enter id: "));
                    System.out.println(id);
                    rls = tracker.delete(id);
                    if (rls) {
                        System.out.println("Task id " + id + " delete");
                    } else {
                        System.out.println("Unknown task");
                    }
                    break;
                case 4:
                    System.out.println("Find task by Id");
                    id = Integer.parseInt(input.askStr("Enter id: "));
                    System.out.println(id);
                    item = tracker.findById(id);
                    if (item != null) {
                        System.out.println("Name " + item.getName() + " id " + item.getId());
                    } else {
                        System.out.println("Unknown task");
                    }
                    break;
                case 5:
                    System.out.println("Find task by name");
                    name = input.askStr("Enter name: ");
                    items = tracker.findByName(name);
                        if (items.length > 0) {
                            for (Item value : items) {
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
