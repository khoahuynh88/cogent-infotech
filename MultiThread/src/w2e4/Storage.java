package w2e4;

public class Storage {
	int store;
	boolean valueSet = false;
	
	public synchronized int getStore() {
		while (!valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Got "+ store);
		valueSet =false;
		
		  try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
		 
		notify();
		return store;
	}

	public synchronized void setStore(int store) {
		while (valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		this.store =store;
		valueSet =true;
		System.out.println("set " +store);
		
		try { Thread.sleep(1000); } catch (InterruptedException e) {  e.printStackTrace(); }
		 
		notify();
	}
	
	

}
