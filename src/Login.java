import java.util.*;
public class Login {
	private static int failedAttempts;
	private static boolean loggedIn;
	static {
		failedAttempts = 1;
		loggedIn = false;
	}
	static boolean isLoggedIn()
	{
		return loggedIn;
	}
	static int remainingAttempts()
	{
		return (4-failedAttempts);
	}
	static int LoginUser(int id,String password)
	{
		if(failedAttempts == 3)
			throw new LogInTryExceeds(); 
		if(Authenticator.authenticate(id,password)) {
			loggedIn = true;
			return id;
		}
		else {
			failedAttempts++;
			return -1;
		}
	}
}
