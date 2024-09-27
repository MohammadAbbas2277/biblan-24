package biblan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static UserService us = new UserService();
    static BookService bs = new BookService();
    static int userID;
    static String password;

    public static void main(String[] args) {
        System.out.println("Biblan");


        us.signUp(1,"Mohammad ", "abbas", "sa1984if", "mohammad@gmail.com","0763628940");
        us.signUp(2,"fateen ", "abbas", "sa1984if", "mohammad@gmail.com","0763628940");
        us.signUp(3,"Mariam ", "abbas", "sa1984if", "mohammad@gmail.com","0763628940");
        us.signUp(4,"Saifo ", "abbas", "sa1984if", "mohammad@gmail.com","0763628940");
        us.signUp(5,"Rawan ", "abbas", "sa1984if", "mohammad@gmail.com","0763628940");
        us.signUp(11,"Ahmad ", "abbas", "sa1984if", "mohammad@gmail.com","0763628940");


        bs.add10Books(1,"en man som heter Ove","backman","stockholm",false,0);
        bs.add10Books(2,"saliy   ","Niks","Kinna",false,0);
        bs.add10Books(3,"rami","salim","Göteborg",false,0);
        bs.add10Books(4,"sami","Sami","Sami",false,0);
        bs.add10Books(5,"sari    ","gazi","sahab",false,0);






        usermenu();


    }

    static void usermenu(){
        while(true){
            try {
                System.out.println("1. log in");
                System.out.println("2. visa alla tillgängliga böcker.");
                System.out.println("3. visa min låne lista");
                System.out.println("4. låna en bok.");
                System.out.println("5. lämna tilllbaka en bok.");
                int menuSelect = sc.nextInt();
                switch (menuSelect) {
                    case 1:
                        System.out.println("Please enter your ID");
                         userID = sc.nextInt();
                        System.out.println("Please enter your password");
                         password = sc.next();
                        us.loginUser(userID,password);
                        break;
                    case 2:
                        bs.avaibleBooks();
                        break;
                    case 3:
                        bs.userBorrowedBook(userID);
                        break;
                    case 4:

                    System.out.println("vilken bok vill du låna");
                    int isbn = sc.nextInt();
                    bs.borrowBookByISBN(isbn,userID);
                    break;

                    case 5:
                        System.out.println("Vilken bok vill du lämna tillbaka");
                        bs.returnBook(sc.nextInt());
                        break;
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }


    }

    static void adminmenu(){
        System.out.println("1 log in");
        System.out.println("2. visa aalla böcker");
        System.out.println("3. visa atta tillgängilga böcker");

        System.out.println("1. add en ny bok");
        System.out.println("2. delete en bok");
        System.out.println("3. Edit en bok detaljer");

        System.out.println("7. lägg till en ny användare");
        System.out.println("8. endra användare detaljer");
        System.out.println("delete en användare");

    }
}
