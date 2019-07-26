import java.util.HashMap;
import java.util.Map;
public class ToDoListMap {
	private static HashMap<Integer,ToDoList> idtotodolistmap = new HashMap<Integer,ToDoList>();
	private static int newAddingIndex = 1;
	ToDoList getToDoList(int id)
	{
		return idtotodolistmap.get(id);
	}
	public void addElementIntoToDoListMap(String name)
	{
		ToDoList newToDoList = new ToDoList(newAddingIndex,name);
		idtotodolistmap.put(newAddingIndex,newToDoList);
		UpdateAddingIndex();
	}
	public void UpdateAddingIndex()
	{
		newAddingIndex++;
	}
	public static int getLastAddingIndex()
	{
		return newAddingIndex-1;
	}
	public void print()
	{
		for(Map.Entry<Integer,ToDoList> entry : idtotodolistmap.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
