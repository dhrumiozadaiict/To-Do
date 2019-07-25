import java.util.ArrayList;
public class User {
	int id;
	ArrayList<ToDo_Category> ToDoCategories;
	User(int id)
	{
		this.id = id;
		ToDoCategories = new ArrayList<ToDo_Category>();
	}
}
