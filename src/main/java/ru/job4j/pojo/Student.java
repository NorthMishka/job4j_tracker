package ru.job4j.pojo;

public class Student {
    private String fullName;
    private String group;
    private String receiptDate;

    public String getFullName() {
        return fullName;
    }

    public Student setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getGroup() {
        return group;
    }

    public Student setGroup(String group) {
        this.group = group;
        return this;
    }

    public String getReceiptDate() {
        return receiptDate;
    }

    public Student setReceiptDate(String receiptDate) {
        this.receiptDate = receiptDate;
        return this;
    }
}
