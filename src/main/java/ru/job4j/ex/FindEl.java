package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException{
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl < 0) {
            throw new ElementNotFoundException("Element not found!");
        }
        return rsl;
    }
    public static void main(String[] args) {
        String[] value = {"test1", "test2", "test3", "test4"};
        try {
//            indexOf(value, "test1");//OK
            indexOf(value, "test5");//NOT OK
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}

