

import esg.itp.shape.Regtangle;
import esg.itp.shape.Square;



public class PolygonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square(5f);	
		System.out.println("Square display");
		s.calcArea();
		s.calcPeri();
		s.display();
		

		Regtangle r = new Regtangle(3, 4);
		System.out.println("Rec display");
		r.calcArea();
		r.calcPeri();
		r.display();
		

	}

}
