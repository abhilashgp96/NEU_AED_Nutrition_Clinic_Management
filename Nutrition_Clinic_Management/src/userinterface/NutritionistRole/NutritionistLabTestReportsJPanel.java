/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.NutritionistRole;

import Business.Allergin.Allergin;
import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author Anvita
 */
public class NutritionistLabTestReportsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NutritionistLabTestReportsJPanel
     */
    private JPanel userProcessContainer;
    private LabTestWorkRequest request;
    private static Logger log = Logger.getLogger(NutritionistLabTestReportsJPanel.class);
    private static final String CLASS_NAME = NutritionistLabTestReportsJPanel.class.getName();
    public NutritionistLabTestReportsJPanel(JPanel userProcessContainer, LabTestWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        patientTxtField.setText(request.getPatientName());
        populateTable();
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
            log.debug("displaying results");
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

        LabTestLbl = new javax.swing.JLabel();
        patientLbl = new javax.swing.JLabel();
        patientTxtField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        allerginTbl = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabTestLbl.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        LabTestLbl.setText("Lab Test Result");
        add(LabTestLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 90, 350, 60));

        patientLbl.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        patientLbl.setText("Patient Name");
        add(patientLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        patientTxtField.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        add(patientTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 282, 170, 30));

        allerginTbl.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
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
                java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(allerginTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, 240));

        backBtn.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, -1));

        refreshBtn.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 550, 120, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        NutritionistRequestJPanel dwjp = (NutritionistRequestJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabTestLbl;
    private javax.swing.JTable allerginTbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel patientLbl;
    private javax.swing.JTextField patientTxtField;
    private javax.swing.JButton refreshBtn;
    // End of variables declaration//GEN-END:variables
}
