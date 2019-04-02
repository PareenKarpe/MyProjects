/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author Anuja
 */
public class WaterTestingWorkRequest extends WorkRequest{
    
    private double leadReading;
    private double mercuryReading;
    private double crudeOilReading;
    private double plasticReading;
    private double uraniumReading;
    private String location;
    private Date testRecordDate;
    private String quantity;
    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    
    public double getLeadReading() {
        return leadReading;
    }

    public void setLeadReading(double leadReading) {
        this.leadReading = leadReading;
    }

    public double getMercuryReading() {
        return mercuryReading;
    }

    public void setMercuryReading(double mercuryReading) {
        this.mercuryReading = mercuryReading;
    }

    public double getCrudeOilReading() {
        return crudeOilReading;
    }

    public void setCrudeOilReading(double crudeOilReading) {
        this.crudeOilReading = crudeOilReading;
    }

    public double getPlasticReading() {
        return plasticReading;
    }

    public void setPlasticReading(double plasticReading) {
        this.plasticReading = plasticReading;
    }

    public double getUraniumReading() {
        return uraniumReading;
    }

    public void setUraniumReading(double uraniumReading) {
        this.uraniumReading = uraniumReading;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getTestRecordDate() {
        return testRecordDate;
    }

    public void setTestRecordDate(Date testRecordDate) {
        this.testRecordDate = testRecordDate;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    
    
    
}
