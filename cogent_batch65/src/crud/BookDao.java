package crud;

import java.util.Scanner;

public class BookDao {
Scanner sc = new Scanner(System.in);

	public void create(Book[] book, int i) {
		// TODO Auto-generated method stub
		Book b = new Book();
		book[i]=b;
		System.out.println("Enter book id:");
		book[i].setBookId(sc.nextInt());
		System.out.println("Enter book name:");
		book[i].setBookName(sc.next());
		System.out.println("Enter book price:");
		book[i].setBookPrice(sc.nextInt());
	}
	
	public void read( Book[] book)
	{
		for(Book b:book){
			if(b== null){continue;}
		System.out.println("Book id: " + b.getBookId());
		System.out.println("Book name: " + b.getBookName());
		System.out.println("Book price: " + b.getBookPrice());
		}
	}
	
	public void update(Book[] book, int id)
	{
		//Book b = new Book();
		//System.out.println("This is book update");
		for (int i=0;i<book.length;i++){
			//book[i]=b;
			System.out.println(book[i].getBookId());
			if (book[i].getBookId()== id){
				System.out.println("Enter book name:");
				book[i].setBookName(sc.next());
				System.out.println("Enter book price:");
				book[i].setBookPrice(sc.nextInt());
			}
		}
	}
	
	public void delete(Book[] book, int i)
	{
		//Book b = new Book();
		book[i]=null;
		//book[i].setBookId(0);
		//book[i].setBookName("");
		//book[i].setBookPrice(0);
	}

	
}
