
public class TigerCub extends Tiger{
	@Override
	public SomeChildClass animalSays() {
		System.out.println("Meow !!!");//can access only immediate parent not the grant parents
		return new Integer();
	}
	//Covariant return type
}
