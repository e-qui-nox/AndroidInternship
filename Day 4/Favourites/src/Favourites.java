//Abstract class(class)- well defined-can be extended only once
//interface - many times
//Interface
//1-> All methods are public and abstract by default
//2-> All variables are public static final.//final- the values cannot be changed....we cannot override
//3-> All the abstract methods defined in an interface NEED to be implemented 
//4-> default; static(java 8 and above); private(private only in java 9+)
//public class SomeClass extends ParentClass implements A,B,C{		}

public interface Favourites {
	
	public abstract void favouriteFruit();
	void favouriteIceCream();//by default its public(access modifier)
	//these two methods are abstract....by default it will assume it to be abstract...the keyword is not neccessary
	public void favouriteMovie();
	abstract void favouriteSubject();
}
