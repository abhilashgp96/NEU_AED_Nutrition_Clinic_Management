/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Allergin;

/**
 *
 * @author Anvita
 */
public class Allergin {
   
    private int AllerginId;
    private String AllerginName;
    private static int count= 1;
    
    public Allergin(){
    AllerginId= count;
    count++;
    }

    public int getAllerginId() {
        return AllerginId;
    }

    public String getAllerginName() {
        return AllerginName;
    }

    public void setAllerginName(String AllerginName) {
        this.AllerginName = AllerginName;
    }

    @Override
    public String toString() {
        return "Allergin{" + "AllerginId=" + AllerginId + ", AllerginName=" + AllerginName + '}';
    }
    
}
