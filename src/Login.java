import java.util.*;
public class Login {
	private int failedAttempts;
	private boolean loggedIn;
	Login()
	{
		failedAttempts = 0;
		loggedIn = false;
	}
	boolean isLoggedIn()
	{
		return loggedIn;
	}
	int remainingAttempts()
	{
		return (3-failedAttempts);
	}
	int LoginUser(int id,String password)
	{ 
		if(Authenticator.authenticate(id,password)) {
			loggedIn = true;
			return id;
		}
		else {
			failedAttempts++;
			if(failedAttempts == 3)
				throw new LogInTryExceeds();
			return -1;
		}
	}
}
