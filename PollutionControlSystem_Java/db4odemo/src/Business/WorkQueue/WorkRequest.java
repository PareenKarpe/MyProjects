/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Solutions;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author raunak
 */
public abstract class WorkRequest {

    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private String statusLab;
    private Solutions solution;
    private String solutionProvider;

   

    private Date requestDate;
    private Date resolveDate;
    private String senderEnterprise; // Added by anuja
     private Enterprise enterprise;
    private UserAccount useraccount;
    private Network network;

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public UserAccount getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(UserAccount useraccount) {
        this.useraccount = useraccount;
    }
    
    
    public WorkRequest(){
        requestDate = new Date();
        solution = new Solutions();
      //  enterprise = new Enterprise();
    }

    public Solutions getSolution() {
        return solution;
    }

    public void setSolution(Solutions solution) {
        this.solution = solution;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }
 public String getSolutionProvider() {
        return solutionProvider;
    }

    public void setSolutionProvider(String solutionProvider) {
        this.solutionProvider = solutionProvider;
    }
    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

	// Added by Anuja
    public String getSenderEnterprise() {
        return senderEnterprise;
    }

    public void setSenderEnterprise(String senderEnterprise) {
        this.senderEnterprise = senderEnterprise;
    }

    public String getStatusLab() {
        return statusLab;
    }

    public void setStatusLab(String statusLab) {
        this.statusLab = statusLab;
    }
    
    @Override
    public String toString(){
        return message;
    }
    
    
}
