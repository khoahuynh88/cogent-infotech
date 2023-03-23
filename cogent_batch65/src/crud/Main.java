package crud;

import java.util.Scanner;

import cogent.infotech.Person;
import cogent.infotech.PersonDao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		Book book[]=null;
		BookDao dao = new BookDao();
		
		int choice=0;
		
		do{
			System.out.println("************Menu***************");
			System.out.println("1-> Add book");
			System.out.println("2-> Print book");
			System.out.println("3-> Update book");
			System.out.println("4-> Delete book");
			System.out.println("5-> Exit");
			System.out.println("Please enter your choice");
			choice =sc.nextInt();
			switch(choice){
			case 1:
				System.out.println("How many record you wnat to add");
				int count = sc.nextInt();
				book = new Book[count];
				for(int i=0; i<book.length;i++){
					dao.create(book, i);
				}
				break;
				
			case 2:
				dao.read(book);
				break;
			case 3:
				System.out.println("Enter the book id you want to update");
				int id =sc.nextInt();
				dao.update(book, id);
				break;
			case 4:
				System.out.println("Enter the book you want to delete");
				int i = sc.nextInt();
				dao.delete(book, i);
				break;
			case 5:
				System.exit(0);
		}
			
		}
		while (choice!=5);
		
		

		
		
	}
}
