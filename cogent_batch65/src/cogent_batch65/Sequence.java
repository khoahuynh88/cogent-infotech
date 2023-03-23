package cogent_batch65;

public class Sequence {
public static void main(String[] args) {
	
	int number1 = Integer.parseInt(args[0]);
	int number2 = Integer.parseInt(args[1]);
	
	System.out.println("number1: "+number1 + "  number2: "+ number2);
	
	
	 int f[] = new int[13 + 2];
	  
	  int i;
	
	  
	  f[0] = number1; f[1] = number2;
	  
	  for (i = 2; i <15; i++) {
	 
	  
	 f[i] = f[i - 1] + f[i - 2]; }
	  
	  for(int j =0; j<15;j++) {System.out.println(f[j]);}
	 
}
}
