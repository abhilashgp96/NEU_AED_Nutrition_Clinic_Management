/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.NutritionistRole;


import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Nutritionist.Nutritionist;
import Business.Nutritionist.PrescriptionDirectory;
import Business.Organization.NutritionistOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.NutritionistWorkRequest;
import javax.swing.JPanel;
import org.apache.log4j.Logger;
import Business.Environment;
import java.awt.CardLayout;

/**
 *
 * @author Anvita
 */
public class NutritionistWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private NutritionistOrganization organization;
    private Enterprise enterprise;
    private Nutritionist nutritionist;
    private UserAccount userAccount;
    private PrescriptionDirectory presLst;
    private Network network;
    private Environment system;
    private NutritionistWorkRequest NutriReq;
    private static Logger log = Logger.getLogger(NutritionistWorkAreaJPanel.class);
    private static final String CLASS_NAME = NutritionistWorkAreaJPanel.class.getName();
    /**
     * Creates new form NutritionistWorkAreaJPanel
     */
    public NutritionistWorkAreaJPanel(JPanel userProcessContainer, UserAccount account,NutritionistOrganization organization,Enterprise enterprise,Environment system,Network network) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=account;
        this.organization=organization;
        this.enterprise=enterprise;
        this.system=system;
        this.network=network;
    }

    public void network(){
    
        network.getNetName();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nutritionistbl = new javax.swing.JLabel();
        PrescriptionBtn = new javax.swing.JButton();
        labTestBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nutritionistbl.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        Nutritionistbl.setText("NUTRITIONIST WORK AREA");
        add(Nutritionistbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 510, -1));

        PrescriptionBtn.setBackground(new java.awt.Color(0, 0, 0));
        PrescriptionBtn.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        PrescriptionBtn.setForeground(new java.awt.Color(255, 255, 255));
        PrescriptionBtn.setText("Consult a patient");
        PrescriptionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrescriptionBtnActionPerformed(evt);
            }
        });
        add(PrescriptionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 260, 90));

        labTestBtn.setBackground(new java.awt.Color(0, 0, 0));
        labTestBtn.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        labTestBtn.setForeground(new java.awt.Color(255, 255, 255));
        labTestBtn.setText("Request Lab Test");
        labTestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labTestBtnActionPerformed(evt);
            }
        });
        add(labTestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 260, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nutritionist.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 340, 290));
    }// </editor-fold>//GEN-END:initComponents

    private void PrescriptionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrescriptionBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        log.debug("currently in nutritionist role");
        userProcessContainer.add("PrescriptionJPanel",new userinterface.NutritionistRole.PrescriptionJPanel(userProcessContainer,presLst,userAccount,enterprise,organization,system,network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_PrescriptionBtnActionPerformed

    private void labTestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labTestBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout =(CardLayout)userProcessContainer.getLayout();
        log.debug("in lab test request");
        userProcessContainer.add("TestJPanel",new userinterface.NutritionistRole.NutritionistRequestJPanel(userProcessContainer,userAccount,organization,enterprise,system,network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_labTestBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nutritionistbl;
    private javax.swing.JButton PrescriptionBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton labTestBtn;
    // End of variables declaration//GEN-END:variables
}
