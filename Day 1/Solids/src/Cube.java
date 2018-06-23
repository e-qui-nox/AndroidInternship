
public class Cube  extends Solids{
	private int side;
	
	public Cube() {
		this.side=5;
	}
	
	public Cube(int side) {
		this.side=side;
	}
	
	public float setVolume() {
		return (float) (side*side*side);
	}
	
	public float setTSA() {
		return (float) (6*side*side);
	}
	public float setCSA() {
		return (float) (4*side*side);
	}
}

