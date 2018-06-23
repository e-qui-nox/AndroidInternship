
public class SolidsDriver {
	public static void main(String args[]) {
		Sphere s1=new Sphere();
		Sphere s2=new Sphere(3);
		Cylinder c1=new Cylinder();
		Cylinder c2=new Cylinder(3,7);
		Cube r1=new Cube();
		Cube r2=new Cube(4);
		Cuboid l1=new Cuboid();
		Cuboid l2=new Cuboid(4,3,4);
		
		//Sphere
		System.out.println("Sphere\n");
		System.out.println("Default Constructor");
		System.out.println("The Volume : "+s1.setVolume());
		System.out.println("The TSA : "+s1.setTSA());
		System.out.println("The CSA : "+s1.setCSA());
		System.out.println("Constructor with Arguments Passed");
		System.out.println("The Volume : "+s2.setVolume());
		System.out.println("The TSA : "+s2.setTSA());
		System.out.println("The CSA : "+s2.setCSA()+"\n");
		
		//Cylinder
		System.out.println("Cylinder\n");
		System.out.println("Default Constructor");
		System.out.println("The Volume : "+c1.setVolume());
		System.out.println("The TSA : "+c1.setTSA());
		System.out.println("The CSA : "+c1.setCSA());
		System.out.println("Constructor with Arguments Passed");
		System.out.println("The Volume : "+c2.setVolume());
		System.out.println("The TSA : "+c2.setTSA());
		System.out.println("  The CSA : "+c2.setCSA()+"\n");
		
		//Cube
		System.out.println("Cube\n");
		System.out.println("Default Constructor");
		System.out.println("The Volume : "+r1.setVolume());
		System.out.println(" The TSA : "+r1.setTSA());
		System.out.println("  The LSA : "+r1.setCSA());
		System.out.println("Constructor with Arguments Passed");
		System.out.println("The Volume : "+r2.setVolume());
		System.out.println(" The TSA : "+r2.setTSA());
		System.out.println("  The LSA : "+r2.setCSA()+"\n");
		
		//Cuboid
		System.out.println("Cuboid\n");
		System.out.println("Default Constructor");
		System.out.println("The Volume : "+l1.setVolume());
		System.out.println(" The TSA : "+l1.setTSA());
		System.out.println("  The LSA : "+l1.setCSA());
		System.out.println("Constructor with Arguments Passed");
		System.out.println("The Volume : "+l2.setVolume());
		System.out.println(" The TSA : "+l2.setTSA());
		System.out.println("  The LSA : "+l2.setCSA()+"\n");
		
	}
}

	