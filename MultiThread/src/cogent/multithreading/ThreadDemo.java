package cogent.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MythreadCreate thr1= new MythreadCreate();
thr1.setPriority(Thread.MAX_PRIORITY);
Thread t1 = new Thread(thr1);
t1.start();

MythreadCreate thr2= new MythreadCreate();
thr2.setPriority(5);
Thread t2 = new Thread(thr2);
t2.start();
	}

}

