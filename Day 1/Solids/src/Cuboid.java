
public class Cuboid extends Solids{
	private int length;
	private int breadth;
	private int height;
	
	public Cuboid() {
		this.length=5;
		this.breadth=10;
		this.height=3;
	}
	
	public Cuboid(int length,int breadth,int height) {
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	
	public float setVolume() {
		return (float) (length*breadth*height);
	}
	
	public float setTSA() {
		return (float) (2*((length*breadth)+(breadth*height)+(height*length)));
	}
	public float setCSA() {
		return (float) (2*height*(length+breadth));
	}

}

