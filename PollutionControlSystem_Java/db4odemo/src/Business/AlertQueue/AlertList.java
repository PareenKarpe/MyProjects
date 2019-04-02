/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AlertQueue;

import Business.Enterprise.Enterprise;
import Business.Network.Network;

/**
 *
 * @author cc130tx
 */
public class AlertList {

  
    private String message;
    private Enterprise enterprise;
    private Network network;
    private String sender;
    private String status;
 
public void setmessage(String message)
{
    this.message = message;
}
public String getMessage() {
        return message;
    }
    public Enterprise getEnterprise() {
        return enterprise;
    }
    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    @Override
    public String toString() {
        return sender;
    }
    
}
