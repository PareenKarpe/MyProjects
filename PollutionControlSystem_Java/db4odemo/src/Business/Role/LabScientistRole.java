/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LabScientistOrganisation;
import Business.Organization.Organization;
import Business.Organization.staffOrganisation;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.StaffRole.LabScientistWorkAreaJPanel;
import userinterface.SupervisorRole.LabHeadScientistJPanel;

/**
 *
 * @author Anuja
 */
public class LabScientistRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new LabScientistWorkAreaJPanel(userProcessContainer, account, (LabScientistOrganisation)organization, enterprise,network);
    }
    
}
