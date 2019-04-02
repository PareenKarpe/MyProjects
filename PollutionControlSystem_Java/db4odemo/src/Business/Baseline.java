/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author paree
 */
public class Baseline {

    //AIR
    public final double baseAirCarbonM = 40;
    public final double baseAirSulphurO = 50;
    public final double baseAirRspm = 60;
    public final double baseAirNitrogenO = 70;
    public final double baseAirOzone = 50;
    
    //SOIL
    public final double basePVC = 30;
    public final double baseAluminium = 40;
    public final double baseHydrocarbons = 40;
    public final double baseDDT = 30 ;
    public final double basePCBS = 50;
    
    //WATER
    public final double baseLead = 15;
    public final double baseMercury = 10;
    public final double baseCrude = 20;
    public final double basePlastic= 30;
    public final double baseUranium = 20;

    //WATER
    public double getBaseLead() {
        return baseLead;
    }

    public double getBaseMercury() {
        return baseMercury;
    }

    public double getBaseCrude() {
        return baseCrude;
    }

    public double getBasePlastic() {
        return basePlastic;
    }

    public double getBaseUranium() {
        return baseUranium;
    }

    //SOIL
    public double getBasePVC() {
        return basePVC;
    }

    public double getBaseAluminium() {
        return baseAluminium;
    }

    public double getBaseHydrocarbons() {
        return baseHydrocarbons;
    }

    public double getBaseDDT() {
        return baseDDT;
    }

    public double getBasePCBS() {
        return basePCBS;
    }
    
   //AIR
    public double getBaseAirCarbonM() {
        return baseAirCarbonM;
    }

    public double getBaseAirSulphurO() {
        return baseAirSulphurO;
    }

    public double getBaseAirRspm() {
        return baseAirRspm;
    }

    public double getBaseAirNitrogenO() {
        return baseAirNitrogenO;
    }

    public double getBaseAirOzone() {
        return baseAirOzone;
    }

}
