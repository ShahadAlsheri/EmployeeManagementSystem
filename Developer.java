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
