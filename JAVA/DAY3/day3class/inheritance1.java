package day3java;
class Vehicle{
	void noOfEngine() {
	System.out.println("I have one Engine");
}
}

class TwoWheeler extends Vehicle{
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}
class Bike extends TwoWheeler{
	void brandName() {
		System.out.println("Brand Name is Honda");
	}
}
class Scooty extends TwoWheeler{
	void brandName() {
		System.out.println("Brand Name is Activa");
	}
}

class Cycle extends TwoWheeler{
	void brandName() {
		System.out.println("Brand Name is herocycle");
	}
}

public class inheritance1 {
	public static void main (String []args ) {
		Bike bike =new Bike();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();
	
		
		Scooty scooty =new Scooty();
		scooty.noOfEngine();
		scooty.noOfWheels();
		scooty.brandName();
		
		Cycle cycle =new Cycle();
		cycle.noOfEngine();
		cycle.noOfWheels();
		cycle.brandName();
	}

}
