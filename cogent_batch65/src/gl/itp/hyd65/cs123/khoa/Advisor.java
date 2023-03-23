package gl.itp.hyd65.cs123.khoa;

import java.util.Random;

public class Advisor {
String[] message = new String [5];

public  Advisor(){
	message[0]="advice 1";
	message[1]="advice 2";
	message[2]="advice 3";
	message[3]="advice 4";
	message[4]="advice 5";
}

public void getAdvice(){
	Random random = new Random();
	int r = random.nextInt(4);
	System.out.println(message[r]);
}


}
