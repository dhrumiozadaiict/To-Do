public class MainClass {
	public static void main(String[] args) {
		while(!Login.isLoggedIn())
		{
			Login.LoginUser(getId(),getpassword());
		}
	}
}
