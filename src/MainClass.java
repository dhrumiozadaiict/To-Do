import java.io.*;
import java.util.*;
public class MainClass {
	private static int currentlyLoggedInUserId; 
	private static User currentlyLoggedInUser;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Login login = new Login();
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
			int tryId = login.LoginUser(id, password);
			if(tryId == -1)
				System.out.println("Invalid Id or password "+login.remainingAttempts()+"attempts remained");
			else 
				currentlyLoggedInUserId = tryId;
		}
		System.out.println("User Id: "+currentlyLoggedInUserId+" logged in");
		currentlyLoggedInUser = UserMap.getUserFromId(currentlyLoggedInUserId);
	}
}
