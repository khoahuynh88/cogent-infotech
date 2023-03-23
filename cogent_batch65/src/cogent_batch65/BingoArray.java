package cogent_batch65;

public class BingoArray {
	public static void main(String[] args) {
		
	
	int number1 = Integer.parseInt(args[0]);
	int number2 = Integer.parseInt(args[1]);
	
	System.out.println("number1: "+number1 + "  number2: "+ number2);
	

	int array[]= {1,2,3,4,5};
	boolean check1= false;
	boolean check2= false;
	for (int i=0; i<5; i++) {if(number1==array[i]) {check1=true;}}
	for (int i=0; i<5; i++) {if(number2==array[i]) {check2=true;}}
	
	if (check1==true && check2==true) {System.out.println("BINGO");}
}
}