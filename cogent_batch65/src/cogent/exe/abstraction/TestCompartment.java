package cogent.exe.abstraction;

import java.util.Random;

public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment []c = new Compartment [10];
		
		Random random= new Random();
		Compartment temp;
		int choice;
		
		for (int i=0; i<10; i++){
			choice = random.nextInt(4)+1;
			
			if (choice ==1){c[i]= new FirstClass();}
			else if (choice ==2){c[i]= new General();}
			else if (choice ==3){c[i]= new Ladies();}
			else if (choice ==4){c[i]= new Luggage();}
			c[i].notice();
		}
		
	}

}
