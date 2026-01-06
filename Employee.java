/*
Shahad Rafi Alshehri
2306119
ICS
Assignment 1
 */
package assignment2;

import java.util.*;

public abstract class Employee {
//data feild
    private String name;
    private int id;
    private double salary;
    private String state;
    private ArrayList<Leave> leaveRecords = new ArrayList();
    
//constructor    
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
  
//---------------------------------------------------------------  
// a method that is abstract and will exist in the child classes of this class    
    public abstract double calculateBonus();
    
//to string methed that return the informations about the enmployee    
    @Override
    public String toString() {
        String s = String.format("%-16s%-6s%-8.2f", name, id, salary);
        return s;
    }
   
//--------------------------------------------------------------- 
//a method that add a leave to the record    
    public void addLeaveRecord(Leave leave) {
        leaveRecords.add(leave);
    }
   
//--------------------------------------------------------------- 
//a method that return the leave record    
    public ArrayList<Leave> getLeaveRecord() {
        return leaveRecords;
    }
    
//setters
    public void setStateOnLeave() {
        state = "Leave";
    }

    public void setStateWorking() {
        state = "Working";
    }
    
//getters    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getState() {
        return state;
    }

}
