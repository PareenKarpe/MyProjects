/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AlertQueue;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import java.util.ArrayList;

/**
 *
 * @author cc130tx
 */
public class AlertQueue {
    
    private ArrayList<AlertList> alertList; 
    
    public AlertQueue() {
        alertList = new ArrayList();
    }
    
    public ArrayList<AlertList> getAlertList() {
        return alertList;
    }

    public void setAlertList(ArrayList<AlertList> alertList) {
        this.alertList = alertList;
    }   

}
