/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author abhilashgp
 */
public class IngredientWorkRequest extends WorkRequest{
    
   
    private String status;
    private String ingredientName;
    private int Quantity;
    private String deliveryTime;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
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
     @Override
    public String toString() {
        return ingredientName;
    }
    
    
    
}
