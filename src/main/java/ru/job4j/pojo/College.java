package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivan");
        student.setGroup("IT");
        student.setReceiptDate("15.06.2020");

        System.out.println(student.getFullName() + System.lineSeparator() + student.getGroup() + System.lineSeparator() + student.getReceiptDate());
    }
}
