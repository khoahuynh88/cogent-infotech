package cogent_batch65;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		 Book book[]=new Book[5];
		 
		 Scanner sc= new Scanner (System.in);
		 for(int i=0; i<book.length; i++) {
			 
			 Book b1= new Book();
			 System.out.println("Enter the book no:");
			 b1.setBookId(sc.nextInt());
			 System.out.println("Enter the book name:");
			 b1.setBookName(sc.next());
			 System.out.println("Enter the book price:");
			 b1.setBookPrice(sc.nextInt());
			 System.out.println("Enter the book author:");
			 b1.setBookAuthor(sc.next());
			 book[i]=b1;
		 }
		 
		 for(int j=0; j<book.length;j++){
			 System.out.println("Book no is:" + book[j].getBookId());
			 System.out.println("Book name is:" + book[j].getBookName());
			 System.out.println("Book price is:" + book[j].getBookPrice());
			 System.out.println("Book author is:" + book[j].getBookAuthor());
			 System.out.println();
		 }
}
}