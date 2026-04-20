import java.time.*;

public class Manager extends Employee implements Approver {
//constructor
    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }
    
//---------------------------------------------------------------
//a method to calculate the bonus
    public double calculateBonus() {
        double bonus = Math.round(0.15 * super.getSalary() * 100) / 100.0;
        return bonus;
    }
   
//--------------------------------------------------------------- 
//a method to approve the leave and call set the setStateOnLeave method employees' state as on leave
    public void approveLeave(Employee employee, LocalDate date, int days) {
        employee.setStateOnLeave();
    }
    
//---------------------------------------------------------------
//a method to call set the setStateWorking method employees' state as on leave
    public void markEmployeeAsWorking(Employee employee) {
        employee.setStateWorking();
    }

}
