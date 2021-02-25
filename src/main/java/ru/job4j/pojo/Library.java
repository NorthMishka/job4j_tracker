package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Fantasy", 75);
        Book book2 = new Book("All MUSIC WORlD", 151);
        Book book3 = new Book("Clean code", 98);
        Book book4 = new Book("Finger", 101);

        Book book[] = new Book[4];
        book[0] = book1;
        book[1] = book2;
        book[2] = book3;
        book[3] = book4;
        for (int i = 0; i < book.length; i++) {
            Book b = book[i];
            System.out.println(b.getName() + " - " + b.getCount() + " pages");
        }

        System.out.println("\t" + "Replacing an array cell");
        Book temp = new Book(null, 0);
        temp = book[0];
        book[0] = book[3];
        book[3] = temp;
        for (int i = 0; i < book.length; i++) {
            Book b = book[i];
            System.out.println(b.getName() + " - " + b.getCount() + " pages");
        }

        System.out.println("\t" + "Clean code book");
        for (int i = 0; i < book.length; i++) {
            Book b = book[i];
            if (b.getName().equals("Clean code")){
                System.out.println(b.getName() + " - " + b.getCount() + " pages");
                break;
            }
        }
    }
}
