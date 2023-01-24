/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgUnitConverter;

/**
 *
 * @author VyTran
 */
public class KgToPoundConverter implements Converter{
    private final double conFactor = 2.2046;
    @Override
    public double convert(double kilograms){
        return kilograms*conFactor;
    }
    
}
