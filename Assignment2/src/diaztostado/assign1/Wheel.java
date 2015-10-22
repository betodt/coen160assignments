package diaztostado.assign1;

public class Wheel extends Cylinder {
	private String material;

	public Wheel() {
		super(0,0);
		this.material = "";
	}

	public Wheel(int newRadius, int newHeight, String material) {
		super(newRadius, newHeight);
		this.material = material;
	}
	
	public String getMaterial() {
		return this.material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String toString() {		
		return "This wheel is made of " + this.getMaterial() + ", and has a volume of " + this.Volume();		
	}

}
