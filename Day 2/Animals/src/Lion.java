
public class Lion extends Animals{
	
	
	//Overloading
	public void animalSays(String saySomething,int age) {
		System.out.println("Roar !!");
	}
	public void animalSays(String saySomething,int age,boolean alive) {
		System.out.println(saySomething+" "+age+" "+alive);
	}
	
	//Override
	@Override
	public void printAnimal() {
		System.out.println("Lion !!\n");
	}
	
	public static void main(String[] args) {
		Lion lion=new Lion();
		
		//Overridden method 
		lion.printAnimal();
		
		//Overloaded method
		lion.animalSays("Yahoo!!!!");
		lion.animalSays("I am Old",1000);
		lion.animalSays("Ha",99,true);
	}
}
