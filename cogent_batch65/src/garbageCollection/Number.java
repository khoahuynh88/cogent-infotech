package garbageCollection;

public class Number {
	int firstNumber;
	int secondNumber;
	double result;
	
	
	public Number() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Number(int firstNumber, int secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	
	
public int getSecondNumber() {
		return secondNumber;
	}



	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}



public void add () {
		result = firstNumber + secondNumber;
      }

public void sub () {
	result = firstNumber - secondNumber;
}


public void mul () {
	result = firstNumber * secondNumber;
}

public void div () {
	try {
	result = firstNumber / secondNumber;}
	catch (ArithmeticException e) {System.out.println("divide by zero");}
}

}

