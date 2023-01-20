//standard Algonquin header here
package pkgUnitConverter;

import pkgUnitConverter.*;
/**
 * simple class to test 2 classes for converting Fahrenheit to Celsius and the reverse
 * @author kriger
 */
public class UnitConverterTest {

    /**
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
		FCconverter FtoC = new FCconverter();
		System.out.printf("%5.2f in Fahrenheit is %5.2f Celsius\n", 70.0, FtoC.convert(70.0));
		
		CFconverter CtoF = new CFconverter();
		System.out.printf("%5.2f in Celsius is %5.2f Fahrenheit\n", 20.0, CtoF.convert(20.0));
		
	}

}
