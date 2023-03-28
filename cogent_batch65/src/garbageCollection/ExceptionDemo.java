package garbageCollection;

import java.util.Scanner;


public class ExceptionDemo {
	

	public void message() 
	{
		System.out.println("Wish something");
	}
	
	public static void main(String[] args) {
		// Arimethic error
		  Scanner sc = new Scanner (System.in); System.out.println("Enter 2 number");
		  int x = sc.nextInt(); 
		  int y = sc.nextInt(); 
		 // int z= x/y;
		  
		  try {
			  int z= x/y;
			  System.out.println(z);
		  }catch(ArithmeticException e) {
			  System.out.println("Divide by 0 is not allow " + e);
			  
		  }
		  System.out.println("Welcome");
		 System.out.println();
		 System.out.println();
		
		// Out of Bounds exception
		String names[]= {"a","a1","a3"};
		try {
		 System.out.println(names[10]);
		}catch (ArrayIndexOutOfBoundsException e) {System.out.println("there is no index 10 in array "+ e);}
		System.out.println();
		System.out.println();
		
		//Null pointer exception
		ExceptionDemo demo =null; 
		try {
		 demo.message();
		}catch(NullPointerException e) {System.out.println("Null pointer exception "+e);}
		
		
	}
}
