/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Deficiency;

import Business.Allergin.Allergin;
import java.util.List;

/**
 *
 * @author Anvita
 */
public class Deficiency {
    private int DeficiencyId;
    private String DeficiencyName;
    private List<Allergin> DeficiencyAllergin;

    public int getDeficiencyId() {
        return DeficiencyId;
    }

    public void setDeficiencyId(int DeficiencyId) {
        this.DeficiencyId = DeficiencyId;
    }

    public String getDeficiencyName() {
        return DeficiencyName;
    }

    public void setDeficiencyName(String DeficiencyName) {
        this.DeficiencyName = DeficiencyName;
    }

    public List<Allergin> getDeficiencyAllergin() {
        return DeficiencyAllergin;
    }

    public void setDeficiencyAllergin(List<Allergin> DeficiencyAllergin) {
        this.DeficiencyAllergin = DeficiencyAllergin;
    }
    
}
