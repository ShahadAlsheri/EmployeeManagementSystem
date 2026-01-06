/*
Shahad Rafi Alshehri
2306119
ICS
Assignment 2
 */
package assignment2;

import java.util.*;
import java.time.*;
import java.io.*;

public class EmployeeManagementSystem {
//data feild

    private ArrayList<Employee> employee = new ArrayList<>();
//constructor

    public EmployeeManagementSystem() {
    }
    
//---------------------------------------------------------------    
//method to add an employee to the list

    public String AddEmployee(Employee employee) {
        this.employee.add(employee);
        return "added.";
    }
    
//---------------------------------------------------------------    
//method to delet an employee from the list

    public String removeEmployee(int id) {
        if (findEmployeeById(id) == null) {
            return "Employee with ID " + id + " not found.";
        } else {
            employee.remove(findEmployeeById(id));
            return "Employee removed successfully.";
        }
    }
    
//---------------------------------------------------------------
//method that print all the employees in the array list with their informations 

    public String printAllEmployees() {
        String print = "Name            ID    Salary     Bonus     \n";
        for (int i = 0; i < employee.size(); i++) {
            print += employee.get(i).toString();

            if (employee.get(i) instanceof Manager) {
                Manager manage = (Manager) employee.get(i);
                print += "\t " + String.format("%-10.2f", manage.calculateBonus()) + "\n";
            } else if (employee.get(i) instanceof Developer) {
                Developer develope = (Developer) employee.get(i);
                print += "\t " + String.format("%-10.2f", develope.calculateBonus()) + "\n";
            } else if (employee.get(i) instanceof Designer) {
                Designer designe = (Designer) employee.get(i);
                print += "\t " + String.format("%-10.2f", designe.calculateBonus()) + "\n";
            }
        }
        return print;
    }
    
//---------------------------------------------------------------
//method that check wether the employee is already on leave, doesn't exist, or else just give them a leave wich is approved by the meneger if exist

    public String approveLeave(int managerId, int employeeId, LocalDate startDate, int days) {
        String Return = "";
        if ((findEmployeeById(managerId) != null) && (findEmployeeById(employeeId) != null)) {
            Manager manage = (Manager) findEmployeeById(managerId);
            if (findEmployeeById(managerId) instanceof Manager) {
                if (findEmployeeById(employeeId).getState() == "Leave") {
                    Return = "Cannot approve leave for " + findEmployeeById(employeeId).getName() + " as they are already on leave.";
                } else {
                    manage.approveLeave(findEmployeeById(employeeId), startDate, days);
                    findEmployeeById(employeeId).addLeaveRecord(new Leave(findEmployeeById(employeeId), startDate, days));
                    Return += "Leave approved for " + findEmployeeById(employeeId).getName() + ".";
                }
            }
        } else if ((findEmployeeById(managerId) == null) || (findEmployeeById(employeeId) == null)) {
            Return += "Leave approval failed. Either manager ID is incorrect or employee ID does not exist.";
        }
        return Return;
    }
    
//---------------------------------------------------------------
//method that call the markEmployeeAsWorking in the maneger class to mark the employee as currently working

    public String markEmployeeAsWorking(int managerId, int employeeId) {
        String string = "employee or manager do not exest";
        if ((findEmployeeById(managerId) != null) && (findEmployeeById(employeeId) != null)) {
            Manager m = (Manager) findEmployeeById(managerId);
            if (findEmployeeById(managerId) instanceof Manager) {
                m.markEmployeeAsWorking(findEmployeeById(employeeId));
                string = "Employee " + findEmployeeById(employeeId).getName() + " is now marked as working.";
            }
        }
        return string;
    }
    
//---------------------------------------------------------------
//a method that return a string of all leave records to a specific employee

    public String printEmployeeLeaveRecords(int employeeId, PrintWriter out) {
        String string = "";
        Employee employeeLeave = findEmployeeById(employeeId);
        string += ("Leave Records for " + findEmployeeById(employeeId).getName() + ":\nStart Date   Days of Leave  \n");
        for (int i = 0; i < employeeLeave.getLeaveRecord().size(); i++) {
            Leave leave = employeeLeave.getLeaveRecord().get(i);
            string += leave.getStartDate();
            string += "   ";
            string += String.format("%-15d", leave.getDaysOfLeave()) + "\n";
        }
        return string;
    }
    
//---------------------------------------------------------------
//a method that uses the employee ID to find and return a specific employee out of the array of employees

    private Employee findEmployeeById(int id) {
        Employee e = null;
        for (int i = 0; i < employee.size(); i++) {

            if (employee.get(i).getId() == id) {

                e = employee.get(i);
            }
        }
        return e;
    }
}
