package stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;

public class CharacterStreamDemo {
 public static void main(String[] args) {
	 String source = args[0];
	 String dest = args[1];
	 int ch=0;
	FileReader fr =null;
	FileWriter fw =null;
	String ans;
	Scanner sc = new Scanner (System.in);
	try {
		fr =new FileReader(dest);
		System.out.println("Would you like to ovwrite th file");
		ans = sc.next();
		if (ans.equalsIgnoreCase("Yes"))
		 ch =1;
		 } catch (FileNotFoundException e) {ch =1;}
		 finally {
			 try {fw.close();}catch (Exception e) {}
		 }		
	        
		 
		
	try {
		fr =new FileReader(source);
		fw =new FileWriter(dest);
		int h;
		while ((h=fr.read())!=-1 && ch==1) {fw.write(h);}
		fr.close();
		fw.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}
}
