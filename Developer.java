/*
Shahad Rafi Alshehri
2306119
ICS
Assignment 1
 */
package assignment2;

public class Developer extends Employee {
//constructor
    public Developer(String name, int id, double salary) {
        super(name, id, salary);
    }
    
//---------------------------------------------------------------
//a method to calculate the bonus
    public double calculateBonus() {
        return 0.12 * super.getSalary();
    }
}
