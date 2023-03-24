package codingAssessment;

import java.util.Scanner;



public class ProductDao {

	Scanner sc = new Scanner(System.in);

	public void create(Product[] product, int i) {
		// TODO Auto-generated method stub
		Product b = new Product();
		product[i]=b;
		System.out.println("Enter book id:");
		product[i].setProductId(sc.nextInt());
		System.out.println("Enter book name:");
		product[i].setProductName(sc.next());
		System.out.println("Enter book price as integer:");
		product[i].setProductPrice(sc.nextInt());
	}
	
	public void read( Product[] product)
	{
		for(Product b:product){
			if(b== null){continue;}
		System.out.println("Book id: " + b.getProductId());
		System.out.println("Book name: " + b.getProductName());
		System.out.println("Book price: " + b.getProductPrice());
		}
	}
	
	public void update(Product[] product, int id)
	{
		
		for (int i=0;i<product.length;i++){
			
			//System.out.println(product[i].getProductId());
			if (product[i].getProductId()== id){
				System.out.println("Enter book name:");
				product[i].setProductName(sc.next());
				System.out.println("Enter book price:");
				product[i].setProductPrice(sc.nextInt());
			}
		}
	}
	
	public void delete(Product[] product, int id)
	{
		for (int i=0;i<product.length;i++){
			
			//System.out.println(product[i].getProductId());
			if (product[i].getProductId()== id){
				product[i]=null;
			}
	}
	}
}
