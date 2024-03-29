/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.LabAssistantRole;

import Business.Allergin.Allergin;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Nutritionist.Patient;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DishWorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import userinterface.NutritionistRole.PrescriptionJPanel;

/**
 *
 * @author Anvita
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    private JPanel userProcessContainer;
    private LabTestWorkRequest request;
    private LabOrganization labOrganization;
    private UserAccount userAccount;
    private Network network;
    String filePath = "./genes data.txt";
    private static Logger log = Logger.getLogger(ProcessWorkRequestJPanel.class);
    private static final String CLASS_NAME = ProcessWorkRequestJPanel.class.getName();
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, LabTestWorkRequest request, Organization organization, UserAccount userAccount, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.userAccount = userAccount;
        this.network = network;
        this.labOrganization = (LabOrganization) organization;
        patientTxtField.setText(request.getPatientName());
        populateTable();
        System.out.println(request.getStatus());
    }
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) allerginTbl.getModel();

        model.setRowCount(0);
        System.out.println(((LabTestWorkRequest) request).getPatient().getAllerginHistory().getAllerginRecord());
        System.out.println(((LabTestWorkRequest) request).getPatient().getAllerginHistory().getAllerginRecord().size());

        for (Allergin g : ((LabTestWorkRequest) request).getPatient().getAllerginHistory().getAllerginRecord()) {

            Object[] row = new Object[2];
            row[0] = g.getAllerginId();
            row[1] = g.getAllerginName();
            System.out.println(((LabTestWorkRequest) request).getPatient());

            model.addRow(row);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultLbl = new javax.swing.JLabel();
        patientNameLbl = new javax.swing.JLabel();
        allerginLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        addAllerginBtn = new javax.swing.JButton();
        patientTxtField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        allerginTbl = new javax.swing.JTable();
        allerginTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultLbl.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        resultLbl.setText("Result");
        add(resultLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        patientNameLbl.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        patientNameLbl.setText("Patient Name");
        add(patientNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        allerginLbl.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        allerginLbl.setText("Allergin");
        add(allerginLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 110, -1));

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, -1, -1));

        addAllerginBtn.setBackground(new java.awt.Color(0, 0, 0));
        addAllerginBtn.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        addAllerginBtn.setForeground(new java.awt.Color(255, 255, 255));
        addAllerginBtn.setText("Add Allergin");
        addAllerginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAllerginBtnActionPerformed(evt);
            }
        });
        add(addAllerginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 410, -1, -1));

        patientTxtField.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        patientTxtField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(patientTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 160, -1));

        allerginTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Allergin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        allerginTbl.setRowHeight(26);
        jScrollPane1.setViewportView(allerginTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 480, 140));

        allerginTxt.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        allerginTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(allerginTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-test-passed-80.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, -1, -1));

        submitBtn.setBackground(new java.awt.Color(0, 0, 0));
        submitBtn.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

     public void saveRecord(String gene) {
        try {
            FileWriter file = new FileWriter(filePath, true);
            BufferedWriter bw = new BufferedWriter(file);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(gene);
            pw.flush();
            pw.close();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(PrescriptionJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void addAllerginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAllerginBtnActionPerformed
        // TODO add your handling code here:
         Patient patient = ((LabTestWorkRequest) request).getPatient();
        String geneName = allerginTxt.getText().trim();
        if (geneName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please add a gene");
            return;
        }

        ArrayList<String> genecheck = new ArrayList<>();
        for (Allergin g1 : patient.getAllerginHistory().getAllerginRecord()) {
            genecheck.add(g1.getAllerginName().toLowerCase());

        }
        if (genecheck.contains(geneName.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Gene already exists in the list ");
            return;
        }
        Allergin g = patient.getAllerginHistory().addAllerginLst();
        g.setAllerginName(geneName);
        request.setPatient(patient);
        populateTable();
        saveRecord(g.getAllerginName());
        allerginTxt.setText("");
    }//GEN-LAST:event_addAllerginBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LabAssistantWorkAreaJPanel dwjp = (LabAssistantWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
                submitBtn.setEnabled(true);
        ArrayList<String> genecheck = new ArrayList<>();
        for (Allergin g : ((LabTestWorkRequest) request).getPatient().getAllerginHistory().getAllerginRecord()) {
            genecheck.add(g.getAllerginName());

        }
        if (genecheck.size() <= 0) {
            JOptionPane.showMessageDialog(null, "no genes has been added to submit ");
            return;
        }
        request.setStatus("Completed");
        DishWorkRequest requestDrug = new DishWorkRequest();

        requestDrug.setPatient(((LabTestWorkRequest) request).getPatient());

        requestDrug.setSender(userAccount);

        userAccount.getWorkQueue().getWorkRequestList().add(requestDrug);
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseLst()) {
            System.out.println("***** Organization Name:" + enterprise.getOrgName());
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationLst()) {
                System.out.println("***** Organization Name:" + organization.getOrgName());
                if (organization.getOrgName().equals("Food Supplier Organization")) {
                    System.out.println("True");

                    System.out.println("***** organization Name" + organization.getOrgName());

                    organization.getWorkQueue().getWorkRequestList().add(requestDrug);
                }
            }

        }
        JOptionPane.showMessageDialog(null, "Result has been succesfully submited");
        submitBtn.setEnabled(false);


    }//GEN-LAST:event_submitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAllerginBtn;
    private javax.swing.JLabel allerginLbl;
    private javax.swing.JTable allerginTbl;
    private javax.swing.JTextField allerginTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel patientNameLbl;
    private javax.swing.JTextField patientTxtField;
    private javax.swing.JLabel resultLbl;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
