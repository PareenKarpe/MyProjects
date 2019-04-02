/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Locations;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import java.util.ArrayList;

/**
 *
 * @author Anuja
 */
public class PopulateLocations {
    
    private Network network;
    private Enterprise enterprise;
    private ArrayList airLocatios;
    private ArrayList waterLocationsIndustryList;
    private ArrayList waterLocationsResidentialList;
    private ArrayList soilLocationsList;
    
    public PopulateLocations(Network network, Enterprise enterprise){
        this.network = network;
        this.enterprise = enterprise;
    }
    
    public ArrayList<String> populateAirLocations(Network network, Enterprise enterprise){
        if(enterprise.getName().equalsIgnoreCase("Air")){
            airLocatios = new ArrayList<String>();
            
            System.out.println("----- AIR -----");
            if(network.getName().equalsIgnoreCase("Mumbai")){
                            System.out.println("----- AIR MUMBAI-----");
               airLocatios.add("Andheri");
               airLocatios.add("Kurla");
               airLocatios.add("Mahim");
               airLocatios.add("Bhiwandi");
               airLocatios.add("Charni Road");
            }
            if(network.getName().equalsIgnoreCase("Chennai")){
                airLocatios.add("Adambakkam");
                airLocatios.add("Alandur");
                airLocatios.add("Tirusulam");
                airLocatios.add("Perambur");
                airLocatios.add("Chitlapakkam");
            }
            if(network.getName().equalsIgnoreCase("Kolkata")){
                airLocatios.add("Howrah");
                airLocatios.add("Kankurgachi");
                airLocatios.add("Kestopur");
                airLocatios.add("BallyGunge");
                airLocatios.add("ShivPur");
            }
            if(network.getName().equalsIgnoreCase("Delhi")){
                airLocatios.add("Noida");
                airLocatios.add("Malviya Nagar");
                airLocatios.add("Hauz Khas");
                airLocatios.add("Defence colony");
                airLocatios.add("PatparGunj Industrial Area");
            }
        }
        
//        System.out.println("airLocatios : " +airLocatios.size());
        return airLocatios;
    }
    
    public ArrayList<String> populateWaterLocations(Network network, Enterprise enterprise, boolean industrialRadio, boolean residentialRadio){
        
        if(enterprise.getName().equalsIgnoreCase("Water")){
            waterLocationsIndustryList = new ArrayList<String>();
            waterLocationsResidentialList = new ArrayList<String>();
            
            if(industrialRadio  == true){
                if(network.getName().equalsIgnoreCase("Mumbai")){
                    System.out.println("----- AIR MUMBAI-----");
                    waterLocationsIndustryList.add("Malad");
                    waterLocationsIndustryList.add("MasjibBandar");
                    waterLocationsIndustryList.add("Mahim");
                    waterLocationsIndustryList.add("Dadar");
                    waterLocationsIndustryList.add("Navy Nagar");
                }
                if(network.getName().equalsIgnoreCase("Chennai")){
                    waterLocationsIndustryList.add("Ennore");
                    waterLocationsIndustryList.add("Manali");
                    waterLocationsIndustryList.add("Minjur");
                    waterLocationsIndustryList.add("Avadi");
                    waterLocationsIndustryList.add("Ambattur");
                }
                if(network.getName().equalsIgnoreCase("Kolkata")){
                    waterLocationsIndustryList.add("Titagarh");
                    waterLocationsIndustryList.add("Bali");
                    waterLocationsIndustryList.add("Coal of Raniganj");
                    waterLocationsIndustryList.add("Agarpara");
                    waterLocationsIndustryList.add("CESC");
                }
                if(network.getName().equalsIgnoreCase("Delhi")){
                    waterLocationsIndustryList.add("Bawana Industrial Area");
                    waterLocationsIndustryList.add("Okhla Industrial Area");
                    waterLocationsIndustryList.add("Jhilmil Industrial Area");
                    waterLocationsIndustryList.add("Bakrola");
                    waterLocationsIndustryList.add("RaniGanj");
                }
                return waterLocationsIndustryList;
            }
            else if(residentialRadio  == true){
               if(network.getName().equalsIgnoreCase("Mumbai")){
                   System.out.println("----- WATER MUMBAI-----");
                    waterLocationsResidentialList.add("Andheri");
                    waterLocationsResidentialList.add("Kurla");
                    waterLocationsResidentialList.add("Mahim");
                    waterLocationsResidentialList.add("Bhiwandi");
                    waterLocationsResidentialList.add("Charni Road");
                }
                if(network.getName().equalsIgnoreCase("Chennai")){
                    waterLocationsResidentialList.add("Adambakkam");
                    waterLocationsResidentialList.add("Alandur");
                    waterLocationsResidentialList.add("Tirusulam");
                    waterLocationsResidentialList.add("Perambur");
                    waterLocationsResidentialList.add("Chitlapakkam");
                }
                if(network.getName().equalsIgnoreCase("Kolkata")){
                    waterLocationsResidentialList.add("Howrah");
                    waterLocationsResidentialList.add("Kankurgachi");
                    waterLocationsResidentialList.add("Kestopur");
                    waterLocationsResidentialList.add("BallyGunge");
                    waterLocationsResidentialList.add("ShivPur");
                }
                if(network.getName().equalsIgnoreCase("Delhi")){
                    waterLocationsResidentialList.add("Noida");
                    waterLocationsResidentialList.add("Malviya Nagar");
                    waterLocationsResidentialList.add("Hauz Khas");
                    waterLocationsResidentialList.add("Defence colony");
                    waterLocationsResidentialList.add("PatparGunj Industrial Area");
                }
                
                return waterLocationsResidentialList;
            }
        }
        
        return null;
    }
    
    public ArrayList<String> populateSoilLocations(Network network, Enterprise enterprise, boolean industrialRadio, boolean residentialRadio){
        
        if(enterprise.getName().equalsIgnoreCase("Soil")){
            waterLocationsIndustryList = new ArrayList<String>();
            waterLocationsResidentialList = new ArrayList<String>();
            
            if(industrialRadio  == true){
                if(network.getName().equalsIgnoreCase("Mumbai")){
                    System.out.println("----- AIR MUMBAI-----");
                    waterLocationsIndustryList.add("Malad");
                    waterLocationsIndustryList.add("MasjibBandar");
                    waterLocationsIndustryList.add("Mahim");
                    waterLocationsIndustryList.add("Dadar");
                    waterLocationsIndustryList.add("Navy Nagar");
                }
                if(network.getName().equalsIgnoreCase("Chennai")){
                    waterLocationsIndustryList.add("Ennore");
                    waterLocationsIndustryList.add("Manali");
                    waterLocationsIndustryList.add("Minjur");
                    waterLocationsIndustryList.add("Avadi");
                    waterLocationsIndustryList.add("Ambattur");
                }
                if(network.getName().equalsIgnoreCase("Kolkata")){
                    waterLocationsIndustryList.add("Titagarh");
                    waterLocationsIndustryList.add("Bali");
                    waterLocationsIndustryList.add("Coal of Raniganj");
                    waterLocationsIndustryList.add("Agarpara");
                    waterLocationsIndustryList.add("CESC");
                }
                if(network.getName().equalsIgnoreCase("Delhi")){
                    waterLocationsIndustryList.add("Bawana Industrial Area");
                    waterLocationsIndustryList.add("Okhla Industrial Area");
                    waterLocationsIndustryList.add("Jhilmil Industrial Area");
                    waterLocationsIndustryList.add("Bakrola");
                    waterLocationsIndustryList.add("RaniGanj");
                }
                return waterLocationsIndustryList;
            }
            else if(residentialRadio  == true){
               if(network.getName().equalsIgnoreCase("Mumbai")){
                   System.out.println("----- WATER MUMBAI-----");
                    waterLocationsResidentialList.add("Andheri");
                    waterLocationsResidentialList.add("Kurla");
                    waterLocationsResidentialList.add("Mahim");
                    waterLocationsResidentialList.add("Bhiwandi");
                    waterLocationsResidentialList.add("Charni Road");
                }
                if(network.getName().equalsIgnoreCase("Chennai")){
                    waterLocationsResidentialList.add("Adambakkam");
                    waterLocationsResidentialList.add("Alandur");
                    waterLocationsResidentialList.add("Tirusulam");
                    waterLocationsResidentialList.add("Perambur");
                    waterLocationsResidentialList.add("Chitlapakkam");
                }
                if(network.getName().equalsIgnoreCase("Kolkata")){
                    waterLocationsResidentialList.add("Howrah");
                    waterLocationsResidentialList.add("Kankurgachi");
                    waterLocationsResidentialList.add("Kestopur");
                    waterLocationsResidentialList.add("BallyGunge");
                    waterLocationsResidentialList.add("ShivPur");
                }
                if(network.getName().equalsIgnoreCase("Delhi")){
                    waterLocationsResidentialList.add("Noida");
                    waterLocationsResidentialList.add("Malviya Nagar");
                    waterLocationsResidentialList.add("Hauz Khas");
                    waterLocationsResidentialList.add("Defence colony");
                    waterLocationsResidentialList.add("PatparGunj Industrial Area");
                }
                
                return waterLocationsResidentialList;
            }
        }
        
        return null;
    }
    

}
