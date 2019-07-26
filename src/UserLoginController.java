import java.util.*;
public class UserLoginController {
	private int failedAttempts;
	private User currentlyLoggedInUser;
	private static boolean loggedIn;
	UserLoginController()
	{
		failedAttempts = 0;
		loggedIn = false;
	}
	boolean isLoggedIn()
	{
		return loggedIn;
	}
	User getCurrentlyLoggedInUser()
	{
		return currentlyLoggedInUser;
	}
	int remainingAttempts()
	{
		return (3-failedAttempts);
	}
	boolean LoginUser(int id,String password)
	{ 
		if(Authenticator.authenticate(id,password)) {
			loggedIn = true;
			currentlyLoggedInUser = new UserMap().getUserFromId(id);
			return true;
		}
		else {
			failedAttempts++;
			if(failedAttempts == 3)
				throw new LogInTryExceeds();
			return false;
		}
	}
}
