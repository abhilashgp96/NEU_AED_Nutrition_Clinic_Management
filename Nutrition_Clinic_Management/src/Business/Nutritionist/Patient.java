/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Nutritionist;

import Business.Allergin.AllerginRecord;

/**
 *
 * @author Anvita
 */
public class Patient {
    private int patientId;
    private String patientFullName;
    private int age;
    private String gender;
    private String Test;
    private AllerginRecord allerginHistory;
    private String sex;
    private String newDish;
    private String clinicStatus;
    
    public Patient(){
        allerginHistory = new AllerginRecord();
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientFullName() {
        return patientFullName;
    }

    public void setPatientFullName(String patientFullName) {
        this.patientFullName = patientFullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTest() {
        return Test;
    }

    public void setTest(String Test) {
        this.Test = Test;
    }

    public AllerginRecord getAllerginHistory() {
        return allerginHistory;
    }

    public void setAllerginHistory(AllerginRecord allerginHistory) {
        this.allerginHistory = allerginHistory;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNewDish() {
        return newDish;
    }

    public void setNewDish(String newDish) {
        this.newDish = newDish;
    }

    public String getClinicStatus() {
        return clinicStatus;
    }

    public void setClinicStatus(String clinicStatus) {
        this.clinicStatus = clinicStatus;
    }

    @Override
    public String toString() {
        return this.patientFullName;
    }
    
            
    
          
    
}
