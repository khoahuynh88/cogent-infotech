package garbageCollection;

class Arithmetic{
	
	public void dividion(int x , int y) throws Exception
	{
		int z=x/y;
		System.err.println(z);
	}
}

public class MultipleException {
	public static void main(String[] args) {
		
		
		try {
			String input = args[0];
			System.out.println("Input is: " + input);
			
			int output = Integer.parseInt(input);
			System.out.println("Output is " + output);
			
			new Arithmetic().dividion(500, 0);
			
			
		}
		/*catch (ArrayIndexOutOfBoundsException e) 
		{System.out.println(""+e);}
		
		catch (NumberFormatException e) 
		{System.out.println(""+e);}*/
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {System.out.println("finally will work in both cases ");}
		
		System.out.println("This is after the try catch");
	}
}
