
public class Sphere extends Solids{
	private int radius;
	public Sphere() {
		this.radius=5;
	}
	
	public Sphere(int radius) {
		this.radius=radius;
	}
	
	public float setVolume() {
		return (float) ((4/3)*3.14*radius*radius*radius);
	}
	
	public float setTSA() {
		return (float) (4*3.14*radius*radius);
	}
	public float setCSA() {
		return (float) (4*3.14*radius*radius);
	}
}
