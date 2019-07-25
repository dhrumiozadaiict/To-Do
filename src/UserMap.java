import java.util.HashMap;
public class UserMap {
	private static final HashMap<Integer,User> IDTOUSERMAP;
	static {
		IDTOUSERMAP = new HashMap<Integer,User>();
		IDTOUSERMAP.put(1,new User(1));
		IDTOUSERMAP.put(2,new User(2));
		IDTOUSERMAP.put(3,new User(3));
		IDTOUSERMAP.put(4,new User(4));
	}
	static User getUserFromId(int id)
	{
		return IDTOUSERMAP.get(id);
	}
}
