/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enterprise.Role;

/**
 *
 * @author Anvita
 */
public class Role {
    
    public enum RoleType{
        
        Accountant("Accountant"),
        FinanceCashier("FinanceCashier"),
        FinancialManager("FinancialManager"),
        Receptionist("Receptionist"),
        ValetParker("ValetParker"),
        FrontOfficeManager("FrontOfficeManager"),
        HRManager("HRManager"),
        HRAssistant("HRAssistant"),
        KitchenManager("KitchenManager"),
        RestaurantManager("RestaurantManager"),
        Chef("Chef"),
        ChefAssistants("ChefAssistants"),
        Waiter("Waiter"),
        Cashier("Cashier"),
        SalesManager("SalesManager"),
        MarketingManager("MarketingManager"),
        PurchaseManager("PurchaseManager"),
        CleaningManager("CleaningManager"),
        SecurityManager("SecurityManager"),
        MaintenanceManager("MaintenanceManager");
     
        
        private String value;
        private RoleType(String value){
         this.value=value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "RoleType{" + "value=" + value + '}';
        }
        
              
    }
    
    public RoleType type;
    
    @Override
    public String toString() {
        return (type != null) ? this.type.getValue() : this.getClass().getName();
    }
}
