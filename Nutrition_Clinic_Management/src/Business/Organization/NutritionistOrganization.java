/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Nutritionist.Prescription;
import Business.Role.NutritionistRole;
import Business.Role.Role;

import java.util.ArrayList;

/**
 *
 * @author soumya
 */
public class NutritionistOrganization extends Organization{
    private ArrayList<Prescription> prescriptionLst;

    public NutritionistOrganization() {
        super(Organization.Type.Nutritionist.getValue());
     
        prescriptionLst=new ArrayList<Prescription>();
    }

    public ArrayList<Prescription> getPrescriptionLst() {
        return prescriptionLst;
    }

    public void setPrescriptionLst(ArrayList<Prescription> prescriptionLst) {
        this.prescriptionLst = prescriptionLst;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NutritionistRole());
        return roles;
    }
    public void addPrescription(Prescription prescription){
        
         prescriptionLst.add(prescription);
         
        
    }
    
}
