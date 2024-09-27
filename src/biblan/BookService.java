package biblan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService {
    List<Book> books = new ArrayList();

    Book book1 = null;
    Scanner sc = new Scanner(System.in);


public void addBook(Book book) {
    books.add(book);
}


public void add10Books(int isbn, String title, String auther, String publisher, boolean isBorrowed, int iuserBorrowed) {
addBook(new Book(isbn,title, auther, publisher, isBorrowed, iuserBorrowed));

}
public void showBooks() {
    for (Book book : books) {
        book.showBookDetails();
    }
}

public Book findBookByISBN(int isbn) {
    for (Book book : books) {
        if (book.getIsbn() == isbn) {
            return book;
        }
    }
    return null;
}

public Book borrowBookByISBN(int isbn, int userID) {
    if (findBookByISBN(isbn) != null) {
        book1 = findBookByISBN(isbn);
        if(!book1.isBorrowed()) {
            book1.setBorrowed(true);
            book1.setUserBorrowed(userID);
            return book1;
        } else
            System.out.println("Book is already borrowed");
    }
    return book1;
}

// metod för att visa upp tillgängliga böcker
    public void avaibleBooks(){
        System.out.println("böcker som är tillgängliga att låna ");
    for (Book book : books) {
        if (!book.isBorrowed()) {
            book.showBookDetails();
        }
    }
    }

    // metod för att visa upp böcker som är inte tillgängliga att lååna
    public void userBorrowedBook(int userBorrowed) {
    for (Book book : books) {
        if (book.getUserBorrowed() == userBorrowed) {
            book.showBookDetails();
        }
    }

    }


    public Book returnBook(int isbn) {
    if (findBookByISBN(isbn) != null) {
        book1 = findBookByISBN(isbn);
        book1.setBorrowed(false);
        book1.setUserBorrowed(0);
    }
        return book1;
    }
}
