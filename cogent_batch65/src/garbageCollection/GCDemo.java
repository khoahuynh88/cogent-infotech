package garbageCollection;

public class GCDemo {
	int ob;
	GCDemo (int ob){
		this.ob = ob;
		System.out.println("Create: " +this.ob);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i =1 ; i<1000; i++) 
		{
			new GCDemo(i);
			//System.gc();
		}
	}
	protected void finalize() throws Throwable {
		System.out.println("Finalized:" + this.ob);
	}
}
