
public class Car {
	
	//data types
	private String brand;
	private int price;
	private String color;
	
	//constructors
	
	public Car() {
		//default constructor
		
	}
	
	public Car(String brand, int price, String color) {
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	
	public Car(String b) {
		//when the arguments passed is not the same as the variable declared we no need to use this.
		brand=b;
	}
	
	//methods
	public String getBrand() {
		return brand;	
	}
	public int getPrice() {
		return price;	
	}
	public String getColor() {
		return color;	
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setColor(String color) {
		this.color=color;
	}

	public void setCar(String brand, int price, String color) {
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	
	public float getDiscount(int discount){
		float cost=((float)discount/100)*price;
		return price-cost;
	}
	
	public void CarDetails() {
		System.out.println("The brand of the Car is "+ getBrand()+ ", color is "+getColor()+ " and the price is "+ getPrice());
	}
}
