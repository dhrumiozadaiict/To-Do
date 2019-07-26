import java.util.HashMap;
public class UserMap {
	private static HashMap<Integer,User> idtousermap;
	static {
		idtousermap = new HashMap<Integer,User>();
		idtousermap.put(1,new User(1));
		idtousermap.put(2,new User(2));
		idtousermap.put(3,new User(3));
		idtousermap.put(4,new User(4));
	}
	User getUserFromId(int id)
	{
		return idtousermap.get(id);
	}
}
