/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.IngredientCatalogue;
import Business.DishFoodCatalogue.DishFoodCatalogue;
import java.util.ArrayList;

/**
 *
 * @author soumya
 */
public class IngridientDirectory {
    private ArrayList<Ingridient> ingridientLst;

    public IngridientDirectory() {
        ingridientLst =  new ArrayList<Ingridient>();
    }

    public ArrayList<Ingridient> getIngridientLst() {
        return ingridientLst;
    }

    public void setIngridientLst(ArrayList<Ingridient> ingridientLst) {
        this.ingridientLst = ingridientLst;
    }
    
    public Ingridient addFoodIngridient()
    {
        Ingridient ai = new Ingridient();
        ingridientLst.add(ai);
        return ai;
    }
    
    public void deleteIngridient(Ingridient aid){
     ingridientLst.remove(aid);
    }
    
    
}
