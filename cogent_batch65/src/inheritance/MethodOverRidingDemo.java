package inheritance;

public class MethodOverRidingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p;
		
		p=new Parents();
		p.behavior();
		
		p=new Children();
		p.behavior();
		
		p=new Wife();
		p.behavior();
		
		p=new Colleagues();
		p.behavior();
	}

}
