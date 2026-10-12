package inheritance;

public class Staff extends Employee implements Reportable{


    public Staff(String Name, double salary, String position) {
        super(Name, salary, position);
    }


    public void showInformation(){
        System.out.println("Name: " + getName() + " Salary: " + getSalary());
    }


    public void id(){
        System.out.println("Name: " + getName() + " Position: " + getPosition());
    }

    @Override
    public String toString(){
        return "Name: " + getName() + " - "
               + "Position: " + getPosition();
    }

    @Override
    public void generateReport() {
        System.out.println("Employee Report: " + getName());
    }
}




