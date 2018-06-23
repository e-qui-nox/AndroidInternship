
public class Driver {
	public static void main(String[] args) {
		
		StaticExample.printSomethingAgain();
		System.out.println("-------");
		
		//for non-static methods
		StaticExample example = new StaticExample();
		example.printSomething();
	}
}
