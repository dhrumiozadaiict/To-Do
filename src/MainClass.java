import java.io.*;
import java.util.*;
public class MainClass {
	private static int currentlyLoggedInUserId; 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(!Login.isLoggedIn())
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
			int tryId = Login.LoginUser(id, password);
			if(tryId == -1)
				System.out.println("Invalid Id or password "+Login.remainingAttempts()+"attempts remained");
			else 
				currentlyLoggedInUserId = tryId;
		}
		System.out.println(currentlyLoggedInUserId);
	}
}
