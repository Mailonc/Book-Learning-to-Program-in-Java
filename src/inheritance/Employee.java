package inheritance;

public class Employee extends CommunityMember{

    private double salary;
    private String position;

    public Employee(String Name, double salary, String position ) {
        super(Name);
        this.salary = salary;
        this.position = position;
    }
    public String getPosition(){
        return position;
    }

    public double getSalary(){
        return salary;
    }

    public void showSalary(){
        System.out.println("Name: " + getName() + "| salary: " + getSalary() + " R$" + " | Position:" + getPosition() );
    }

    public double salaryBonuses(double bonuses){
        return salary =  salary + bonuses;
    }

    public double salaryDeductions(double deductions){
        return salary =  salary - deductions;
    }
}
