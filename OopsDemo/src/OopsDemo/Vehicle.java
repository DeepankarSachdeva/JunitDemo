package OopsDemo;

public class Vehicle {
	
	void drive()
	{
		System.out.println("Driving Vehicle");
	}

}


class car extends Vehicle
{

	@Override
	void drive() {
		super.drive();
		System.out.println("Driving Care");
	}
	
}

class Truck extends Vehicle
{

	@Override
	void drive() {
		super.drive();
		System.out.println("Driving Truck");
	}
	
	void load()
	{
		System.out.println("Loading The Truck");
	}
	
}