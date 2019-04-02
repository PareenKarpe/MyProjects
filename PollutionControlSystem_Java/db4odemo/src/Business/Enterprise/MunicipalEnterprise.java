/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author paree
 */

    
    
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author MyPC1
 */
public class MunicipalEnterprise extends Enterprise {
    
    public MunicipalEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Municipal);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}


    

