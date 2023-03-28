package cogent.multithreading;

public class MultiThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThread mt = new MultiThread();
		mt.setPriority(MAX_PRIORITY);
		mt.setName("Thread1");
		mt.start();
		
		
		MultiThread mt1 = new MultiThread();
		mt1.setPriority(MIN_PRIORITY);
		mt1.setName("Thread2");
		mt1.start();
	}

	public void run() {
		System.out.println("Thread name"+Thread.currentThread().getName());
	}
}
