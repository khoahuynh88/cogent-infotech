package inheritance;

import java.util.Scanner;

public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medicine mearry[]= new Medicine[2];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<mearry.length;i++ ){
		System.out.println("Please enter the medecine type 1 2 3");
		int type = sc.nextInt();
		
		switch(type){
		case 1:
			Tablet t = new Tablet();
			t.setmAddress("TX");
			mearry[i]=t;
			break;
		case 2:
			Syrup s = new Syrup();
			s.setmAddress("TX-1");
			mearry[i]=s;
		case 3:
			Ointment o = new Ointment();
			o.setmAddress("TX-2");
			mearry[i]=o;
			}
		}
		
		for (int i=0; i<mearry.length;i++ ){mearry[i].displayLabel();}	
	}

}
