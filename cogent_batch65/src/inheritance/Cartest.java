package inheritance;

public class Cartest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.setNoOfGear(5);
		c.setSpeed(30);
		c.display();
		c.drive();
	
		
		SportCar c1= new SportCar();
		c1.setNoOfGear(4);
		c1.setSpeed(30);
		c1.setAirBallonType("Big");
		c1.display();
	}

}
