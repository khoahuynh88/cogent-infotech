package pkg;

interface MyInterface {
	public static void m1 (){
		System.out.println("I am new");
		}
	default void m3 () {System.out.println("This is default m3");}
}
public class Main implements MyInterface {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		MyInterface.m1();
	}

	

}
