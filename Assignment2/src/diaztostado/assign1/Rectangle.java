package diaztostado.assign1;

public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle() {
		this.length = 0;
		this.width = 0;
	}
	
	public Rectangle (int newLength, int newWidth) {
		this.length = newLength;
		this.width = newWidth;
	}
	
	public int getLength() {
		return this.length;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public void setLength(int newLength) {
		this.length = newLength;
	}
	
	public void setWidth(int newWidth) {
		this.width = newWidth;
	}
	
	public int Area() {
		return this.length * this.width;
	}
}
