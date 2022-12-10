/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author abhilashgp
 */
public class CateringWorkRequest extends WorkRequest{
     private String dishFoodName;
    private int Quantity;
    private Date requestDate;
    private String status;
    private String supplierName;
    private  String patientName;
    private String network;

    public String getDishFoodName() {
        return dishFoodName;
    }

    public void setDishFoodName(String dishFoodName) {
        this.dishFoodName = dishFoodName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

   

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    @Override
    public String toString() {
        return this.dishFoodName;
    }
    
    
    
    
    
}
