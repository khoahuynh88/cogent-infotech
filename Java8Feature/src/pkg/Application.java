package pkg;

interface MyInterfaceA {
	public int square(int x);
}

/*
 * class MyClass implements MyInterfaceA{
 * 
 * @Override public int sum(int a, int b) { // TODO Auto-generated method stub
 * return a+b; }}
 */

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * MyClass mc = new MyClass();
		 * 
		 * int x = mc.sum(100,200); System.out.println("Sum is: "+ x);
		 */
		
		
		MyInterfaceA mi =(a) -> a*a;
		
		System.out.println(mi.square(5));
		
	}

}
