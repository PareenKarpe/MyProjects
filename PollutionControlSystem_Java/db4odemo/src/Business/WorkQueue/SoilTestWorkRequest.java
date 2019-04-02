/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author cc130tx
 */
public class SoilTestWorkRequest extends WorkRequest {
    
    String location;
    String area;
    private String quantity;
    private Date date;
    
    //Pollutants for Lab Testing
    private double pvc;
    private double aluminium;
    private  double hydrocarbons;
    private  double ddt ;
    private  double pcbs;

    public double getPvc() {
        return pvc;
    }

    public void setPvc(double pvc) {
        this.pvc = pvc;
    }

    public double getAluminium() {
        return aluminium;
    }

    public void setAluminium(double aluminium) {
        this.aluminium = aluminium;
    }

    public double getHydrocarbons() {
        return hydrocarbons;
    }

    public void setHydrocarbons(double hydrocarbons) {
        this.hydrocarbons = hydrocarbons;
    }

    public double getDdt() {
        return ddt;
    }

    public void setDdt(double ddt) {
        this.ddt = ddt;
    }

    public double getPcbs() {
        return pcbs;
    }

    public void setPcbs(double pcbs) {
        this.pcbs = pcbs;
    }
    


    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
   @Override public String toString()

   {
       return this.getMessage();
   }
}
