package inheritance;

public class Ointment extends Medicine{

	@Override
	public void displayLabel() {
		// TODO Auto-generated method stub
		super.displayLabel();
		System.out.println("for external use only");
	}

}
