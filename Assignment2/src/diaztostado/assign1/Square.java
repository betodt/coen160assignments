package diaztostado.assign1;

public class Square extends Rectangle {

	public Square() {
		super(0,0);
	}
	
	public Square(int side) {
		super(side, side);
	}

	public Square(int newLength, int newWidth) {
			super(newLength, newLength);
	}

}
