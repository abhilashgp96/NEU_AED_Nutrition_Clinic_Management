/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.IngredientCatalogue;

import java.util.ArrayList;

/**
 *
 * @author soumya
 */
public class FoodIngridientDirectory {
    private ArrayList<FoodIngridient> FoodingridientLst;

    public FoodIngridientDirectory() {
        FoodingridientLst =  new ArrayList<FoodIngridient>();
    }

    public ArrayList<FoodIngridient> getFoodIngridientLst() {
        return FoodingridientLst;
    }

    public void setIngridientLst(ArrayList<FoodIngridient> ingridientLst) {
        this.FoodingridientLst = FoodingridientLst;
    }
    
    public FoodIngridient addFoodIngridient()
    {
        FoodIngridient ai = new FoodIngridient();
        FoodingridientLst.add(ai);
        return ai;
    }
    
    public void deleteFoodIngridient(FoodIngridient aid){
     FoodingridientLst.remove(aid);
    }
    
    
}
