package vehiclepk;

public abstract class Vehicle implements CalculationTaxes,Comparable<Vehicle>{
	protected double price;
	private String manufacturer;
	private String country;
	
	
	public Vehicle(double price, String manufacturer,String country) {
		this.price = price;
		this.manufacturer = manufacturer;
		this.country = country;
	}
	
	@Override
	public double calculateVAT() {
	
		return price * 0.19;
	}
	
	
	@Override
	public double calculateRoadTax() {
	
		return 0;
		
	}
	
	@Override
	public int compareTo(Vehicle v) {
		
		double t1 =this.calculateTotal();
		double t2 =v.calculateTotal();
		if(t1>t2) return -1;
		else if(t1<t2) return 1;
		return (int) (this.price - v.price);
	}
	
	
	@Override
	public double calculateCustomDuty() {
		if(country.equalsIgnoreCase("Romania")) {
			return 0;
		}else {
			return price *0.01;
		}
	}
	
	
	@Override
	public double calculateTotal() {
		return calculateVAT() +calculateRoadTax() + calculateCustomDuty(); 
	
	}
	
	public String toString() {
		var sb = new StringBuffer();
		sb.append(this.getClass().getSimpleName());
		sb.append(" \n");
		sb.append("Price: "+this.price);
		sb.append("\n");
		sb.append("Manufacturer: "+this.manufacturer);
		sb.append("\n");
		sb.append("Country: "+this.country);
		sb.append("\n");
		sb.append("With the total price: " + calculateTotal());
		sb.append("\n");
		
		return sb.toString();
		
	}
}
