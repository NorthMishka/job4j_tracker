package ru.job4j.tracker;

public class DeleteAction implements UserAction{
    @Override
    public String name() {
        return "=== Delete task ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        System.out.println(id);
        boolean result = tracker.delete(id);
        if (result) {
            System.out.println("Task id " + id + " delete");
        } else {
            System.out.println("Unknown task");
        }
        return true;
    }
}
