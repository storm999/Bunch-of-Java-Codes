package p1;

public class Main {

	public static void main(String[] args) {
		Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
		Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
		Shipment shipment3 = new Shipment();
		double vol;
		vol = shipment1.volume();
		System.out.println("Volume of shipment1 is " + vol);
		System.out.println("Weight of shipment1 is " + shipment1.weight);
		System.out.println("Shipping cost: $" + shipment1.cost);
		System.out.println();
		vol = shipment2.volume();
		System.out.println("Volume of shipment2 is " + vol);
		System.out.println("Weight of shipment2 is " + shipment2.weight);
		System.out.println("Shipping cost: $" + shipment2.cost);
		System.out.println();
		vol=shipment3.volume();
		System.out.println("Volume of shipment2 is " + vol);
		System.out.println("Weight of shipment2 is " + shipment3.weight);
		System.out.println("Shipping cost: $" + shipment3.cost);
	}
}
