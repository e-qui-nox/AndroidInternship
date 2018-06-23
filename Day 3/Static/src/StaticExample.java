
public class StaticExample {
	
	private static String string = "Hello";
	private int number = 123;
	
	public static void printSomethingAgain() {
		System.out.println("A static method");
	}
	
	public void printSomething() {
		printSomethingAgain();
		System.out.print("haha"+" some string "+string);
		System.out.println("Some number "+number);
	}
}
