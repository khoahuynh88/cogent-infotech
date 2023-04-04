package w2e4;

public class Counter extends Thread{
        Storage st;

		public Counter(Storage st) {
			super();
			this.st = st;
			new Thread (this, "Counter").start();
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			int i =0;
			while (true && i<100) {
				st.setStore(i++);
			}
		}
        
        
}