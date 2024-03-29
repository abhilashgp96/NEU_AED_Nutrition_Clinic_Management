/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.NutritionistRole;

import Business.Enterprise.Enterprise;
import Business.Environment;
import Business.Network.Network;
import Business.Nutritionist.Nutritionist;
import Business.Nutritionist.Patient;
import Business.Nutritionist.PrescriptionDirectory;
import Business.Organization.LabOrganization;
import Business.Organization.NutritionistOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.NutritionistWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author Anvita
 */
public class NutritionistRequestJPanel extends javax.swing.JPanel {

     private JPanel userProcessContainer;
     private NutritionistOrganization organization;
     private Enterprise enterprise;
     private Enterprise.EnterpriseType enterpriseType;
     private UserAccount account;
     private Network network;
     private Environment system;
 
    private static Logger log = Logger.getLogger(NutritionistRequestJPanel.class);
    private static final String CLASS_NAME = NutritionistRequestJPanel.class.getName();
    
    /**
     * Creates new form NutritionistRequestJPanel
     */
    public NutritionistRequestJPanel(JPanel userProcessContainer, UserAccount account,NutritionistOrganization organization,Enterprise enterprise,Environment system,Network network) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.account= account;
        this.organization= organization;
        this.enterprise= enterprise;
        this.system= system;
        this.network= network;
        valueLbl.setText(enterprise.getOrgName());
        populateRequestTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namelbl = new javax.swing.JLabel();
        ageLbl = new javax.swing.JLabel();
        diagnosisLbl = new javax.swing.JLabel();
        sexLbl = new javax.swing.JLabel();
        resultsLbl = new javax.swing.JLabel();
        enterpriseLbl = new javax.swing.JLabel();
        valueLbl = new javax.swing.JLabel();
        requestTestBtn = new javax.swing.JButton();
        viewResultsbtn = new javax.swing.JButton();
        clinicalTrial = new javax.swing.JButton();
        refreshbtn = new javax.swing.JButton();
        nameTxtField = new javax.swing.JTextField();
        ageTxtField = new javax.swing.JTextField();
        testTxtField = new javax.swing.JTextField();
        sexcomboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        nutritionistRequestTbl = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(230, 224, 224));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namelbl.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        namelbl.setText("Name");
        add(namelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        ageLbl.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        ageLbl.setText("Age");
        add(ageLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        diagnosisLbl.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        diagnosisLbl.setText("Allergy Test Required");
        add(diagnosisLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, -1, 40));

        sexLbl.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        sexLbl.setText("sex");
        add(sexLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        resultsLbl.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        resultsLbl.setText("Lab Results");
        add(resultsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, -1));

        enterpriseLbl.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        enterpriseLbl.setText("Enterprise :");
        add(enterpriseLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        valueLbl.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        valueLbl.setText("<value>");
        valueLbl.setToolTipText("");
        add(valueLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 110, 30));

        requestTestBtn.setBackground(new java.awt.Color(0, 0, 0));
        requestTestBtn.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        requestTestBtn.setForeground(new java.awt.Color(255, 255, 255));
        requestTestBtn.setText("Request Test");
        requestTestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestBtnActionPerformed(evt);
            }
        });
        add(requestTestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, -1, -1));

        viewResultsbtn.setBackground(new java.awt.Color(0, 0, 0));
        viewResultsbtn.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        viewResultsbtn.setForeground(new java.awt.Color(255, 255, 255));
        viewResultsbtn.setText("View Results");
        viewResultsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewResultsbtnActionPerformed(evt);
            }
        });
        add(viewResultsbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, -1, -1));

        clinicalTrial.setBackground(new java.awt.Color(0, 0, 0));
        clinicalTrial.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        clinicalTrial.setForeground(new java.awt.Color(255, 255, 255));
        clinicalTrial.setText("Clinical Trial");
        clinicalTrial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clinicalTrialActionPerformed(evt);
            }
        });
        add(clinicalTrial, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 470, -1, -1));

        refreshbtn.setBackground(new java.awt.Color(0, 0, 0));
        refreshbtn.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        refreshbtn.setForeground(new java.awt.Color(255, 255, 255));
        refreshbtn.setText("Refresh");
        refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbtnActionPerformed(evt);
            }
        });
        add(refreshbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 130, -1, -1));

        nameTxtField.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 180, -1));

        ageTxtField.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        add(ageTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 180, -1));

        testTxtField.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        add(testTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 180, -1));

        sexcomboBox.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        sexcomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Prefer Not to say" }));
        sexcomboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexcomboBoxActionPerformed(evt);
            }
        });
        add(sexcomboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        nutritionistRequestTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Age", "Sex", "message", "receiver", "Status", "New Dish", "Clinical Trial"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        nutritionistRequestTbl.setRowHeight(26);
        jScrollPane1.setViewportView(nutritionistRequestTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 620, 250));

        backJButton.setBackground(new java.awt.Color(0, 0, 0));
        backJButton.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-eppendorf-100.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbtnActionPerformed
        // TODO add your handling code here:
        populateRequestTable();
    }//GEN-LAST:event_refreshbtnActionPerformed

    private void requestTestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestBtnActionPerformed
        // TODO add your handling code here:
        String message = testTxtField.getText().trim();
        String patientName = nameTxtField.getText();
        String sex = sexcomboBox.getSelectedItem().toString();
        if(sexcomboBox.getSelectedIndex()<=0){
        JOptionPane.showMessageDialog(null,"Please select the gender");
        return;
        }
        if(message.equals("")){
        JOptionPane.showMessageDialog(null,"Mention the test that needs to be performed");
        return;
        }
        int age;
        try{
        
            age=Integer.parseInt(ageTxtField.getText());
        }catch(NumberFormatException e){
         JOptionPane.showMessageDialog(null,"Age must be integer");
        return;
        }
        
    LabTestWorkRequest request = new LabTestWorkRequest();
    request.setMessage(message);
    request.setSender(account);
    request.setStatus("Sent");
    request.setPatientName(patientName);
    Patient patient = new Patient();
    patient.setPatientFullName(patientName);
    patient.setAge(age);
    patient.setTest(message);
    patient.setSex(sex);
    request.setPatient(patient);
    
    Organization org = null;
    for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationLst()){
    if(organization instanceof LabOrganization ){
    
        org = organization;
        break;
    }
    
    }
    if(org!=null){
    
        org.getWorkQueue().getWorkRequestList().add(request);
        account.getWorkQueue().getWorkRequestList().add(request);
        log.debug("request sent to lab");
    }
    populateRequestTable();
    JOptionPane.showMessageDialog(null,"Test request sent successfully");
    nameTxtField.setText("");
    ageTxtField.setText("");
    sexcomboBox.setSelectedIndex(0);
    testTxtField.setText("");
    
    
    
    
    }//GEN-LAST:event_requestTestBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        NutritionistWorkAreaJPanel dwjp = (NutritionistWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void viewResultsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewResultsbtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = nutritionistRequestTbl.getSelectedRow();
        if(selectedRow<0){
        JOptionPane.showMessageDialog(null,"please select a row ");
        return;
        }
        LabTestWorkRequest request = (LabTestWorkRequest) nutritionistRequestTbl.getValueAt(selectedRow, 0);
        System.out.println(nutritionistRequestTbl.getValueAt(selectedRow, 5));
        System.out.println(nutritionistRequestTbl.getValueAt(selectedRow, 5).toString().toLowerCase().equalsIgnoreCase("completed"));
        
        if(nutritionistRequestTbl.getValueAt(selectedRow, 6)==null){
        JOptionPane.showMessageDialog(null,"results need to be generated by lab assistant");
        return;
        
        }
        int flag=0;
        if((nutritionistRequestTbl.getValueAt(selectedRow, 5).toString().equalsIgnoreCase("completed"))){
        
        flag++;
        }
         if((nutritionistRequestTbl.getValueAt(selectedRow, 5).toString().equalsIgnoreCase("ClinicalTrial"))){
         
             flag++;
         }
         System.out.println(flag+"clinical");
         if(flag==0)
         {
          JOptionPane.showMessageDialog(null,"lab results not yet returned");
        return;
        
         }
         
         NutritionistLabTestReportsJPanel processWorkRequestJPanel = new NutritionistLabTestReportsJPanel(userProcessContainer, request);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        log.debug("adding a request to lab assistant");
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewResultsbtnActionPerformed

    private void clinicalTrialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clinicalTrialActionPerformed
        // TODO add your handling code here:
        int selectedRow = nutritionistRequestTbl.getSelectedRow();

        if (selectedRow < 0) {
             JOptionPane.showMessageDialog(null,"please select a row for clinical trail");
            return;
        }
       

        LabTestWorkRequest request = (LabTestWorkRequest) nutritionistRequestTbl.getValueAt(selectedRow, 0);
         if(nutritionistRequestTbl.getValueAt(selectedRow, 6)==null || nutritionistRequestTbl.getValueAt(selectedRow, 6) == "N/A(Drug Exists)")
        {
            JOptionPane.showMessageDialog(null, "Clinical trail cannot be performed on this patient");
            return;
        }
        
         
        
        if(nutritionistRequestTbl.getValueAt(selectedRow, 7)!=null)
        {
            JOptionPane.showMessageDialog(null, "Clinical trail was already performed on this patient");
            return;
        }
        
         int flag=0;
         if((nutritionistRequestTbl.getValueAt(selectedRow, 5).toString().equalsIgnoreCase("completed"))){
            
            flag++;
            
        }
         if((nutritionistRequestTbl.getValueAt(selectedRow, 5).toString().equalsIgnoreCase("ClinicalTrail"))){            
            flag++;
            
        }
         System.out.println(flag+"clinical");
         if(flag==0)
         {
             JOptionPane.showMessageDialog(this, "Lab test results are yet returned");
             return;
             
         }
         
        request.setStatus("ClinicalTrail");

        ClinicalAssesmentJPanel clincalTrailJPanel = new ClinicalAssesmentJPanel(userProcessContainer, request);
        userProcessContainer.add("clincalTrailJPanel", clincalTrailJPanel);
        log.debug("entering clinical Page");
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_clinicalTrialActionPerformed

    private void sexcomboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexcomboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexcomboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTxtField;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton clinicalTrial;
    private javax.swing.JLabel diagnosisLbl;
    private javax.swing.JLabel enterpriseLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JLabel namelbl;
    private javax.swing.JTable nutritionistRequestTbl;
    private javax.swing.JButton refreshbtn;
    private javax.swing.JButton requestTestBtn;
    private javax.swing.JLabel resultsLbl;
    private javax.swing.JLabel sexLbl;
    private javax.swing.JComboBox<String> sexcomboBox;
    private javax.swing.JTextField testTxtField;
    private javax.swing.JLabel valueLbl;
    private javax.swing.JButton viewResultsbtn;
    // End of variables declaration//GEN-END:variables

    public void populateRequestTable() {
        
       DefaultTableModel model = (DefaultTableModel)nutritionistRequestTbl.getModel();
       model.setRowCount(0);
       for(WorkRequest request : account.getWorkQueue().getWorkRequestList()){
       if(request instanceof LabTestWorkRequest){
           Object[] row = new Object[8];
           row[0] = ((LabTestWorkRequest) request);
           row[1] = ((LabTestWorkRequest) request).getPatient().getAge();
           row[2] = ((LabTestWorkRequest) request).getPatient().getSex();
           row[3] = request.getMessage();
           row[4] = request.getReceiver();
           row[5] = request.getStatus();
           String result = ((LabTestWorkRequest) request).getPatient().getNewDish();
           if(request.getReceiver()==null||request.getReceiver().equals("Processing")){
           
               row[6]=null;
           }else{
           
               row[6]=result == null ? "N/A (Dish Exists)" : result;
           }
           row[7]= ((LabTestWorkRequest) request).getPatient().getClinicStatus();
           model.addRow(row);
           
           
       
       
       }
       }
    }
    
}
