
public class Cuboid extends Solid{
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
	
	public void setVolume() {
		volume= (float) (length*breadth*height);
	}
	
	public void setTSA() {
		tSa= (float) (2*((length*breadth)+(breadth*height)+(height*length)));
	}
	public void setCSA() {
		cSa= (float) (2*height*(length+breadth));
	}

}

