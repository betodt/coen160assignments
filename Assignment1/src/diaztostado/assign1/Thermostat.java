/**
 * Description of my project
 * @author Alberto Diaz
 * @version 1.0
 */
package diaztostado.assign1;

public class Thermostat {
	private Temperature currentTemperature;
	private final double LOWER_LIMIT = 30.0;
	private final double UPPER_LIMIT = 120.0;
	
	/**
	 * converts a degree value from celsius to farenheit
	 * @param degreesC
	 * @return
	 */
	private double toFarenheit(double degreesC) {
		return degreesC * (9.0/5.0) + 32.0;
	}
	
	private boolean inLimit(double degrees) {
		boolean valid = (degrees > UPPER_LIMIT) ? false : (degrees < LOWER_LIMIT) ? false : true;
		
		if(valid == false)
			System.out.format("Your value, %.1f F, is invalid. Please enter a value between " + LOWER_LIMIT + " and " + UPPER_LIMIT + ".%n", degrees);
		
		return valid;
	}
	
	/**
	 * Converts degree value to Farenheit
	 * @param degreesF
	 * @return
	 */
	private double toCelsius(double degreesF) {
		return ((degreesF - 32.0) * (5.0/9.0));
	}
	
	/**
	 * Default Constructor
	 */
	public Thermostat() {
		currentTemperature = new Temperature(32);
	}
	
	/**
	 * Constructor
	 */
	public Thermostat(double degrees) {
		if(inLimit(degrees))
			currentTemperature = new Temperature(degrees);
		else
			currentTemperature = new Temperature(32.0);
	}
	
	/**
	 * Takes degrees in Faranheit and sets the data member
	 * @param double degreesF
	 */
	public void setTemperatureF(double degreesF) {
		if(inLimit(degreesF))
			currentTemperature.setDegrees(degreesF);
	}
	
	/**
	 * sets the data value to degreesC after converting to farenheit
	 * @param degreesC
	 */
	public void setTemperatureC(double degreesC) {
		if(inLimit(toFarenheit(degreesC)))
			currentTemperature.setDegrees(toFarenheit(degreesC));
	}
	
	/**
	 * Displays current temperature in Farenheit
	 */
	public void displayFahrenheit() {
		System.out.format("Current temperature is: %.1f F%n", currentTemperature.getDegrees());
	}
	
	/**
	 * Displays current temperature in Celsius
	 */
	public void displayCelsius() {
		System.out.format("Current temperature is: %.1f C%n", toCelsius(currentTemperature.getDegrees()));
	}
	
	/**
	 * reduces degrees in farenheit
	 * @param double degrees
	 */
	public void reduceF(double degrees) {
		if(inLimit(degrees))
			currentTemperature.setDegrees(currentTemperature.getDegrees() - degrees);
	}
	
	/**
	 * reduces degrees in celsius
	 * @param double degrees
	 */
	public void reduceC(double degrees) {
		if(inLimit(toFarenheit(degrees)))
			currentTemperature.setDegrees(toFarenheit(toCelsius(currentTemperature.getDegrees()) - degrees));
	}
	
	/**
	 * increases degrees in Farenheit
	 * @param double degrees
	 */
	public void increaseF(double degrees) {
		if(inLimit(degrees))
			currentTemperature.setDegrees(currentTemperature.getDegrees() + degrees);
	}
	
	/**
	 * increases degrees in Celsius 
	 * @param double degrees
	 */
	public void increaseC(double degrees) {
		if(inLimit(toFarenheit(degrees)))
			currentTemperature.setDegrees(toFarenheit(toCelsius(currentTemperature.getDegrees()) + degrees));
	}
}
