
public class CarDriver {

	public static void main(String[] args) {
		Car car1=new Car();
		Car car2=new Car("Maruti",100000,"blue");
		Car car3=new Car("Audi");
		car1.CarDetails();
		car2.CarDetails();
		car3.setColor("white");
		car3.setPrice(10000);
		car2.setBrand("Audi");
		car3.CarDetails();
		String car2Colour = car2.getColor();
		System.out.println("The colour of Car2 is "+car2Colour);
		System.out.println("The price of Car3 is "+car3.getDiscount(15));
	}
}
