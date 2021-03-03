package ru.job4j.tracker;

public class ReplaceAction implements UserAction{
    @Override
    public String name() {
        return "=== Edit task ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        String name = input.askStr("Enter new name: ");
        Item item = new Item(name);
        boolean result = tracker.replace(id, item);
        if (result) {
            System.out.println("Task id " + id + " edit");
        } else {
            System.out.println("Unknown task");
        }
        return true;
    }
}
