package models;

public abstract class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    // Getters and setters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isBorrowed() { return isBorrowed; }
    
    public void setBorrowed(boolean borrowed) { isBorrowed = borrowed; }

    // Abstract method for book type
    public abstract String getBookType();

    @Override
    public String toString() {
        return String.format("Title: %s, Author: %s, ISBN: %s, Type: %s, Status: %s",
                title, author, isbn, getBookType(), isBorrowed ? "Borrowed" : "Available");
    }
}