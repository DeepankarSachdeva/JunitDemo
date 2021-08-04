import java.util.*;
public class TESTTOLLBOOTH {

	  public static void main(String [] args) {
	        // Create the tollbooth
	        TollBooth booth = new TollBooth();
	        // Now for some trucks
	        Truck truck1 = new Truck(5, 12500);
	        Truck truck2 = new Truck(2, 5000);
	        Truck truck3 = new Truck(6, 17000);

	        // Let's start collecting tolls!
	        booth.calculateToll(truck1);
	        booth.displayData();
	        booth.calculateToll(truck2);

	        // Time to collect the receipts
	        booth.onReceiptCollection();

	        // Here comes another truck
	        booth.calculateToll(truck2);
	        booth.displayData();
	    }
	}

	class TollBooth {
	    // Methods
	    TollBooth() {
	        trucksSinceCollection = 0;        // Clear out totals
	        receiptsSinceCollection = 0;
	    }
	    void calculateToll(Truck truck) {
	        int axles = truck.getAxles();
	        int totalWeight = truck.getTotalWeight();
	        int tollDue = 5*axles + 10*(totalWeight/1000);  // Toll calculation
	        System.out.print("Truck arrival - axles: ");
	        System.out.print(axles);
	        System.out.print(" total weight: ");
	        System.out.print(totalWeight);
	        System.out.print(" Toll due: ");
	        System.out.println(tollDue);
	        trucksSinceCollection = trucksSinceCollection + 1;
	        receiptsSinceCollection = receiptsSinceCollection + tollDue;
	    }
	    void onReceiptCollection() {
	        System.out.print("* Collecting receipts *");
	        displayData();
	        trucksSinceCollection = 0;      // Clear out totals
	        receiptsSinceCollection = 0;
	    }
	    void displayData() {
	        System.out.print("Totals since last collection - Receipts: ");
	        System.out.print(receiptsSinceCollection);
	        System.out.print(" Trucks: ");
	        System.out.println(trucksSinceCollection);
	    }
	    // Instance Variables
	    int receiptsSinceCollection;
	    int trucksSinceCollection;
	}

	class Truck {
	    // Methods
	    Truck(int axles, int totalWeight) {
	        this.axles = axles;
	        this.totalWeight = totalWeight;
	    }
	    int getAxles() {return axles;}
	    int getTotalWeight() {return totalWeight;}
	    // Instance Variables
	    int axles;
	    int totalWeight;
}
