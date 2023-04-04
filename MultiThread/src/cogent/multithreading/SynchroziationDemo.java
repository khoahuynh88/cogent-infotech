package cogent.multithreading;

public class SynchroziationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayMessage dm = new DisplayMessage();
		
		MyThread2 t1 = new MyThread2(dm, "Steve");
		MyThread2 t2 = new MyThread2(dm, "Mark");
		
		t1.start();
		t2.start();
 	}

}
