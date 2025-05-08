package vehiclepk;

public class MiniBus extends Vehicle{

	public MiniBus(double price, String manufacturer, String country) {
		super(price, manufacturer, country);
		
	}
	
	public double calculateRoadTAX() {
		return price *0.03;
	}
}
