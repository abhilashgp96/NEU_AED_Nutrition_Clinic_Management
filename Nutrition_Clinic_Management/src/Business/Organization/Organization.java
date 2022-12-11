/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author soumya
 */
public abstract class Organization {
    
    private String orgName;
    private int orgID;
    private WorkQueue workQueue;
    private static int counter=0;
    private UserAccountDirectory userAccountDirectory;
    private EmployeeDirectory empDirectory;
    
    public enum Type{
        Admin("Admin Organization"), Nutritionist("Nutritionist Organization"), Lab("FDA Lab Organization"), Caterer("Caterer Organization"), DishFood("Food Supplier Organization"), Ingredient("Ingredient supplier Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public Organization(String name) {
        this.orgName = name;
        orgID = counter;
        workQueue = new WorkQueue();
        userAccountDirectory = new UserAccountDirectory();
        empDirectory = new EmployeeDirectory();
        
        ++counter;
    }
    
    public abstract ArrayList<Role> getSupportedRole();
    
    public int getOrgID() {
        return orgID;
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    

    public EmployeeDirectory getEmpDirectory() {
        return empDirectory;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return orgName;
    }
    
}
