package cogent.multithreading;

class MyThread extends Thread{
	
	MyThread (){
		super ("Dmo Thread");
		System.out.println("The child thread :" + this);
		start();
	}
	public void run() {
		for (int i=5; i>0;i--) {
			System.out.println("Child thread" +i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Exiting child thread");
	}
}
public class Main {
	public static void main(String[] args) {
		new MyThread();
		for (int i=5; i>0;i--) {
			System.out.println("Main thread" +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Exiting Main thread");
}
}