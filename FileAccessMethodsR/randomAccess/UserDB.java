package randomAccess;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class UserDB {
	public static final int USERIDSIZE = 4;
	public static final int USERNAMESIZE = 15;
	public static final int PASSWDSIZE = 25;
	User[] users = {new User(1001,"jsmith","pass123"),
			new User(1002,"jjones","pass123456"),
			new User(1003,"mwilson","p123"),
			new User(1004,"gbrandon","pass123567889"),
			new User(1005,"abrown","pass123!@#$%")};
	
	public void writeString(RandomAccessFile raFile,String str, int size) throws IOException {
				
	}
	
	public String readString(RandomAccessFile raFile,int size) throws IOException {
		return null;
	}
	
	public void writeRecord(RandomAccessFile raFile, User user, long location) throws IOException {
		
	}
	
	public User readRecord(RandomAccessFile raFile, long location) throws IOException {
		User user = new User();

		return user;
	}
	
	public void run() throws IOException {
		File file = new File("users.dat");
		RandomAccessFile raFile = new RandomAccessFile(file,"rw");

		
		raFile.close();
	}
	
	
}
