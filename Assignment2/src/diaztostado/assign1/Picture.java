package diaztostado.assign1;

public class Picture {
	private int length;
	private int width;
	
	public Picture () {
		this.length = 0;
		this.width = 0;
	}
	
	public Picture (int newLength, int newWidth) {
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
}
