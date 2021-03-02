package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        CreateAction create = new CreateAction();
        create.execute(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }
    @Test
    public void whenDeleteItem() {
        Item item = new Item("New");
        Tracker tracker = new Tracker();
        DeleteAction delete = new DeleteAction();
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId())};
        delete.execute(new StubInput(answers), tracker);
        Item deleted = tracker.findById(item.getId());
        assertNull(deleted);
    }
    @Test
    public void whenReplaceItem() {
        Item item = new Item("New");
        Tracker tracker = new Tracker();
        ReplaceAction replace = new ReplaceAction();
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId()), "edit"};
        replace.execute(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("edit"));
    }
}