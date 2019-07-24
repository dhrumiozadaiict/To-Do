import java.util.*;
public class Login {
	private static int failedAttempts;
	private static boolean loggedIn;
	Login()
	{
		failedAttempts = 0;
		loggedIn = false;
	}
	static boolean isLoggedIn()
	{
		return loggedIn;
	}
	static boolean LoginUser(int id,String password)
	{
		if(failedAttempts == 3)
			throw new LogInTryExceeds(); 
		if(Authenticator.authenticate(id,password)) {
			return true;
		}
		else {
			failedAttempts++;
			return false;
		}
	}
}
