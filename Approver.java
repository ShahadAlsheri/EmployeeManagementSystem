/*
Shahad Rafi Alshehri
2306119
ICS
Assignment 1
 */
package assignment2;

import java.time.*;

public interface Approver {
//two abstract method wich will be in the classes that implemets this class
    void approveLeave(Employee e, LocalDate d, int u);

    void markEmployeeAsWorking(Employee e);
}
