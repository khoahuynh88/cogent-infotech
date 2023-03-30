package pkg;
@FunctionalInterface
public interface InterfaceFunctional {
 // SAM - Single Abstract Method
	
	public void m1();
	
	default void m2() {};
	
	public static void m3() {};
	
}
