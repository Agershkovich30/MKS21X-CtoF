public class CtoFTester{
  /*Questions:
  1) The parameters should be the temperature of the undesired for,
  so that it can be converted. So for celsiusToFahrenheit,
  the temperature should be entered in celsius form, but in
  fahrenheitToCelsius, it should have the Fahrenheit temperature
  as the parameter.
  2) The function should have doubles as parameters
  because they make the most sense as inputs, as integers,
  the only other comprable idea only allows certain inputs,
  and not as much specificity.
  3) The functions should return a double type of the temperature given
  in the other form of it, so Celsius to Fahrenheit and vice versa.
  */

public static double celsiusToFahrenheit(double tempInC) {
  return (tempInC * (9.0/5) + 32);
}
public static double fahrenheitToCelsius(double tempInF) {
  return ((tempInF- 32) * (5.0/9));
}
public static void main (String[] args){
System.out.println (celsiusToFahrenheit(30) + ", expecting 86.0");
System.out.println (celsiusToFahrenheit(45) + ", expecting 113.0");
System.out.println (celsiusToFahrenheit(22) + ", expecting 71.6");
System.out.println (celsiusToFahrenheit(10) + ", expecting 50.0");
System.out.println (fahrenheitToCelsius(212) + ", expecting 100.0");
System.out.println (fahrenheitToCelsius(120) + ", expecting 48.8889");
System.out.println (fahrenheitToCelsius(87) + ", expecting 30.5555");
System.out.println (fahrenheitToCelsius(96) + ", expecting 35.555");
}
}
