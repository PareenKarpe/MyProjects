/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;

import Business.Organization.supervisorOrganisation;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.SupervisorRole.SupervisorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SupervisorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem business) {
        return new SupervisorWorkAreaJPanel(userProcessContainer, account, (supervisorOrganisation)organization, enterprise,network,business);
    }
    
    
}
