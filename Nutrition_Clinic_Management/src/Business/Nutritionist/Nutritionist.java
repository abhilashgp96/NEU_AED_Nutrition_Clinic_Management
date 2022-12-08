/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Nutritionist;

/**
 *
 * @author Anvita
 */
public class Nutritionist {
    private String nutritionistName;
    private PrescriptionDirectory prescriptionLst;
    
    public Nutritionist(){
    
        prescriptionLst = new PrescriptionDirectory();
    }

    public String getNutritionistName() {
        return nutritionistName;
    }

    public void setNutritionistName(String nutritionistName) {
        this.nutritionistName = nutritionistName;
    }

    public PrescriptionDirectory getPrescriptionLst() {
        return prescriptionLst;
    }

    public void setPrescriptionLst(PrescriptionDirectory prescriptionLst) {
        this.prescriptionLst = prescriptionLst;
    }
    
}
