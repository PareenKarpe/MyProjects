/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Supervisor.getValue())){
            organization = new supervisorOrganisation();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Staff.getValue())){
            organization = new staffOrganisation();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.LabScientist.getValue())){
            organization = new LabScientistOrganisation(null);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HeadScientist.getValue())){
            organization = new HeadScientistOrganisation();
            organizationList.add(organization);
        }
        return organization;
    }
}