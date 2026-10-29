package randomAccess;

public class User {
	int userID;
	String username;
	String passwd;
	
	public User() {}
	
	public User(int userID, String username, String passwd) {
		this.userID=userID;
		this.username=username;
		this.passwd=passwd;
	}
	
	public void show() {
		System.out.printf("UserID: %d Username: %-15s Passwd: %-25s\n", this.userID,this.username,this.passwd);
	}
	
}
