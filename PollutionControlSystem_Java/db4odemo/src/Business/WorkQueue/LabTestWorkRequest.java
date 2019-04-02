/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author raunak
 */
public class LabTestWorkRequest extends WorkRequest{
    
    private double resultAirCarbonM;
    private double resultAirSulphurO;
    private  double resultAirRspm;
    private  double resultAirNitrogenO ;
    private  double resultAirOzone;
    String Location;

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }
    
    
    
    public double getResultAirRspm() {
        return resultAirRspm;
    }

    public void setResultAirRspm(double resultAirRspm) {
        this.resultAirRspm = resultAirRspm;
    }

    public double getResultAirNitrogenO() {
        return resultAirNitrogenO;
    }

    public void setResultAirNitrogenO(double resultAirNitrogenO) {
        this.resultAirNitrogenO = resultAirNitrogenO;
    }

    public double getResultAirOzone() {
        return resultAirOzone;
    }

    public void setResultAirOzone(double resultAirOzone) {
        this.resultAirOzone = resultAirOzone;
    }
   

    public double getResultAirCarbonM() {
        return resultAirCarbonM;
    }

    public void setResultAirCarbonM(double resultAirCarbonM) {
        this.resultAirCarbonM = resultAirCarbonM;
    }

    public double getResultAirSulphurO() {
        return resultAirSulphurO;
    }

    public void setResultAirSulphurO(double resultAirSulphurO) {
        this.resultAirSulphurO = resultAirSulphurO;
    }

   
   @Override public String toString()

   {
       return this.getMessage();
   }
   
    
    
}
