/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.IngredientCatalogue;

import java.util.Date;

/**
 *
 * @author soumya
 */
public class Ingridient {
    
    private String ingriName;
    
    private Date expirationDate;
    private String CateringCategory;
    private int productId;
    private int serialNumber;
    private int reqdQuantity;
    private int reorderLevel;
    private String reorderStatus="N";
    private int availableQuantity;
    private int minStock;
    private int maxStock;
    private double retailPurchasePrice;
    private double marketSellingPrice;

    public String getIngriName() {
        return ingriName;
    }

    public void setIngriName(String ingriName) {
        this.ingriName = ingriName;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCateringCategory() {
        return CateringCategory;
    }

    public void setCateringCategory(String CateringCategory) {
        this.CateringCategory = CateringCategory;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getReqdQuantity() {
        return reqdQuantity;
    }

    public void setReqdQuantity(int reqdQuantity) {
        this.reqdQuantity = reqdQuantity;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public String getReorderStatus() {
        return reorderStatus;
    }

    public void setReorderStatus(String reorderStatus) {
        this.reorderStatus = reorderStatus;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public int getMinStock() {
        return minStock;
    }

    public void setMinStock(int minStock) {
        this.minStock = minStock;
    }

    public int getMaxStock() {
        return maxStock;
    }

    public void setMaxStock(int maxStock) {
        this.maxStock = maxStock;
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

    
    
    @Override
     public String toString(){
       return this.ingriName;
        } 
    
    
}
