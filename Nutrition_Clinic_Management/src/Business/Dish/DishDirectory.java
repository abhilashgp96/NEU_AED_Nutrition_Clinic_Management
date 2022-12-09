/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Dish;

import java.util.ArrayList;

/**
 *
 * @author Anvita
 */
public class DishDirectory {
    private ArrayList<Dish> dishLst;
    public DishDirectory(){
     dishLst = new ArrayList<Dish>();
    }

    public ArrayList<Dish> getDishLst() {
        return dishLst;
    }

    public void setDishLst(ArrayList<Dish> dishLst) {
        this.dishLst = dishLst;
    }
    
    public Dish addDishLst(){
    
        Dish d = new Dish();
        dishLst.add(d);
        return d;
    }
}
