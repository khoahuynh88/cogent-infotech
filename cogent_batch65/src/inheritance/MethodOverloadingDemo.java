package inheritance;

class Calculator
{
	public void add(int a, int b)
	{
		int result = a+b;
		System.out.println("Sum of two integer is: " +result);
	}
	
	public void add(float a , float b)
	{
		float result = a+b;
		System.out.println("Sum of two fload is: " +result);
	}
	
	public void add(String a , String b)
	{
		String result = a+b;
		System.out.println("Sum of two fload is: " +result);
	}
}

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		
		calc.add(100, 200);
		calc.add(1.25f, 0.75f);
		calc.add("Khoa", "Huynh");
	}

}
