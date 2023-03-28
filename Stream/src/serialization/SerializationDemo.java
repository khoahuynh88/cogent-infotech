package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		try {
			fos=new FileOutputStream("d://streams//Emp.ser");
			oos = new ObjectOutputStream(fos);
			Employee emp = new Employee(1, "Jhon", 1000, 12345);
			oos.writeObject(emp);
			System.out.println("Objec serialization");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
