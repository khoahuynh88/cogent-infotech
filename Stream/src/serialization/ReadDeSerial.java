package serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadDeSerial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("d://streams//User.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			try{for(;;) {
			Object obj = ois.readObject();
			User user = (User) obj;
			System.out.println("User age "+ user.age);
			System.out.println("User roll number "+ user.rollNum);
			System.out.println("User name "+ user.name);
			System.out.println("User address "+ user.address);}
			}catch (EOFException e) {System.out.println("Sucessfull");}
			fis.close();
			ois.close();
	
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	

}
}
