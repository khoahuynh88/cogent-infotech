package stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
 public static void main(String[] args) {
	FileInputStream fis =null;
	FileOutputStream fos = null;
	
	try {
		fis = new FileInputStream("d://streams//employee.txt");
		fos= new FileOutputStream("d://streams//newemployee.txt");
		
		int data;
		while((data=fis.read())!=-1) {
			fos.write(data);
		}
		System.out.println("File coped seccessfully!!");
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			fis.close();
			fos.close();
		}catch (IOException io) {System.out.println(io);}
	}
}
}
