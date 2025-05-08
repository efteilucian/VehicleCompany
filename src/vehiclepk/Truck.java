package vehiclepk;

public class Truck extends Vehicle{
	
	

	public Truck(double price, String manufacturer, String country) {
		super(price, manufacturer, country);
		
	}
	
	public double calculateRoadTAX() {
		return price *0.05;
	}
}
