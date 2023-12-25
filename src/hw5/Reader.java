package hw5;

import java.util.Arrays;

public class Reader {
    private String name;
    private int numberCard;
    private String faculty;
    private String dataOfBirth;
    private String phoneNumber;

    public Reader(String name, int numberCard, String faculty, String dataOfBirth, String phoneNumber) {
        this.name = name;
        this.numberCard = numberCard;
        this.faculty = faculty;
        this.dataOfBirth = dataOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void takeBook(int numberBooks) {
        System.out.println(getName() + " взял " + numberBooks + " книги");
    }

    public void takeBook(String ... nameOfBook) {
        System.out.println(getName() + " взял следующие книги: ");
        for(int i = 0; i < nameOfBook.length; i++) {
            System.out.println(Arrays.toString(nameOfBook));
        }
    }

    public void returnBook(int numberBooks) {
        System.out.println(getName() + " отдал " + numberBooks + " книги");
    }

    public void returnBook(String ... nameOfBook) {
        System.out.println(getName() + " отдал следующие книги: ");
        for(int i = 0; i < nameOfBook.length; i++) {
            System.out.println(Arrays.toString(nameOfBook));
        }
    }
}
