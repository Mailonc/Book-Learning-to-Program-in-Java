package inheritance;

public abstract class Employee extends CommunityMember implements Payable{

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
    public double salaryBonuses(double bonuses){
        return salary =  salary + bonuses;
    }

    public double salaryDeductions(double deductions){
        return salary =  salary - deductions;
    }

    public abstract void showInformation();


    public void showSalary(){
        System.out.println("Name: " + getName() + "| salary: " + getSalary() + " R$" + " | Position:" + getPosition() );
    }


}
