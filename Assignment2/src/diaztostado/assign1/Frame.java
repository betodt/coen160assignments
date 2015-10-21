package diaztostado.assign1;

public class Frame extends Rectangle{
	private String material;
	
	public Frame() {
		super(0,0);
		this.material = "";
	}	
	
	public Frame(int length, int width, String material) {
		super(length, width);
		this.material = material;
	}
	
	public String getMaterial() {
		return this.material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
}
