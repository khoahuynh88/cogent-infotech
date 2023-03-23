package inheritance;

public class SportCar extends Car {
String AirBallonType;

public String getAirBallonType() {
	return AirBallonType;
}

public void setAirBallonType(String airBallonType) {
	AirBallonType = airBallonType;
}

@Override
public void display() {
	// TODO Auto-generated method stub
	super.display();
	System.out.println("The Air Ballon Type is" + AirBallonType);
}



}
