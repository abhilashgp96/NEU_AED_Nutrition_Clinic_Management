/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Ingredient;

import java.util.ArrayList;

/**
 *
 * @author soumya
 */
public class IngredientDirectory {
    
    private ArrayList<Ingredient> ingLst;
    
    public IngredientDirectory() {
        
        this.ingLst = new ArrayList<Ingredient>();
    }
    
    public ArrayList<Ingredient> getIngLst() {
        
        return ingLst;
        
    }
    
    public void setIngLst(ArrayList<Ingredient> ingLst) {
        
        this.ingLst = ingLst;
    }
    
}
