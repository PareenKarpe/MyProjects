/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HeadScientistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Anuja
 */
public class HeadScientistOrganisation extends Organization{

    public HeadScientistOrganisation() {
        super(Organization.Type.HeadScientist.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HeadScientistRole());
        return roles;
    }
    
}
