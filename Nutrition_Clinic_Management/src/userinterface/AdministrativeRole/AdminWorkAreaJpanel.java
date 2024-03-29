/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.log4j.Logger;


/**
 *
 * @author abhilashgp
 */
public class AdminWorkAreaJpanel extends javax.swing.JPanel {
    
    /**
     * Creates new form AdminWorkAreaJpanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    private static Logger log = Logger.getLogger(AdminWorkAreaJpanel.class);
    private static final String CLASS_NAME = AdminWorkAreaJpanel.class.getName();
    public AdminWorkAreaJpanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
         this.enterprise = enterprise;
          this.userProcessContainer = userProcessContainer;
          valuelbl.setText(enterprise.getOrgName());
       
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        valuelbl = new javax.swing.JLabel();
        manageEmployeebtn = new javax.swing.JButton();
        enterpriseLabel1 = new javax.swing.JLabel();
        userbtn = new javax.swing.JButton();
        manageOrganizationbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(230, 224, 224));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel3.setText("Administrative Work Area");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        valuelbl.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        valuelbl.setText("<value>");
        add(valuelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 130, 30));

        manageEmployeebtn.setBackground(new java.awt.Color(0, 0, 0));
        manageEmployeebtn.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        manageEmployeebtn.setForeground(new java.awt.Color(255, 255, 255));
        manageEmployeebtn.setText("Manage Employee");
        manageEmployeebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeebtnActionPerformed(evt);
            }
        });
        add(manageEmployeebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 320, 70));

        enterpriseLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        enterpriseLabel1.setText("Enterprise :");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 150, 30));

        userbtn.setBackground(new java.awt.Color(0, 0, 0));
        userbtn.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        userbtn.setForeground(new java.awt.Color(255, 255, 255));
        userbtn.setText("Manage User");
        userbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userbtnActionPerformed(evt);
            }
        });
        add(userbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, 320, 70));

        manageOrganizationbtn.setBackground(new java.awt.Color(0, 0, 0));
        manageOrganizationbtn.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        manageOrganizationbtn.setForeground(new java.awt.Color(255, 255, 255));
        manageOrganizationbtn.setText("Manage Organization");
        manageOrganizationbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationbtnActionPerformed(evt);
            }
        });
        add(manageOrganizationbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 320, 70));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, -30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-administrator-male-100.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, -1, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationbtnActionPerformed
        // TODO add your handling code here:
        ManageOrganizationJpanel manageOrganizationJPanel = new ManageOrganizationJpanel(userProcessContainer, enterprise.getOrganizationDirectory(),enterprise);
        log.debug("Organization created by enterprise admin \t"+CLASS_NAME);
        userProcessContainer.add("manageOrganization", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationbtnActionPerformed

    private void manageEmployeebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeebtnActionPerformed
        // TODO add your handling code here:
        int CheckOrg=0;
        for(Organization o: enterprise.getOrganizationDirectory().getOrganizationLst())
        {
            CheckOrg++;
            
        }
        if(CheckOrg<=0)
        {
            JOptionPane.showMessageDialog(null, "Organisation is Unavailable to create a Employee");
            return;
        }
        
        ManageEmployeeJpanel manageEmployeeJPanel = new ManageEmployeeJpanel(userProcessContainer, enterprise.getOrganizationDirectory());
        log.debug("Employee added by enterprise admin \t" +CLASS_NAME);
        userProcessContainer.add("manageEmployee", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeebtnActionPerformed

    private void userbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userbtnActionPerformed
        // TODO add your handling code here:
        int employeecheck=0;
        for(Organization o: enterprise.getOrganizationDirectory().getOrganizationLst())
        {
            for(Employee e :o.getEmpDirectory().getEmployeeLst())
            employeecheck++;
            
        }
        if(employeecheck<=0)
        {
             JOptionPane.showMessageDialog(null, "Cannot create user account since there are no employees");
            return;
        }
        ManageUserAccountJpanel muajp = new ManageUserAccountJpanel(userProcessContainer, enterprise);
        log.debug("Users added by Enterprise admin \t" +CLASS_NAME);
        userProcessContainer.add("ManageUserAccount", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton manageEmployeebtn;
    private javax.swing.JButton manageOrganizationbtn;
    private javax.swing.JButton userbtn;
    private javax.swing.JLabel valuelbl;
    // End of variables declaration//GEN-END:variables
}
