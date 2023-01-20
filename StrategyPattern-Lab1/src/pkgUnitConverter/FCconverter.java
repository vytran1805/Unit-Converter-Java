// standard Algonquin header goes here.
package pkgUnitConverter;
/**
 * class to convert Fahrenheit to Celsius
 * @author kriger
 */
public class FCconverter {
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
	/**
	 * @param fahrenheit value in Fahrenheit to be converted
	 * @return equivalent in Celsius
	 */
	public double convert(double fahrenheit) {
		return (fahrenheit - convOrigin)/convFactor;
	}
}
