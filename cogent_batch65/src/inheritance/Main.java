package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book();
		b.setAuthor("A");
		b.setTitle("AB");
		b.setPrice(3.5);
		
		
		Magazine m= new Magazine();
		m.setTitle("M");
		m.setIssue("FEb .20,2022");
		m.setPrice(1.2);
		
		b.sell(5);
		m.sell(23);
	}

}



