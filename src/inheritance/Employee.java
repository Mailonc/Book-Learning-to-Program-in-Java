package inheritance;

public class Employee extends CommunityMember{

    private double salary;

    public Employee(String Name) {
        super(Name);
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public void showSalary(){
        System.out.println("salary " + salary);
    }
}
