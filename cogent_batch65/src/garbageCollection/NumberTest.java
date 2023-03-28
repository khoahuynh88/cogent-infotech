package garbageCollection;

import java.util.Scanner;



public class NumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice=0;
		Scanner sc =new Scanner (System.in);
		
		Number number = new Number();
		System.out.println("Enter your first number");
		int x =sc.nextInt();
		System.out.println("Enter your second number");
		int y = sc.nextInt();
		
		number = new Number(x,y);
		
		 do{ System.out.println("************Menu***************");
		  System.out.println("1-> Add "); 
		  System.out.println("2-> Sub");
		  System.out.println("3-> Mul"); 
		  System.out.println("4-> Div");
		  System.out.println("5-> Exit");
		  System.out.println("Please enter your choice"); choice =sc.nextInt();
		 switch(choice){
		 case 1:
			 number.add();
			 break;
		  
		 case 2: 
			 number.sub();
			 break;
		 case 3: 
			 number.mul();
			 break;
		 case 4:
			
			 number.div();
			 break;}
		 } while (choice!=5);
	

	
	}
}