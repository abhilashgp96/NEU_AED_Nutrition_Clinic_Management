/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Dish;

import Business.Allergin.AllerginRecord;

/**
 *
 * @author Anvita
 */
public class Dish {
    private int dishFoodId;
    private String DishFoodName;
    private AllerginRecord allergenRecord;
    private static int counter=0;
    
    public Dish(){
        allergenRecord = new AllerginRecord();
        dishFoodId= counter;
        ++counter;
    }

    public int getDishFoodId() {
        return dishFoodId;
    }


    public AllerginRecord getAllergenRecord() {
        return allergenRecord;
    }

    public void setAllergenRecord(AllerginRecord allergenRecord) {
        this.allergenRecord = allergenRecord;
    }

    public String getDishFoodName() {
        return DishFoodName;
    }

    public void setDishFoodName(String DishFoodName) {
        this.DishFoodName = DishFoodName;
    }

    @Override
    public String toString() {
        return this.DishFoodName;
    }

    
}
