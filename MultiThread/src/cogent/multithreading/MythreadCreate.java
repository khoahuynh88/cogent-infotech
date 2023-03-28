package cogent.multithreading;

public class MythreadCreate extends Thread {
	public void run() {
		for (int i=5; i>0;i--) {
			System.out.println("Thread name"+Thread.currentThread().getName()+" " +i);}
		}
}
