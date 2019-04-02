/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Analysis;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Anuja
 */
public class GenerateRequestID {
//    
//    Network network;
//    Enterprise enterprise;
    
    public static int counterMumbaiAir = 0;
    public static int counterMumbaiWater = 0;
    public static int counterMumbaiSoil = 0;
    
    public static int counterChennaiAir = 0;
    public static int counterChennaiWater = 0;
    public static int counterChennaiSoil = 0;
    
    public static int counterKolkataAir = 0;
    public static int counterKolkataWater = 0;
    public static int counterKolkataSoil = 0;
    
    public static int counterDelhiAir = 0;
    public static int counterDelhiWater = 0;
    public static int counterDelhiSoil = 0;
    
    String requestId = "";
    
    public String generateID(Enterprise enterprise, Network network, UserAccount userAccount){
        
        System.out.println("generateID Enterprise : "+enterprise);
        System.out.println("generateID Network : "+network);
//        System.out.println("generateID user : "+userAccount.getWorkQueue().getWorkRequestList());
        
        // Requestid of Mumbai        
        if(network.getName().equalsIgnoreCase("Mumbai") && enterprise.getName().equalsIgnoreCase("Air")){
            counterMumbaiAir++;
            requestId = "M"+"A"+counterMumbaiAir;
        }
        if(network.getName().equalsIgnoreCase("Mumbai") && enterprise.getName().contains("Water")){
            counterMumbaiWater++;
            requestId = "M"+"W"+counterMumbaiWater;
        }
        if(network.getName().equalsIgnoreCase("Mumbai") && enterprise.getName().equalsIgnoreCase("Soil")){
            counterMumbaiSoil++;
            requestId = "M"+"S"+counterMumbaiSoil;
        }
        
        // Requestid of Kolkata
        if(network.getName().equalsIgnoreCase("Kolkata") && enterprise.getName().equalsIgnoreCase("Air")){
            counterKolkataAir++;
            requestId = "K"+"A"+counterKolkataAir;
        }
        if(network.getName().equalsIgnoreCase("Kolkata") && enterprise.getName().equalsIgnoreCase("Water")){
            counterKolkataWater++;
            requestId = "K"+"W"+counterKolkataWater;
        }
        if(network.getName().equalsIgnoreCase("Kolkata") && enterprise.getName().equalsIgnoreCase("Soil")){
            counterKolkataSoil++;
            requestId = "K"+"S"+counterKolkataSoil;
        }
        
        
        // Requestid of Delhi 
        if(network.getName().equalsIgnoreCase("Delhi") && enterprise.getName().equalsIgnoreCase("Air")){
            counterDelhiAir++;
            requestId = "D"+"A"+counterDelhiAir;
        }
        if(network.getName().equalsIgnoreCase("Delhi") && enterprise.getName().equalsIgnoreCase("Water")){
            counterDelhiWater++;
            requestId = "D"+"W"+counterDelhiWater;
        }
        if(network.getName().equalsIgnoreCase("Delhi") && enterprise.getName().equalsIgnoreCase("Soil")){
            counterDelhiSoil++;
            requestId = "D"+"S"+counterDelhiSoil;
        }
        
        // Requestid of Chennai 
        if(network.getName().equalsIgnoreCase("Chennai") && enterprise.getName().equalsIgnoreCase("Air")){
            counterChennaiAir++;
            requestId = "C"+"A"+counterChennaiAir;
        }
        if(network.getName().equalsIgnoreCase("Chennai") && enterprise.getName().equalsIgnoreCase("Water")){
            counterChennaiWater++;
            requestId = "C"+"W"+counterChennaiWater;
        }
        if(network.getName().equalsIgnoreCase("Chennai") && enterprise.getName().equalsIgnoreCase("Soil")){
            counterChennaiSoil++;
            requestId = "C"+"S"+counterChennaiSoil;
        }
        
        return requestId;
    }
    
}
