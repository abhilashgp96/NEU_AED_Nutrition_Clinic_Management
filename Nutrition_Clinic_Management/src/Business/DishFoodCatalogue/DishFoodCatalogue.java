/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DishFoodCatalogue;

import java.util.Date;

/**
 *
 * @author Anvita
 */
public class DishFoodCatalogue {
    
    private String dishFoodname;
    private int reorderlevel;
    private int minstock;
    private int maxstock;
    private Date expirationDate;
    private String cateringCategory;
    private int availableQuantity;
    private double retailPurchasePrice;
    private double marketSellingPrice;
    private int prodId;
    private int serialNumber;
    private int reqdQuant;
    private String reorderStatus="N";

    public String getDishFoodName() {
        return dishFoodname;
    }

    public void setDishFoodName(String dishFoodname) {
        this.dishFoodname = dishFoodname;
    }

    public int getReorderlevel() {
        return reorderlevel;
    }

    public void setReorderlevel(int reorderlevel) {
        this.reorderlevel = reorderlevel;
    }

    public int getMinstock() {
        return minstock;
    }

    public void setMinstock(int minstock) {
        this.minstock = minstock;
    }

    public int getMaxstock() {
        return maxstock;
    }

    public void setMaxstock(int maxstock) {
        this.maxstock = maxstock;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCateringCategory() {
        return cateringCategory;
    }

    public void setCateringCategory(String cateringCategory) {
        this.cateringCategory = cateringCategory;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public double getRetailPurchasePrice() {
        return retailPurchasePrice;
    }

    public void setRetailPurchasePrice(double retailPurchasePrice) {
        this.retailPurchasePrice = retailPurchasePrice;
    }

    public double getMarketSellingPrice() {
        return marketSellingPrice;
    }

    public void setMarketSellingPrice(double marketSellingPrice) {
        this.marketSellingPrice = marketSellingPrice;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getReqdQuant() {
        return reqdQuant;
    }

    public void setReqdQuant(int reqdQuant) {
        this.reqdQuant = reqdQuant;
    }

    public String getReorderStatus() {
        return reorderStatus;
    }

    public void setReorderStatus(String reorderStatus) {
        this.reorderStatus = reorderStatus;
    }

    @Override
    public String toString() {
        return this.dishFoodname;
    }
    
    
         
    
    
}
