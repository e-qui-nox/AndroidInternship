
public class Cylinder extends Solids{
	private int radius;
	private int height;
	
	public Cylinder() {
		this.radius=5;
		this.height=10;
	}
	
	public Cylinder(int radius,int height) {
		this.radius=radius;
		this.height=height;
	}
	
	public float setVolume() {
		return (float) (3.14*radius*radius*height);
	}
	
	public float setTSA() {
		return (float) ((2*3.14*radius*radius)+(2*2.14*radius*height));
	}
	public float setCSA() {
		return (float) (2*2.14*radius*height);
	}

}
