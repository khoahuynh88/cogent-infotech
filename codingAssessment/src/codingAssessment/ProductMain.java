package codingAssessment;

import java.util.Scanner;



public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		Product product[]= new Product[10];
		ProductDao dao = new ProductDao();
		
		int choice=0;
		
		do{
			System.out.println("************Menu***************");
			System.out.println("1-> Add product");
			System.out.println("2-> Print product");
			System.out.println("3-> Update product");
			System.out.println("4-> Delete product");
			System.out.println("5-> Exit");
			System.out.println("Please enter your choice");
			choice =sc.nextInt();
			switch(choice){
			case 1:
				
				product = new Product[10];
				for(int i=0; i<product.length;i++){
					dao.create(product, i);
				}
				break;
				
			case 2:
				dao.read(product);
				break;
			case 3:
				System.out.println("Enter the product id you want to update");
				int id =sc.nextInt();
				dao.update(product, id);
				break;
			case 4:
				System.out.println("Enter the product id you want to delete");
				int i = sc.nextInt();
				dao.delete(product, i);
				break;
			case 5:
				System.exit(0);
		}
			
		}
		while (choice!=5);
		
		

		
	}

}
