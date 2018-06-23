
public abstract class Solid {
	protected float volume;
	protected float tSa;
	protected float cSa;
	
	abstract void setVolume();
	abstract void setTSA();
	abstract void setCSA();
	
	public void getVolume() {
		System.out.println("The Volume is "+volume);
	}
	public void getTSA() {
		System.out.println("The TSA is "+tSa);
	}
	public void getCSA() {
		System.out.println("The CSA is "+cSa+"\n");
	}
}
