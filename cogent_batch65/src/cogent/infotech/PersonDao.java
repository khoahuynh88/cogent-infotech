package cogent.infotech;

import java.util.Scanner;

public class PersonDao {
	Scanner sc =new Scanner (System.in);
	
	public void create (Person person[],int i){
		Person p= new Person();
		person[i]=p;
		System.out.println("Person id:");
		person[i].setPersonID(sc.nextInt());
	}
	
	public void read(Person person[]){
		
		for(Person p:person){
			System.out.println("Person ID is :" +p.getPersonID());
			System.out.println("Person Name is :" +p.getPersonName());
			System.out.println("Person Address is :" +p.getPersonAddress());
		}
		
	}

	
}

