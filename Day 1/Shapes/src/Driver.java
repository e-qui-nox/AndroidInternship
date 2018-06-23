

public class Driver {
	public static void main(String args[]) {
	Circle c1=new Circle();
	Circle c2=new Circle(3);
	Square s1=new Square();
	Square s2=new Square(7);
	Rectangle r1=new Rectangle();
	Rectangle r2=new Rectangle(4,3);
	
	c1.setArea();
	c1.setPerimeter();
	c2.setArea();
	c2.setPerimeter();
	s1.setArea();
	s1.setPerimeter();
	s2.setArea();
	s2.setPerimeter();
	r1.setArea();
	r1.setPerimeter();
	r2.setArea();
	r2.setPerimeter();
	
	
	c1.getArea();
	c1.getPerimeter();
	c2.getArea();
	c2.getPerimeter();
	s1.getArea();
	s1.getPerimeter();
	s2.getArea();
	s2.getPerimeter();
	r1.getArea();
	r1.getPerimeter();
	r2.getArea();
	r2.getPerimeter();
	}
}
