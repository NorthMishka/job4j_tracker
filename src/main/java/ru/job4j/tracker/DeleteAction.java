package ru.job4j.tracker;

public class DeleteAction implements UserAction{
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Delete task";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        out.println(id);
        boolean result = tracker.delete(id);
        if (result) {
            out.println("Task id " + id + " delete");
        } else {
            out.println("Unknown task");
        }
        return true;
    }
}
