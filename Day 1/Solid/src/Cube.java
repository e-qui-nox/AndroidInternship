public class Cube  extends Solid{
	private int side;
	
	public Cube() {
		this.side=5;
	}
	
	public Cube(int side) {
		this.side=side;
	}
	
	public void setVolume() {
		volume= (float) (side*side*side);
	}
	
	public void setTSA() {
		tSa= (float) (6*side*side);
	}
	public void setCSA() {
		cSa= (float) (4*side*side);
	}
}