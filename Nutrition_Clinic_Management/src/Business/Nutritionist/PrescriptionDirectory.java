/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Nutritionist;

import java.util.ArrayList;

/**
 *
 * @author Anvita
 */
public class PrescriptionDirectory {
    private ArrayList<Prescription> prescriptionLst;
    public PrescriptionDirectory(){
        prescriptionLst = new ArrayList<Prescription>();
        
    }

    public ArrayList<Prescription> getPrescriptionLst() {
        return prescriptionLst;
    }

    public void setPrescriptionLst(ArrayList<Prescription> prescriptionLst) {
        this.prescriptionLst = prescriptionLst;
    }
    // add prescription to prescription List
    public Prescription addPrescription(){
        Prescription prescription = new Prescription();
        prescriptionLst.add(prescription);
        return prescription;
    }
}
