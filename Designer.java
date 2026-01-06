/*
Shahad Rafi Alshehri
2306119
ICS
Assignment 2
 */
package assignment2;
public class Designer extends Employee{
//constructor    
    public Designer(String name, int id, double salary){
        super(name, id, salary);
    }

//---------------------------------------------------------------
//a method to calculate the bonus
    public double calculateBonus(){
        return 0.1*super.getSalary();
    }
}
