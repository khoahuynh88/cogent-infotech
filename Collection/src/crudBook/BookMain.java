package crudBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in); 
		List <Book> list= new ArrayList<>();
		
		BookDAOImpl dao = new BookDAOImpl();
				  
				  int choice=0;
				  
				  do{ System.out.println("************Menu***************");
				  System.out.println("1-> Add book"); 
				  System.out.println("2-> Print book");
				  System.out.println("3-> Update book"); 
				  System.out.println("4-> Find book");
				  System.out.println("5-> Delete book");
				  System.out.println("6-> Exit");
				  System.out.println("Please enter your choice"); choice =sc.nextInt();
				  switch(choice){ case 1:
				  System.out.println("How many book you want to add"); 
				  int count =  sc.nextInt(); 
				  
				  for(int i=0; i<count;i++){
					  Book book = new Book();
					  System.out.println("Enter book id:");
						book.setBookId(sc.nextInt());
						System.out.println("Enter book name:");
						book.setBookName(sc.next());
						System.out.println("Enter book price:");
						book.setBookPrice(sc.nextDouble());
						
				  dao.createBook(list,book); } 
				  break;
				  
				  case 2:
						dao.printBook(list);
						break;
					case 3:
						System.out.println("Enter the product id you want to update");
						int id =sc.nextInt();
						dao.updateBook(list,id);
						break;
					case 4:
						System.out.println("Enter the product id you want to find");
						int i = sc.nextInt();
						dao.findBook(list,i);
						break;
					case 5:
						System.out.println("Enter the product id you want to delete");
						int did = sc.nextInt();
						dao.deleteBook(list,did);
						break;
					case 6:
						System.exit(0);
				}
					
				}
				while (choice!=6);
	}

	}
	
