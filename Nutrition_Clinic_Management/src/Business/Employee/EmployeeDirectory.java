/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author abhilashgp
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeLst;

    public EmployeeDirectory() {
        employeeLst = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeLst() {
        return employeeLst;
    }
    
    public Employee createNewEmployee(String name){
        Employee employee = new Employee();
        employee.setEmpName(name);
        employeeLst.add(employee);
        return employee;
    }
}