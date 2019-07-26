import java.io.*;
import java.util.*;
public class MainClass {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		UserLoginController login = new UserLoginController();
		while(!login.isLoggedIn())
		{
			System.out.println("Enter UserId: ");
			int id;
			try {
				id = Integer.parseInt(in.next());
			}
			catch(NumberFormatException e)
			{
				System.out.println("Need to add proper number, characters not allowed");
				continue;
			}
			in.nextLine();
			System.out.println("Enter password: ");
			String password = in.next();
			if(!login.LoginUser(id, password))
				System.out.println("Invalid Id or password "+login.remainingAttempts()+" attempts remained");
		}
		System.out.println("User Id: "+login.getCurrentlyLoggedInUser().getId()+" logged in");
		UserOperations useroperations = new UserOperations(login);
		useroperations.addAToDoList("public");
		useroperations.addAToDoList("Professional");
		useroperations.getCurrentlyLoggedInUserToDoLists();
	}
}
