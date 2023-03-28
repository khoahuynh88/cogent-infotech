package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class DeSerialization {
public static void main(String[] args) {
	
	try {
		FileInputStream fis = new FileInputStream("d://streams//Emp.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Employee emp = (Employee) obj;
		System.out.println("Emp id "+ emp.id);
		fis.close();
		ois.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
