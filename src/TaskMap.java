import java.util.HashMap;
public class TaskMap {
	private static HashMap<Integer,String> idtotaskmap;
	String getToDoList(int id)
	{
		return idtotaskmap.get(id);
	}
}
