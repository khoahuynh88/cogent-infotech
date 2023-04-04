package pkg;

public class Mythread extends Thread {
	int total;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Child thread is calculatint the sum");
		synchronized (this) {
			for (int i = 1; i <= 100; i++) {
				total += i;
			}
			this.notify();
		}
	}

}
