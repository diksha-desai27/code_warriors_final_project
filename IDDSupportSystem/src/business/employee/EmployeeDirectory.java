/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.employee;

import business.useraccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dikshadesai
 */
public class EmployeeDirectory {
    
    public List<Employee> employeeList;

    public EmployeeDirectory() {
        this.employeeList = new ArrayList();
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Employee createEmployee(String name) {
        Employee emp = new Employee(name);
        employeeList.add(emp);
        return emp;
    }
    
    public void deleteEmployee(Employee emp) {
        employeeList.remove(emp);
    }
    
    
}
