package assignment2;
/*
Shahad Rafi Alshehri
2306119
ICS
Assignment 2
 */
import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Test_Main {

    public static void main(String[] args) throws IOException {
        String[] Split = new String[10];
        EmployeeManagementSystem system = new EmployeeManagementSystem();

        File input = new File("input.txt");
        File output = new File("output.txt");
//check if fille exist
        if (!input.exists()) {
            System.out.print("File " + input.getName() + " does not exests");
            System.exit(0);
        }
//intinalize a scanner and a print writer
        Scanner in = new Scanner(input);
        PrintWriter out = new PrintWriter(output);
//reed from the file and do commands
        while (in.hasNext()) {
            Split = in.nextLine().split("[, ]+");
            switch (Split[0]) {
                case "Add_Manager": {
                    Manager m = new Manager(Split[1], Integer.parseInt(Split[2]), Integer.parseInt(Split[3]));
                    out.println("Manager " + Split[1] + " " + system.AddEmployee(m));
                    break;
                }
                case "Add_Developer": {
                    Developer d = new Developer(Split[1], Integer.parseInt(Split[2]), Integer.parseInt(Split[3]));
                    out.println("Developer " + Split[1] + " " + system.AddEmployee(d));
                    break;
                }
                case "Add_Designer": {
                    Designer de = new Designer(Split[1], Integer.parseInt(Split[2]), Integer.parseInt(Split[3]));
                    out.println("Designer " + Split[1] + " " + system.AddEmployee(de));
                    break;
                }
                case "Give_Leave": {
                    out.println(system.approveLeave(Integer.parseInt(Split[1]), Integer.parseInt(Split[2]), LocalDate.parse(Split[3]), Integer.parseInt(Split[4])));
                    break;
                }
                case "Change_State": {
                    out.println(system.markEmployeeAsWorking(Integer.parseInt(Split[1]), Integer.parseInt(Split[2])));
                    break;
                }
                case "del_Employee": {
                    out.println(system.removeEmployee(Integer.parseInt(Split[1])));
                    break;
                }
                case "printAllEmployees": {
                    out.print(system.printAllEmployees());
                    break;
                }
                case "print_Leave_Records": {
                    out.println(system.printEmployeeLeaveRecords(Integer.parseInt(Split[1]), out));
                    break;
                }
            }
        }
//close the print writer and the scanner
        in.close();
        out.flush();
        out.close();
    }
}
