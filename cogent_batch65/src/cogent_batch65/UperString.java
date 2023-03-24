package cogent_batch65;

public class UperString {
	   
	public static void main(String[] args) {
		if (args.length >0) 
		{
			int length = args[0].length();
			
			String s = args[0];
			 System.out.println("String length" + length);
			 System.out.println("Upercase"+s.toUpperCase());
			 
			 String reverse = new String();
			 
			 for (int i= s.length() -1 ; i>=0; i--)
				 reverse +=s.charAt(i);
			 if (reverse.equalsIgnoreCase(s)   ) System.out.println("true");
			 else System.out.println("false");
		}

	}

}
