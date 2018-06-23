import java.util.Scanner;
 
public class TakeInput {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String name=userInput.nextLine();
		String lastName=userInput.next();
		System.out.println("My name is "+name+" "+lastName);
		userInput.nextLine();
		int age=userInput.nextInt();
		System.out.println("I am "+age+" years old\n");
		System.out.println("Enter a double");
		double variable =userInput.nextDouble();
		System.out.println("The entered Double is "+variable);
		userInput.close();
	}
}
