package inheritance;

public class Car {
int speed;
int noOfGear;

public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public int getNoOfGear() {
	return noOfGear;
}
public void setNoOfGear(int noOfGear) {
	this.noOfGear = noOfGear;
}

public void drive(){
	speed =20;
	noOfGear=1;
	System.out.println("Car run with speed "+ speed+ " miles/h and gear "+ noOfGear);
}

public void display(){
	System.out.println("Speed: "+ speed+ " gear "+ noOfGear);
}
}
