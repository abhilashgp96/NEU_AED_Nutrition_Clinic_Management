/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.NutritionistRole;

import Business.Enterprise.Enterprise;
import Business.Environment;
import Business.Network.Network;
import Business.Nutritionist.Prescription;
import Business.Nutritionist.PrescriptionDirectory;
import Business.Organization.CateringOrganization;
import Business.Organization.NutritionistOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CateringWorkRequest;
import Business.WorkQueue.NutritionistWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author Anvita
 */
public class PrescriptionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PrescriptionJPanel
     */
   private JPanel userProcessContainer;
    private NutritionistOrganization nOrg;
    private Enterprise enterprise;
    private Prescription presc;
    private UserAccount userAccount;
    private PrescriptionDirectory prescLst;
    private Network network;
    private Environment system;
    private NutritionistWorkRequest NutriReq;
    private static Logger log = Logger.getLogger(PrescriptionJPanel.class);
    private static final String CLASS_NAME = PrescriptionJPanel.class.getName();
    private static final String filePath = "./Prescription data.txt";
    
    public PrescriptionJPanel(JPanel userProcessContainer,PrescriptionDirectory List,UserAccount account,Enterprise enterprise,NutritionistOrganization norg,Environment system,Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.enterprise=enterprise;
        this.nOrg= nOrg;
        this.network = network;
        this.system = system;
        
        populateWorkRequestTable();
        DateChooser.setMinSelectableDate(new Date());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NutritionistPrescriptionLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        ageLbl = new javax.swing.JLabel();
        sexLbl = new javax.swing.JLabel();
        prognosisLbl = new javax.swing.JLabel();
        dishLbl = new javax.swing.JLabel();
        TimesLbl = new javax.swing.JLabel();
        forLbl = new javax.swing.JLabel();
        datLbl = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        ageTxtField = new javax.swing.JTextField();
        sexcomboBox = new javax.swing.JComboBox<>();
        prognosiscomboBox = new javax.swing.JComboBox<>();
        dishCombobox = new javax.swing.JComboBox<>();
        noofTimesTxt = new javax.swing.JSpinner();
        noofDaysTxt = new javax.swing.JSpinner();
        DateChooser = new com.toedter.calendar.JDateChooser();
        saveBtn = new javax.swing.JButton();
        bakBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        prescriptionJTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NutritionistPrescriptionLbl.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        NutritionistPrescriptionLbl.setText("Nutritionist Prescription");
        add(NutritionistPrescriptionLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        nameLbl.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        nameLbl.setText("Name");
        add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        ageLbl.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        ageLbl.setText("Age");
        add(ageLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        sexLbl.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        sexLbl.setText("Sex");
        add(sexLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        prognosisLbl.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        prognosisLbl.setText("Deficient In");
        add(prognosisLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 130, -1));

        dishLbl.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        dishLbl.setText("Suggested Dish");
        add(dishLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, -1, -1));

        TimesLbl.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        TimesLbl.setText("Times");
        add(TimesLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, -1, -1));

        forLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        forLbl.setText("For");
        add(forLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, -1, -1));

        datLbl.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        datLbl.setText("Date");
        add(datLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, -1));

        nameTxtField.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 200, -1));

        ageTxtField.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        add(ageTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 200, -1));

        sexcomboBox.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        sexcomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female", "prefer not to say" }));
        sexcomboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexcomboBoxActionPerformed(evt);
            }
        });
        add(sexcomboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 200, -1));

        prognosiscomboBox.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        prognosiscomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--please select--", "Spinach salad", "Fish curry", "Egg yolk sandwiches", "Classic Egg salad", "Broccoli Carrot Rice", "Mashed Potato salad", "DryFruits and nuts smoothie bowl" }));
        prognosiscomboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prognosiscomboBoxActionPerformed(evt);
            }
        });
        add(prognosiscomboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 200, -1));

        dishCombobox.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        dishCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--please select--", "Iron Deficiency", "Iodine Deficiency", "Vitamin D Deficiency", "Vitamin B12 Deficiency", "Calcium Deficiency", "Vitamin A Deficiency", "Magnesium Deficiency", " ", " " }));
        dishCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dishComboboxActionPerformed(evt);
            }
        });
        add(dishCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 200, 40));

        noofTimesTxt.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        add(noofTimesTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 130, 30));

        noofDaysTxt.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        add(noofDaysTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 130, 30));
        add(DateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 122, 130, 30));

        saveBtn.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, -1));

        bakBtn.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        bakBtn.setText("Back");
        add(bakBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 649, 90, 30));

        prescriptionJTable.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        prescriptionJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Suggested Dish Name", "Total Quantity", "Reciever"
            }
        ));
        jScrollPane1.setViewportView(prescriptionJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 427, 650, 210));
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        Prescription p = new Prescription();
        p.setPrognosis(prognosiscomboBox.getSelectedItem().toString());
        p.setDishFoodName(dishCombobox.getSelectedItem().toString());
        p.setNumberOfTimesADay ((Integer)noofTimesTxt.getValue());
        p.setTotalNumberOfDays ((Integer)noofDaysTxt.getValue());
        p.setNetName (network.getNetName());
        
        String age = ageTxtField.getText();
        boolean flag = true;
        try{
        Integer.parseInt(age);
        }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null,"Please select an integer for age");
        flag = false;
        return;
        }
        if(p.getPrognosis().equals("")){
        JOptionPane.showMessageDialog(null,"Please enter prognosis");
        flag = false;
        return;
        }
        else if(nameTxtField.equals("")){
            JOptionPane.showMessageDialog(null,"Please enter a name for the patient");
        flag = false;
        return;
        }
        if(((Integer)noofTimesTxt.getValue())==0|| ((Integer)noofDaysTxt.getValue())==0){
             JOptionPane.showMessageDialog(null,"Please complete the prescription");
        flag = false;
        return;
        }
        if(DateChooser.getDate()==null){
             JOptionPane.showMessageDialog(null,"Please choose a date");
        flag = false;
        return;
        }
        if(sexcomboBox.getSelectedIndex()<=0){
          JOptionPane.showMessageDialog(null,"Please select a gender");
        flag = false;
        return;
        }
        if(prognosiscomboBox.getSelectedIndex()<=0){
              JOptionPane.showMessageDialog(null,"Please select a prognosis");
        flag = false;
        return;
        }
        
        if(flag==true){
        
            nOrg.addPrescription(p);
            CateringWorkRequest request = new CateringWorkRequest();
            request.setDishFoodName(dishCombobox.getSelectedItem().toString());
            request.setQuantity(((Integer)noofTimesTxt.getValue())*((Integer)noofDaysTxt.getValue()));
            request.setSender(userAccount);
            request.setStatus("Sent");
            System.out.println(request.getDishFoodName());
            JOptionPane.showMessageDialog(null,"Prescription for patient added");
            
            System.out.println("**"+enterprise.getOrgName());
            Organization org = null;
            
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseLst()){
            for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationLst()){
                if(organization instanceof CateringOrganization){
                org=organization;
                System.out.println("**"+org);
                log.debug(org);
                log.debug("In Enterprise\t"+enterprise);
                log.debug("In Organization"+org);
                log.debug("In network"+network);
                break;
                }
            
            }
            
            }
            
            if(org!=null){
                
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            log.debug("request sent to caterer");
            }
            populateWorkRequestTable();
            saveRecord(p.getNetName(),p.getPrognosis(),p.getDishFoodName());
            nameTxtField.setText("");
            ageTxtField.setText("");
            noofTimesTxt.setValue(0);
            noofDaysTxt.setValue(0);
            sexcomboBox.setSelectedIndex(0);
            dishCombobox.setSelectedIndex(0);
            
            
        }
        
                
                
                
        
        
    }//GEN-LAST:event_saveBtnActionPerformed

    private void dishComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dishComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dishComboboxActionPerformed

    private void prognosiscomboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prognosiscomboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prognosiscomboBoxActionPerformed

    private void sexcomboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexcomboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexcomboBoxActionPerformed

public void saveRecord(String network,String disease,String medicine){
    try{
        FileWriter file = new FileWriter(filePath,true);
        BufferedWriter bw = new BufferedWriter(file);
        PrintWriter pw = new PrintWriter(file);
        pw.println(network+","+disease+"'"+medicine);
        pw.flush();
        pw.close();
        log.debug("saving prescription details to prescription data.txt");
               
    }catch(IOException ex){
            java.util.logging.Logger.getLogger(PrescriptionJPanel.class.getName()).log(Level.SEVERE,null,ex);
    log.error("prescription data.txt"+ex);
    }
}

public void populateWorkRequestTable(){

    DefaultTableModel model = (DefaultTableModel) prescriptionJTable.getModel();
    model.setRowCount(0);
    for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
        if(request instanceof CateringWorkRequest){
            Object[] row = new Object[4];
            String dish = ((CateringWorkRequest)request).getDishFoodName();
            System.out.println("**"+dish);
            row[0] = (CateringWorkRequest) request;
            int quantity = ((CateringWorkRequest)request).getQuantity();
            row[1] = quantity;
            row[2] = request.getReceiver();
            String result = request.getStatus();
            row[3] = result == null ? "waiting" : result;
            model.addRow(row);
        }
    
    }
    

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JLabel NutritionistPrescriptionLbl;
    private javax.swing.JLabel TimesLbl;
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTxtField;
    private javax.swing.JButton bakBtn;
    private javax.swing.JLabel datLbl;
    private javax.swing.JComboBox<String> dishCombobox;
    private javax.swing.JLabel dishLbl;
    private javax.swing.JLabel forLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JSpinner noofDaysTxt;
    private javax.swing.JSpinner noofTimesTxt;
    private javax.swing.JTable prescriptionJTable;
    private javax.swing.JLabel prognosisLbl;
    private javax.swing.JComboBox<String> prognosiscomboBox;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel sexLbl;
    private javax.swing.JComboBox<String> sexcomboBox;
    // End of variables declaration//GEN-END:variables
}
