package diaztostado.assign1;

public class Cylinder extends Circle {
	private int height;

	public Cylinder() {
		super(0);
		height = 0;
	}

	public Cylinder(int newRadius, int newHeight) {
		super(newRadius);
		this.height = newHeight;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}

	public int Volume() {
		return (this.Area() * height);
	}
	
	public String toString() {
		return "This cylinder is " + this.getHeight() + " tall and has a volume of " + this.Volume();		
	}
}
