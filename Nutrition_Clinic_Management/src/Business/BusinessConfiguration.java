package Business;

import static Business.DataGenerator.InitDishName;
import static Business.DataGenerator.InitOrgName;
import static Business.DataGenerator.InitDeficiencyName;
import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author abhilashgp
 */
public class BusinessConfiguration {
    
    public static Environment configure(){
        
        Environment system = Environment.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmpDirectory().createNewEmployee("Nutrition");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        InitDishName();
        InitOrgName();
        InitDeficiencyName();
        
        return system;
    }
    
}
