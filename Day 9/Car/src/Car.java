
public class Car {
	private String carName;
	private int fuelCapacity;
	
	public Car(int fuelCapacity,String carName) {
		this.carName = carName;
		this.fuelCapacity = fuelCapacity;
	}
	
	public void drive(int distance) throws CarOutOfFuelException {
		if(fuelCapacity > 0 && fuelCapacity > distance) {
			System.out.println("I am Driving "+carName);
		}
		else {
			throw new CarOutOfFuelException("Not enough Fuel !!");
		}
		fuelCapacity -= distance;
		
	}
	
}
