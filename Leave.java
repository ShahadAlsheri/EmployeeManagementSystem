/*
Shahad Rafi Alshehri
2306119
ICS
Assignment 1
 */
package assignment2;

import java.time.*;
import java.io.*;

public class Leave {
//data feild
    private Employee employee;
    private LocalDate startDate;
    private int daysOfLeave;

//constructor    
    public Leave(Employee employee, LocalDate startDate, int daysOfLeave) {
        this.employee = employee;
        this.startDate = startDate;
        this.daysOfLeave = daysOfLeave;
    }

//---------------------------------------------------------------
/*NOTE:- this method in the UML daigram is shown with no method type while this means that its a void method like the other void methds
In case the peepuse of this method to return a String, the function will become as the folowing method

    public void displayLeaveDetails() {
        return startDate + "    " + daysOfLeave;
    } 
    
I have used the method in the EmployeeManagmentSysteem class using the getters 
    */
    
    public void displayLeaveDetails() {
        System.out.print(startDate + "    " + daysOfLeave);
    }
    
//getters    
    public LocalDate getStartDate() {
        return startDate;
    }

    public int getDaysOfLeave() {
        return daysOfLeave;
    }
}
