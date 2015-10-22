package diaztostado.assign1;

public class Circle {
	private int radius;
	
	public Circle() {
		this.radius = 0;
	}
	
	public Circle(int newRadius) {
		this.radius = newRadius;
	}
	
	public void setRadius(int newRadius) {
		this.radius = newRadius;
	}
	
	public int getRadius() { 
		return this.radius;
	}
	public int Area() {
		return (int) (Math.PI * Math.pow(this.radius, 2));
	}
}
