/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DishFoodCatalogue;

import java.util.ArrayList;

/**
 *
 * @author Anvita
 */
public class DishFoodCatalogueDirectory {
    
    private ArrayList<DishFoodCatalogue> dishFoodLst;
    
    public DishFoodCatalogueDirectory(){
    dishFoodLst = new ArrayList<>();
    }

    public ArrayList<DishFoodCatalogue> getDishFoodLst() {
        return dishFoodLst;
    }

    public void setDishFoodLst(ArrayList<DishFoodCatalogue> dishFoodLst) {
        this.dishFoodLst = dishFoodLst;
    }
    
    //adding new DishFood to the list
    public DishFoodCatalogue addDishFood(){
    DishFoodCatalogue bi= new DishFoodCatalogue();
    dishFoodLst.add(bi);
    return bi;
    }
    
    //deleting DishFood object from the list
    public void deleteDishFood(DishFoodCatalogue bi){
    dishFoodLst.remove(bi);
    }
}
