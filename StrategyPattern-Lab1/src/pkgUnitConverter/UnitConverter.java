/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgUnitConverter;

/**
 *
 * @author VyTran
 */
public class UnitConverter {
    
    private Converter unitType;
    /**
     * no-args constructor initializes Converter behavior/strategy to that of a
     * FCconverter
     */
    public UnitConverter(){
        this.unitType = new FCconverter();
    }
    /**
     * 
     * @param type 
     */
    public void setUnitType(Converter type){
        this.unitType = type;
    }
    
    public double convert(double unit){
        return unitType.convert(unit);
    }
}
