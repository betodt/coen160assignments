/**
 * Description of my project
 * @author Alberto Diaz
 * @version 1.0
 */

package diaztostado.assign1;

public class Assign1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//test cases for question 1
		System.out.format("%nQuestion 1:%n%n");
		
		//create new Temperature instance
		Temperature t1 = new Temperature();
		
		//print out current temperature
		System.out.format("Current temperature is: %.1f F%n", t1.getDegrees());
		
		//Update the temperature to 90 degrees
		t1.setDegrees(90.0);
		
		//print out new temperature
		System.out.format("Current temperature is: %.1f F%n", t1.getDegrees());
		
		//create second temperature instance
		Temperature t2 = new Temperature();
		
		//print out second temperature instance degrees
		System.out.format("Current temperature is: %.1f F%n", t2.getDegrees());
		
		//test case for Thermostat in question 2
		System.out.format("%nQuestion 2:%n%n");
		
		Thermostat th1 = new Thermostat();
		th1.displayFahrenheit();
		th1.displayCelsius();
		
		th1.setTemperatureC(21.0);
		th1.displayFahrenheit();
		th1.displayCelsius();
		
		Thermostat th2 = new Thermostat(130.0);
		th2.setTemperatureF(67.0);
		th2.displayFahrenheit();
		th2.displayCelsius();
		
		Thermostat th3 = new Thermostat(20.0);
		th3.increaseF(60.0);
		th3.displayFahrenheit();
		th3.displayCelsius();
		th3.increaseC(5.0);
		th3.displayFahrenheit();
		th3.displayCelsius();
	
	}

}
