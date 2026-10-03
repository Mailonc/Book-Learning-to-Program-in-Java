package inheritance;


public class inheritanceTast {

    static void main() {

        Staff staff = new Staff("Mailon Cesar Luiz", 3600.00, "TI");

        System.out.println("Current Salary: " + staff.getSalary() + " Employee: " + staff.getName());

        System.out.println("salary adjustment: " + staff.salaryBonuses(500) + " Bonus");
    }
}