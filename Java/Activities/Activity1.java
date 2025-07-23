package activities;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car carName = new Car();
		carName.make = 2014;
		carName.color = "Black";
		carName.transmission = "Manual";
		
		//Call the car class methods
		carName.displayCharacteristics();
		carName.accelarate();
		carName.brake();
		
	}

}
