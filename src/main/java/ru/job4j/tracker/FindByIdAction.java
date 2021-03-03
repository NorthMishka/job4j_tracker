package ru.job4j.tracker;

public class FindByIdAction implements UserAction{
    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "=== Find task by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        out.println(id);
        Item result = tracker.findById(id);
        if (result != null) {
            out.println("Name: " + result.getName() + " id: " + result.getId());
        } else {
            out.println("Unknown task");
        }
        return true;
    }
}
