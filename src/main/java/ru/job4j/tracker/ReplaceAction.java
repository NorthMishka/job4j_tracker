package ru.job4j.tracker;

public class ReplaceAction implements UserAction{
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Edit task";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        String name = input.askStr("Enter new name: ");
        Item item = new Item(name);
        boolean result = tracker.replace(id, item);
        if (result) {
            out.println("Task id " + id + " edit");
        } else {
            out.println("Unknown task");
        }
        return true;
    }
}
