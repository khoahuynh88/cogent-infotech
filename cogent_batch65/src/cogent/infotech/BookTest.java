package cogent.infotech;

public class BookTest {
	
	
	public static void createBooks(Book[] b){
		Book book = new Book();
		book.setBookPrice(350);
		book.setBookTitle("Java");
		b[0]= book;
		Book book1 = new Book();
		book1.setBookPrice(200);
		book1.setBookTitle("C");
		b[1]=book1;
	}
	
	public static void showBooks(Book[] b){
		for (int i =0; i<2; i++){
			System.out.println("Title"+ b[i].getBookTitle() );
			System.out.println("Price"+ b[i].getBookPrice() );
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] books = new Book[2];
		createBooks(books);
		showBooks(books);
	}

}
