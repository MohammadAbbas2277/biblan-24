package biblan;

public class Book {
    private int isbn;
    private String title;
    private String author;
    private String publisher;
    private boolean isBorrowed = false;
    private int userBorrowed = 0;

    protected Book(int isbn, String title, String author, String publisher, boolean isBorrowed, int userBorrowed) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.isBorrowed = isBorrowed;
        this.userBorrowed = userBorrowed;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public int getUserBorrowed() {
        return userBorrowed;
    }

    public void setUserBorrowed(int userBorrowed) {
        this.userBorrowed = userBorrowed;
    }

    public void showBookDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("isBorrowed: " + isBorrowed());
        System.out.println("Borrowed by: " + getUserBorrowed());

    }
}
