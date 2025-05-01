package library;

public class EBook extends Book {
    private String downloadLink;

    public EBook(String title, String author, String isbn, String downloadLink) {
        super(title, author, isbn);
        this.downloadLink = downloadLink;
    }

    public String getDownloadLink() { return downloadLink; }
}