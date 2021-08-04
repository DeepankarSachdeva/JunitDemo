package OopsDemo;
// Dynamic polymorphism
public class TestVechica {

	public static void main(String[] args) {
		
		Vehicle vobj=new Vehicle();
		vobj.drive();
		
		Vehicle vcar=new car();
		vcar.drive();
		
		Vehicle vTruck=new Truck();
		vTruck.drive();
	}

}
