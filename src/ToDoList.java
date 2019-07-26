import java.util.HashSet;
public class ToDoList {
	private int id;
	private String name;
	private HashSet<Integer> listOfTasks;
	ToDoList(int id,String name)
	{
		this.id = id;
		this.name = name;
		listOfTasks = new HashSet<Integer>();
	}
	public int getId()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
	public HashSet<Integer> getListOfTasks()
	{
		return this.listOfTasks;
	}
}
