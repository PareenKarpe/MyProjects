/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Air){
            enterprise=new AirEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.Water){
            enterprise=new WaterEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        if(type==Enterprise.EnterpriseType.Soil){
            enterprise=new SoilEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
         if(type==Enterprise.EnterpriseType.Municipal){
            enterprise=new MunicipalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        if(type==Enterprise.EnterpriseType.Lab){
            enterprise=new LabEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
}
