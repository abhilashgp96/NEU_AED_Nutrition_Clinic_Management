/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

/**
 *
 * @author Anvita
 */
public class Enterprise {
    private String eName;
    private int eID;
    private static int eCount=1;
    
    
    public Enterprise(){
    
        eID=eCount;
        eCount++;
    
    }

    public String geteName() {
        return eName;
    }

    public int geteID() {
        return eID;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    @Override
    public String toString() {
        return "Enterprise{" + "eName=" + eName + '}';
    }
}
