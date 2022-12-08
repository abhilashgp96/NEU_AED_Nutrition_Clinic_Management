/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Allergin;

import java.util.ArrayList;

/**
 *
 * @author Anvita
 */
public class AllerginRecord {
    
    private ArrayList<Allergin> AllerginRecord;
    
    public AllerginRecord(){
     AllerginRecord= new ArrayList<Allergin>();
    }

    public ArrayList<Allergin> getAllerginRecord() {
        return AllerginRecord;
    }

    public void setAllerginRecord(ArrayList<Allergin> AllerginRecord) {
        this.AllerginRecord = AllerginRecord;
    }
    
    //add new allergin
    public Allergin addAllerginLst()
    {
        Allergin a = new Allergin();
        AllerginRecord.add(a);
        return a;
    }
}
