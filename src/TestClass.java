public class TestClass {
	public static void main(String[] args) {
		checkIfValidUserCanLogin();
		enteredIdIsNotString();
		checkIfInvalidUserCannotLogin();
		check3TryAttemptsOfLogin();
		System.out.println("All test cases passed!!!");
	}
	private static boolean check(int expected,int actual)
	{
		if(expected != actual)
			throw new RuntimeException(String.format("Invalid , Expected: %d,Actual: %d",expected,actual));
		return true;
	}
	private static void checkIfValidUserCanLogin()
	{
		Login login = new Login();
		int tryId;
		tryId = login.LoginUser(1,"abcdef");
		check(1,tryId);
		if(!login.isLoggedIn())
			throw new RuntimeException("Invalid, user should be logged in");
	}
	private static void enteredIdIsNotString()
	{
		Login login = new Login();
		int tryId;
		try {
			tryId = login.LoginUser(Integer.parseInt("abc"),"abcdef");
			throw new RuntimeException("String as an id is allowed");
			
		}
		catch(NumberFormatException e) {
			
		}
	}
	private static void checkIfInvalidUserCannotLogin()
	{
		Login login = new Login();
		int tryId;
		tryId = login.LoginUser(1,"abcde");
		check(-1,tryId);
	}
	private static void check3TryAttemptsOfLogin()
	{
		Login login = new Login();
		int[] checkIds = new int[] {1,5,3};
		String[] checkPasswords = new String[] {"abcde","wjbdjkw","avwdvwv"};
		try {
			int i = 0;
			while(!login.isLoggedIn())
			{
				login.LoginUser(checkIds[i],checkPasswords[i]);
				check(2-i,login.remainingAttempts());
				i++;
			}
			throw new RuntimeException("More than 3 attempts are allowing");
		}
		catch(LogInTryExceeds  e) {
			
		}
	}
}
