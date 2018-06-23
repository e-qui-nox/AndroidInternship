class Parent{
	int number =1001;
	String name="Yamuna";
	int rollNo= 17358;
}
public class ParentChild extends Parent {
	int number =1002;
	String name="Yami";
	int rollNo= 17280;
	
	public void numberPrint() {
		System.out.println("Parent "+super.number);
		System.out.println("Parent "+super.name);
		System.out.println("Parent "+super.rollNo);
	}
	
	public static void main(String[] args) {
		ParentChild parentChild=new ParentChild();
		parentChild.numberPrint();
		System.out.println("\nChild "+parentChild.number);
		System.out.println("Child "+parentChild.name);
		System.out.println("Child "+parentChild.rollNo);
		
	}
}
