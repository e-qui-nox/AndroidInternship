
public class Cylinder extends Solid{
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
	
	public void setVolume() {
		volume= (float) (3.14*radius*radius*height);
	}
	
	public void setTSA() {
		tSa= (float) ((2*3.14*radius*radius)+(2*2.14*radius*height));
	}
	public void setCSA() {
		cSa= (float) (2*2.14*radius*height);
	}

}
