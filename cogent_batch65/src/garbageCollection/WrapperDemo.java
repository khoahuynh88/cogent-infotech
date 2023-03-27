package garbageCollection;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int x=100;//primitive Integer y= Integer.valueOf(x);//Boxing
		 * 
		 * int z =y.intValue();//Un-boxing
		 */		
		
		/*
		 * byte x =100;
		 * 
		 * String s = Byte.toString(x);
		 * 
		 * byte h = Byte.parseByte(s);
		 */
		
		boolean b1 = false;
		byte b2 = 0;
		char b3 = 0;
		float b4 = 0;
		int b5 = 0;
		long b6 = 0;
		short b7 = 0;
		double b8 = 0;
		
		Boolean a1 = Boolean.valueOf(b1);
		boolean c1 = a1.booleanValue();
		
		Byte a2 = Byte.valueOf(b2);
		byte c2=a2.byteValue();
		
		Character a3 = Character.valueOf(b3);
		char c3=a3.charValue();
		
		Float a4 = Float.valueOf(b4);
		float c4 = a4.floatValue();
		
		Integer a5 = Integer.valueOf(b5) ;
		int c5 = a5.intValue();
		
		Long a6= Long.valueOf(b6);
		long c6= a6.longValue();
		
		Short a7= Short.valueOf(b7);
		short c7= a7.shortValue();
		
		Double a8 = Double.valueOf(b8);
		double c8 = a8.doubleValue();
		
	}

}
