/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Deficiency.Deficiency;
import Business.Nutritionist.Patient;
import Business.Allergin.Allergin;
import java.util.List;
import java.util.Map;

/**
 *
 * @author abhilashgp
 */
public class LabTestWorkRequest extends WorkRequest{
    
    private String testResult;
    private Map<Deficiency,List<Allergin>>deficiencyListAllergins;
    private String patientName;
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Map<Deficiency, List<Allergin>> getDeficiencyListAllergins() {
        return deficiencyListAllergins;
    }

    public void setDeficiencyListAllergins(Map<Deficiency, List<Allergin>> deficiencyListAllergins) {
        this.deficiencyListAllergins = deficiencyListAllergins;
    }

  

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
      @Override
     public String toString(){
       return this.patientName;
        }  
    
    
}
