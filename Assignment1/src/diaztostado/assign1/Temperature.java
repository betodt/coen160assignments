/**
 * Description of my project
 * @author Alberto Diaz
 * @version 1.0
 */

package diaztostado.assign1;

public class Temperature {
	private double degrees; //always faranheit
	
	/**
	 * constructor
	 * @return Temperature
	 */
	public Temperature() {
		this.degrees = 0;
	}
	
	/**
	 * constructor, takes degrees as parameter
	 * @param degrees degrees in faranheit
	 * @return 
	 */
	public Temperature(double degrees) {
		this.degrees = degrees;
	}
	
	/**
	 * setter
	 * @param double degrees
	 */
	public void setDegrees(double degrees) {
		this.degrees = degrees;
	}
	
	
	/**
	 * getter
	 * @return double degrees
	 */
	public double getDegrees() {
		return this.degrees;
	}
	
}

