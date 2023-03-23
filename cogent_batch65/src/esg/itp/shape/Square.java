package esg.itp.shape;

public class Square implements Polygon {
float side;
float area;
float perimeter;

public Square(float s) {

	this.side =s;
}

public void calcArea() {
	this.area = side*side;
	
	
}

public void calcPeri() {
	// TODO Auto-generated method stub
	this.perimeter =4*side;
}

public void display() {
	// TODO Auto-generated method stub
	System.out.println("Area"+ area);
	System.out.println("primeter" + perimeter);
	
}


}
