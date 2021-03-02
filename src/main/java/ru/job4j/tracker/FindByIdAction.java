package ru.job4j.tracker;

public class FindByIdAction implements UserAction{
    @Override
    public String name() {
        return "=== Find task by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.parseInt(input.askStr("Enter id: "));
        System.out.println(id);
        Item result = tracker.findById(id);
        if (result != null) {
            System.out.println("Name: " + result.getName() + " id: " + result.getId());
        } else {
            System.out.println("Unknown task");
        }
        return true;
    }
}
