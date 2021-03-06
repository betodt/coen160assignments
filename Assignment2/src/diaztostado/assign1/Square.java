package diaztostado.assign1;

public class Square {
	private Rectangle square;

	public Square() {
		this.square = new Rectangle();
	}
	
	public Square(int side) {
		this.square = new Rectangle(side, side);
	}
	
	public int getSide() {
		return this.square.getLength();
	}
	
	public void setSide(int side) {
		this.square.setLength(side);
		this.square.setWidth(side);
	}

	public int Area() {
		return this.square.Area();
	}
	
	public String toString() {
		return "This square is " + this.square.getLength() + " long on each side and has an area of " + this.square.Area();		
	}
}
