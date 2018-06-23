
public abstract class Shapes {
	protected float area;
	protected float perimeter;
	
	abstract void setArea();
	abstract void setPerimeter();
	
	public void getPerimeter() {
		System.out.println("The Perimeter is "+perimeter+"\n");
	}
	
	public void getArea() {
		System.out.println("The Area is "+area);
	}
}
