package library;

import java.util.ArrayList;
import java.util.List;

public class Borrower {
    private String name;
    private String studentId;
    private List<Book> borrowedBooks;

    public Borrower(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.borrowedBooks = new ArrayList<>();
    }

    // Methods
    public void borrowBook(Book book) {
        if (!book.isBorrowed()) {
            book.borrowBook();
            borrowedBooks.add(book);
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
        }
    }

    // Getters
    public String getName() { return name; }
    public String getStudentId() { return studentId; }
    public List<Book> getBorrowedBooks() { return borrowedBooks; }
}