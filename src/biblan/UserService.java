package biblan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
    BookService bookService = new BookService();
    Scanner sc = new Scanner(System.in);
    List<User> users = new ArrayList();

   Book book1 = null;
   User user1 = null;

public void addUser(User user) {
    users.add(user);
}

    // method to logIn
    /*
    process method user(integer userID , String password)
    start loop in the users list
    userID = get<UserId and Password = user.getpassword
    print "you are logged"
    user1 = user
    return user;
    else
    print "the user is not found"
    end loop
    return null
    end process


     */
 public User findUserbbyID(int userID, String password) {
    for (User user : users) {
        if(userID == user.getUserID() && password.equals(user.getPassword())) {
            return user;
        }
    }
     return null;
 }

 public void loginUser(int userID, String password) {

     if(findUserbbyID(userID, password) != null) {
         System.out.println("You are logged in");
         user1 = findUserbbyID(userID, password);
     } else {
         System.out.println("User not found");
     }


 }
    // methot to signUp
    public void signUp(int userID, String password, String firstName, String lastName, String email, String phone) {

        addUser(new User(userID, password, firstName, lastName, email, phone));
    }

    public void showAllUsers(){
    for (User user : users) {
        user.showuserDetails();
    }

    }


}



