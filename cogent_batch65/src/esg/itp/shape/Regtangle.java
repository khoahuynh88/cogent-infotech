package esg.itp.shape;

public class Regtangle implements Polygon {
float length;
float breadth;
float area;
float perimeter;
public Regtangle(int len, int bred) {
	
	 this.length= len;
	 this.breadth= bred;
}
public void calcArea() {
	// TODO Auto-generated method stub
	area = length*breadth;
}
public void calcPeri() {
	// TODO Auto-generated method stub
	perimeter= 2*(length+breadth);
	
}
public void display() {
	// TODO Auto-generated method stub
	System.out.println("Rec Area"+ area);
	System.out.println("REc primeter" + perimeter);
}



}
