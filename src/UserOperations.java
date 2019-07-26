import java.util.HashMap;
import java.util.HashSet;
public class UserOperations {
	UserLoginController login;
	User currentlyLoggedInUser;
	UserMap usermap = new UserMap();
	ToDoListMap currentToDoMap = new ToDoListMap();
	TaskMap taskmap = new TaskMap();
	UserOperations(UserLoginController login)
	{
		this.login = login;
		currentlyLoggedInUser = login.getCurrentlyLoggedInUser();
	}
	public boolean addAToDoList(String newToDoListName)
	{
		if(!login.isLoggedIn())
			throw new RuntimeException("Login First");
		if(login.getCurrentlyLoggedInUser().searchToDoListByName(newToDoListName))
			return false;
		currentToDoMap.addElementIntoToDoListMap(newToDoListName);
		currentlyLoggedInUser.addElementIntoToDoLists();
		return true;
	}
	public void getCurrentlyLoggedInUserToDoLists()
	{
		HashSet<Integer> currentlyLoggedInUserToDoLists = currentlyLoggedInUser.getUserToDoLists();
		for(Integer i : currentlyLoggedInUserToDoLists)
		{
			System.out.println(currentToDoMap.getToDoList(i).getName());
		}
	}
}
