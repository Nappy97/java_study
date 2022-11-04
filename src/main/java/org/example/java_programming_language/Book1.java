package org.example.java_programming_language;

public class Book1 {
    int bookNumber;
    String bookTitle;

    Book1(int bookNumber, String bookTitle) {
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return bookTitle + " " + bookNumber;
    }
}