/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SupervisorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.*;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.SoilTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class ForwardrequestJPanel1 extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
     private LabTestWorkRequest request;
     private SoilTestWorkRequest request2;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public ForwardrequestJPanel1(JPanel userProcessContainer, UserAccount account, Enterprise enterprise,Network network,LabTestWorkRequest request) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
        this.request = request;
        valueLabel.setText(enterprise.getName());
       
        //System.out.print(enterprise.getEnterpriseType().getValue());
        if(enterprise.getEnterpriseType().getValue().toString().equalsIgnoreCase("Municipal"))
        {
        enterpriseTypeJComboBox.setVisible(true);
        jLabel3.setVisible(true);
         populateComboBox();
        }
        else
        {
             enterpriseTypeJComboBox.setVisible(false);
             jLabel3.setVisible(false);
             populateComboBox();
        }
        
        messageJTextField.setText(request.getMessage());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    
       private void populateComboBox() {
        enterpriseTypeJComboBox.removeAllItems();
//        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
//            enterpriseTypeJComboBox.addItem(type);
//        }

       LocationText.setText(request.getLocation());
	   
	   for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            enterpriseTypeJComboBox.addItem(e);
        } 
        
        
    }
       
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        LocationText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 244, 207));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setText("Request Test");
        requestTestJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 140, 60));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Message");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        messageJTextField.setEditable(false);
        messageJTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 130, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 110, 60));

        valueLabel.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 160, -1));

        enterpriseLabel.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 150, 30));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setLabelFor(enterpriseTypeJComboBox);
        jLabel3.setText("Enterprise Type");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, 30));

        enterpriseTypeJComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enterpriseTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Enterprise" }));
        enterpriseTypeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseTypeJComboBoxActionPerformed(evt);
            }
        });
        add(enterpriseTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 130, 30));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("Location");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        LocationText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LocationText.setEnabled(false);
        LocationText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationTextActionPerformed(evt);
            }
        });
        add(LocationText, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 140, -1));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        
       
   
         
              Enterprise   e = enterprise;
     Organization org = null;
    //    System.out.println(e);
      for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof staffOrganisation){
              org = organization;
                break;
            }
        }
      
      if (org!=null){
             
            
            
          
                  org.getWorkQueue().getWorkRequestList().add(request);
              //    userAccount.getWorkQueue().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(null, "Request is forwarded", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
         
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SupervisorWorkAreaJPanel dwjp = (SupervisorWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void enterpriseTypeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseTypeJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseTypeJComboBoxActionPerformed

    private void LocationTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocationTextActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LocationText;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
