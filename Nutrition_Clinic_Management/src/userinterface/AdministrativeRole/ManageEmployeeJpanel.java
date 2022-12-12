/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author abhilashgp
 */
public class ManageEmployeeJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmployeeJpanel
     */
    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private static Logger log = Logger.getLogger(ManageEmployeeJpanel.class);
    private static final String CLASS_NAME = ManageEmployeeJpanel.class.getName();
        public ManageEmployeeJpanel(JPanel userProcessContainer, OrganizationDirectory organizationDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;               
        populateOrganizationEmpComboBox();
         populateOrganizationComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        orglbl = new javax.swing.JLabel();
        organizationComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationTbl = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        organizationEmpComboBox = new javax.swing.JComboBox();
        nameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        addJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(230, 224, 224));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel4.setText("Manage Employee");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 40, 470, -1));

        orglbl.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        orglbl.setText("Organization:");
        add(orglbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 133, -1, -1));

        organizationComboBox.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 20)); // NOI18N
        organizationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationComboBoxActionPerformed(evt);
            }
        });
        add(organizationComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 137, 270, 32));

        organizationTbl.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 20)); // NOI18N
        organizationTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organizationTbl.getTableHeader().setResizingAllowed(false);
        organizationTbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(organizationTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 242, 547, 165));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel3.setText("Organization:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 490, -1, -1));

        organizationEmpComboBox.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 20)); // NOI18N
        organizationEmpComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationEmpComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationEmpComboBoxActionPerformed(evt);
            }
        });
        add(organizationEmpComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 494, 300, 32));

        nameTextField.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 20)); // NOI18N
        nameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 556, 300, 40));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 552, -1, -1));

        backJButton.setBackground(new java.awt.Color(0, 0, 0));
        backJButton.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 690, -1, -1));

        addJButton.setBackground(new java.awt.Color(0, 0, 0));
        addJButton.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        addJButton.setForeground(new java.awt.Color(255, 255, 255));
        addJButton.setText("Create Employee");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 690, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-name-tag-100.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        // TODO add your handling code here:
        Organization organization = (Organization) organizationEmpComboBox.getSelectedItem();
        String name = nameTextField.getText().trim();
        if(name.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter a valid input");
            return;
        }
        ArrayList<String> namecheck = new ArrayList<>();
        for(Employee o:organization.getEmpDirectory().getEmployeeLst())
        {
            namecheck.add(o.getEmpName().toLowerCase());
            
        }
        if(namecheck.contains(name.toLowerCase()))
        {
            JOptionPane.showMessageDialog(null,"Employee already exists");
            return;
        }
        log.debug("Enterprise admin adding following employee \t" +name+ "in following Organization \t" +organization+ "\t" +CLASS_NAME);
        organization.getEmpDirectory().createNewEmployee(name);
        populateTable(organization);
        nameTextField.setText("");
    }//GEN-LAST:event_addJButtonActionPerformed

    private void organizationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationComboBoxActionPerformed
        // TODO add your handling code here:
         Organization organization = (Organization) organizationComboBox.getSelectedItem();
        if (organization != null){
            populateTable(organization);
        }
    }//GEN-LAST:event_organizationComboBoxActionPerformed

    private void organizationEmpComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationEmpComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationEmpComboBoxActionPerformed
 public void populateOrganizationComboBox(){
        organizationComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationLst()){
            organizationComboBox.addItem(organization);
        }
    }
 public void populateOrganizationEmpComboBox(){
        organizationEmpComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationLst()){
            organizationEmpComboBox.addItem(organization);
        }
    }
 private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) organizationTbl.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : organization.getEmpDirectory().getEmployeeLst()){
            Object[] row = new Object[2];
            row[0] = employee.getEmpId();
            row[1] = employee.getEmpName();
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JComboBox organizationComboBox;
    private javax.swing.JComboBox organizationEmpComboBox;
    private javax.swing.JTable organizationTbl;
    private javax.swing.JLabel orglbl;
    // End of variables declaration//GEN-END:variables
}
