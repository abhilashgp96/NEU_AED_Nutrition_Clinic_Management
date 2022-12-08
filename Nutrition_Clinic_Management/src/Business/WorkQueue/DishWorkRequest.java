/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Ingredient.Ingredient;
import Business.Nutritionist.Patient;
import Business.Dish.Dish;
import Business.Dish.DishDirectory;
import Business.Allergin.Allergin;
import java.util.List;
import java.util.Map;

/**
 *
 * @author abhilashgp
 */
public class DishWorkRequest extends WorkRequest{
    
    private String dishName;
    private int Quantity;
    private String deliveryTime;
    private Patient patient;
    private Map<Allergin,Ingredient>allerginIngredient;
    private Map<Dish,List<Ingredient>>dishIngredient;
   
    
   
   
    

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Map<Allergin, Ingredient> getAllerginIngredient() {
        return allerginIngredient;
    }

    public void setAllerginIngredient(Map<Allergin, Ingredient> allerginIngredient) {
        this.allerginIngredient = allerginIngredient;
    }

    public Map<Dish, List<Ingredient>> getDishIngredient() {
        return dishIngredient;
    }

    public void setDishIngredient(Map<Dish, List<Ingredient>> dishIngredient) {
        this.dishIngredient = dishIngredient;
    }

    
    @Override
     public String toString(){
       return this.dishName;
        }  
    

    
    
    
    
}
