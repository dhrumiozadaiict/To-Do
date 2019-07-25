import java.util.ArrayList;
public class ToDo_Category {
	String name;
	ArrayList<String> tasks;
	ToDo_Category(String name)
	{
		this.name = name;
		tasks = new ArrayList<String>();
	}
}