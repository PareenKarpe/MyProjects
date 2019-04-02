/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.*;
import Business.Role.Role;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class supervisorOrganisation extends Organization{

    public supervisorOrganisation() {
        super(Organization.Type.Supervisor.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SupervisorRole());
        return roles;
    }
     
   
    
    
}
