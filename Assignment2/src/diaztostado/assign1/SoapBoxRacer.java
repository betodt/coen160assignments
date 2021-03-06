package diaztostado.assign1;

public class SoapBoxRacer {
	private Box boxType;
	private Wheel wheelType;

	public SoapBoxRacer() {
		this.boxType = new Box();
		this.wheelType = new Wheel();
	}
	
	public SoapBoxRacer(Box box, Wheel wheel) {
		this.boxType = box;
		this.wheelType = wheel;
	}
	
	public Box getBox() {
		return this.boxType;
	}
	
	public Wheel getWheel() {
		return this.wheelType;
	}
	
	public void setBox(Box box) {
		this.boxType = box;
	}
	
	public void setWheel(Wheel wheel) {
		this.wheelType = wheel;
	}
	
	public String toString() {		
		return "This racer has " + this.wheelType.getMaterial() + " wheels and a " + this.boxType.getMaterial() + " box.";		
	}

}
