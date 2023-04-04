package w2e4;

public class Printer extends Thread{

	Storage st;
	
    public Printer(Storage st){
        this.st = st;
        new Thread(this, "Printer").start();
    }
    @Override
    public void run() {
        while(true){
            st.getStore();
        }

}
}