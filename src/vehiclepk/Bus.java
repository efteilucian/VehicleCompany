package vehiclepk;

public class Bus extends Vehicle{

	public Bus(double price, String manufacturer, String country) {
		super(price, manufacturer, country);
		
	}

	public double calculateRoadTAX() {
		return price *0.04;
	}
}
