package crudBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookDAOImpl implements BookDAO {
	//List <Book> list= new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void createBook(List <Book> list, Book book) {
		list.add(book);
	} 
		
		
			
			
	

	@Override
	public void updateBook(List <Book> list,int id) {
		boolean found = false;
		Iterator<Book> itr = list.iterator();
		while (itr.hasNext()) {
			Book b = (Book) itr.next();
			if (b.getBookId() == id) {
				found = true;
				System.out.println("Enter new name: ");
				b.setBookName(sc.next());
				System.out.println("Enter new price: ");
				b.setBookPrice(sc.nextDouble());
			}
		}
		if (!found)
			System.out.println("Not found book");
		
	}

	@Override
	public void deleteBook(List <Book> list,int id) {
		Book b= null;
		for (Book book : list) {
			if (book.getBookId()== id) {b=book;}
		}
		if (b == null) {System.out.println("Invalid");}
		else {list.remove(b);
		System.out.println("Remove book");}
		
	}

	@Override
	public void findBook(List <Book> list,int id) {
		boolean found = false;
		Iterator<Book> itr = list.iterator();
		while (itr.hasNext()) {
			Book b = (Book) itr.next();
			if (b.getBookId() == id) {
				found = true;
				System.out.println("Found book id: " + id);
				System.out.println("Book Name: " + b.getBookName());
				System.out.println("Book Price: $" + b.getBookPrice());
			}
		}
		if (!found)
			System.out.println("Not found book");
		
		
		
	}
	public boolean chekBook(List <Book> list,int id) {
		for (Book book : list) {
			if (book.getBookId()==id) {return true;}
			
		}return false;
		
	}
	@Override
	public void printBook(List <Book> list) {
		
		if (list.isEmpty()) {
			System.out.println("There is no book");
		}
		for (Book book : list) {
			System.out.println(book.toString());
		}
	}

	

}
