import java.util.HashSet;
public class User {
	private int id;
	private HashSet<Integer> ToDoLists;
	User(int id)
	{
		this.id = id;
		ToDoLists = new HashSet<Integer>();
	}
	public boolean searchToDoListByName(String searchString)
	{
		ToDoListMap td = new ToDoListMap();
		for(Integer i:this.ToDoLists)
		{
			if(td.getToDoList(i).getName() == searchString)
				return true;
		}
		return false;
	}
	void addElementIntoToDoLists()
	{
		ToDoLists.add(ToDoListMap.getLastAddingIndex());
	}
	public int getId()
	{
		return id;
	}
	public HashSet<Integer> getUserToDoLists()
	{
		return ToDoLists;
	}
}
