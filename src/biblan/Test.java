package biblan;

import javax.script.ScriptEngine;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("test att låna en book");

        UserService userService = new UserService();
        userService.signUp(1,"Mohammad ", "abbas", "sa1984if", "mohammad@gmail.com","0763628940");
        userService.signUp(2,"fateen ", "abbas", "sa1984if", "mohammad@gmail.com","0763628940");
        userService.signUp(3,"Mariam ", "abbas", "sa1984if", "mohammad@gmail.com","0763628940");
        userService.signUp(4,"Saifo ", "abbas", "sa1984if", "mohammad@gmail.com","0763628940");
        userService.signUp(5,"Rawan ", "abbas", "sa1984if", "mohammad@gmail.com","0763628940");
        userService.signUp(11,"Ahmad ", "abbas", "sa1984if", "mohammad@gmail.com","0763628940");


        BookService bookService = new BookService();
        bookService.add10Books(1,"en man som heter Ove","backman","stockholm",false,0);
        bookService.add10Books(2,"saliy   ","Niks","Kinna",false,0);
        bookService.add10Books(3,"rami","salim","Göteborg",false,0);
        bookService.add10Books(4,"sami","Sami","Sami",false,0);
        bookService.add10Books(5,"sari    ","gazi","sahab",false,0);


        int userid = sc.nextInt();

        //bookService.borrowBookByISBN(userid,);

        //userService.showAllUsers();
        bookService.showBooks();

        bookService.avaibleBooks();

       //userService.loginUser();

}


}
