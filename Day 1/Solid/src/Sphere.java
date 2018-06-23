
public class Sphere extends Solid{
	private int radius;
	public Sphere() {
		this.radius=5;
	}
	
	public Sphere(int radius) {
		this.radius=radius;
	}
	
	public void setVolume() {
		volume= (float) ((4/3)*3.14*radius*radius*radius);
	}
	
	public void  setTSA() {
		tSa= (float) (4*3.14*radius*radius);
	}
	public void  setCSA() {
		cSa= (float) (4*3.14*radius*radius);
	}
}