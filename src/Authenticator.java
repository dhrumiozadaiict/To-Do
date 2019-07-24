import java.util.*;
public class Authenticator {
	private static HashMap<Integer,String> validUsers;
	Authenticator()
	{
		validUsers = new HashMap<Integer,String>();
		validUsers.put(1,"abcdef");
		validUsers.put(2,"defghi");
		validUsers.put(3,"abc123");
		validUsers.put(4,"def456");
	}
	public static boolean authenticate(int id,String password)
	{
		if(validUsers.containsKey(id))
		{
			String testPassword = validUsers.get(id);
			if(password == testPassword)
				return true;
		}
		return false;
	}
}