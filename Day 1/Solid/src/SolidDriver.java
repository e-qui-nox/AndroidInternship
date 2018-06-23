
public class SolidDriver {
	public static void main(String args[]) {
		Sphere s1=new Sphere();
		Sphere s2=new Sphere(3);
		Cylinder c1=new Cylinder();
		Cylinder c2=new Cylinder(3,7);
		Cube r1=new Cube();
		Cube r2=new Cube(4);
		Cuboid l1=new Cuboid();
		Cuboid l2=new Cuboid(4,3,4);
		
		s1.setVolume();
		s1.setTSA();
		s1.setCSA();
		s2.setVolume();
		s2.setTSA();
		s2.setCSA();
		c1.setVolume();
		c1.setTSA();
		c1.setCSA();
		c2.setVolume();
		c2.setTSA();
		c2.setCSA();
		r1.setVolume();
		r1.setTSA();
		r1.setCSA();
		r2.setVolume();
		r2.setTSA();
		r2.setCSA();
		l1.setVolume();
		l1.setTSA();
		l1.setCSA();
		l2.setVolume();
		l2.setTSA();
		l2.setCSA();
		
		s1.getVolume();
		s1.getTSA();
		s1.getCSA();
		s2.getVolume();
		s2.getTSA();
		s2.getCSA();
		c1.getVolume();
		c1.getTSA();
		c1.getCSA();
		c2.getVolume();
		c2.getTSA();
		c2.getCSA();
		r1.getVolume();
		r1.getTSA();
		r1.getCSA();
		r2.getVolume();
		r2.getTSA();
		r2.getCSA();
		l1.getVolume();
		l1.getTSA();
		l1.getCSA();
		l2.getVolume();
		l2.getTSA();
		l2.getCSA();
		
		
	}
}
