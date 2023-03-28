package garbageCollection;

import java.util.Scanner;

class IllegalArgumentException extends Exception{
	public IllegalArgumentException(String message) {
		super (message);
		// TODO Auto-generated constructor stub
	}
}

public class CalcAverage {
 public double avgFirstN(int N) throws IllegalArgumentException {
	 if (N<0) throw new IllegalArgumentException("This is not natural number");
	 
	 double avg =0;
	 int sum =0;
	 sum =N*(N+1)/2;
	 avg = (double) sum/N;
	 return avg;
 }
 
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a natural number");
	int n = sc.nextInt();
	
	CalcAverage cal = new CalcAverage();
	
	try {
	System.out.println(cal.avgFirstN(n));}
	
	catch (IllegalArgumentException e) {
		System.out.println(e.getMessage());
	}
}
}
