package vehiclepk;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = new Truck(50, "Man","Germany");
		vehicles[1] = new Bus(1000, "Iveco","Italy");
		vehicles[2] = new MiniBus(500,"Dacia","Romania");
		
		for(Vehicle v:vehicles) {
			System.out.println(v.toString());
		}
		
		Arrays.sort(vehicles);
		System.out.println("Sorted: \n");
		for(Vehicle v:vehicles) {
			System.out.println(v.toString());
		}

	}

}
