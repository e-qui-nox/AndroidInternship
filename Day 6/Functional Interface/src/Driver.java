
public class Driver implements MyFunctionalInterface{
	
	public void saySomething() {
		System.out.println("Have a Wonderful Day");
	}
	public static void main(String []args) {
		//lambda ->
		//just the (......) since only one method followed by -> then implementation
		MyFunctionalInterface anotherInterface = () -> System.out.println("Warm Greetings");
		anotherInterface.saySomething();
		
		MyFunctionalInterface myInterface =new MyFunctionalInterface() {
			public void saySomething() {
				System.out.println("Good Morning");
			}
		};
		myInterface.saySomething();
		
		System.out.println("\n---------------------\n");
		Driver driver= new Driver();
		driver.saySomething();
	
	}
}
