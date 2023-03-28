package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SaveSerial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age =0;
		int rollNum =0;
		String name ="";
		String address="";
		Scanner sc =new Scanner (System.in);
		FileOutputStream fos;
		ObjectOutputStream oos;
		int i=1;
		try {
			fos=new FileOutputStream("d://streams//User.ser");
			oos = new ObjectOutputStream(fos);
		while(i!=-1) {
		System.out.println("Do you want to write the data in file");
		String ans= sc.next();
		
		if (ans.equalsIgnoreCase("yes")) {
			System.out.println("Enter User age");
			age= sc.nextInt();
			System.out.println("Enter User roll numer");
			rollNum = sc.nextInt();
			System.out.println("Enter User name");
			name = sc.next();
			System.out.println("Enter User address");
			address = sc.next();
			User user = new User(age, rollNum, name, address);
	
			
			
			oos.writeObject(user);
			System.out.println("Objec serialization");
		
		}
		else {
			System.out.println("program exit");
			System.exit(0);
		}
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}}


