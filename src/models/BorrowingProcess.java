package library;

import java.time.LocalDate;

public class BorrowingProcess {
    private Book book;
    private Borrower borrower;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public BorrowingProcess(Book book, Borrower borrower, LocalDate borrowDate) {
        this.book = book;
        this.borrower = borrower;
        this.borrowDate = borrowDate;
        this.returnDate = null;
    }

    // Methods
    public void completeReturn(LocalDate returnDate) {
        this.returnDate = returnDate;
        borrower.returnBook(book);
    }

    // Getters
    public Book getBook() { return book; }
    public Borrower getBorrower() { return borrower; }
    public LocalDate getBorrowDate() { return borrowDate; }
    public LocalDate getReturnDate() { return returnDate; }
}