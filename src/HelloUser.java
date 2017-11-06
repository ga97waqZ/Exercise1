
public class HelloUser {
	private String userName;
	
	public HelloUser(String username) {
		this.userName = userName;
	}
	
	public void greetUser() {
		System.out.println("Hello " + userName + "!");
	}
}
