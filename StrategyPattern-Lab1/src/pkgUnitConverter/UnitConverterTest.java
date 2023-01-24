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
        /**
         * Creating UnitConverter object
         */
        UnitConverter unit = new UnitConverter();
	System.out.printf("%5.2f in Fahrenheit is %5.2f Celsius\n", 70.0, unit.convert(70.0));
	
        
	unit.setUnitType(new CFconverter());
        System.out.printf("%5.2f in Celsius is %5.2f Fahrenheit\n", 20.0, unit.convert(20.0));
        
        unit.setUnitType(new KgToPoundConverter());
        System.out.printf("%5.2f in Kilograms is %5.2f Pounds\n", 56.0, unit.convert(56.0));
	
        unit.setUnitType(new PoundToKgConverter());
        System.out.printf("%5.2f in Kilograms is %5.2f Pounds\n", 125.0, unit.convert(125.0));
	}

}
