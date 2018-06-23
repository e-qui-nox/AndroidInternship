
public class SuperDemo extends SuperExample{

	public SuperDemo() {
		super();//by default it will be called but it will not happen if we are passing arguments and cannot be used in static
		System.out.println("Child constructor");
	}
	
	@Override //to achieve run time polymorphism
	public void printSomething() {
		System.out.println("Method in Child class");
		super.printSomething();//to call the exact method that was defined in the superClass 
	}
	
	public static void main(String[] args) {
		SuperDemo superDemo = new SuperDemo();
		superDemo.printSomething();
		
	}
}
