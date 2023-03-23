package cogent_batch65;

import java.util.Scanner;

public class HelloWorld {
	public static void main (String[] args){
		/*System.out.println("Welcom to cogent infotech!!");
		
		byte b =100;
		int i =b;
		
		System.out.println(i);
		
		long l =i;
		System.out.println("l is =" +l);
		
		char ch='A';
		int x =ch;
		System.out.println("x is =" +x);*/
		
		/*int i =100;
		byte b=(byte) i;
		
		int x =97;
		char ch= (char) x;*/
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter an integer: ");

		int n = s.nextInt();
		
		for(int i=1; i<=n;i++){
			if(i%2==0){
			System.out.println(i);}
		}
	}
}
