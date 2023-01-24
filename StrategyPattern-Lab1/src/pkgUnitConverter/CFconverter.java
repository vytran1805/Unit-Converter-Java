// standard Algonquin header goes here.
package pkgUnitConverter;
/**
 * class to convert Celsius to Fahrenheit
 * @author kriger
 */
public class CFconverter implements Converter{
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
	/**
	 * @param celsius value in Celsius to be converted
	 * @return equivalent in Fahrenheit
	 */
        @Override
	public double convert(double celsius) {
		return celsius*convFactor + convOrigin;
	}
}
