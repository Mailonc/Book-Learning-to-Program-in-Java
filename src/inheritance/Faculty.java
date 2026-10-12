package inheritance;

public class Faculty extends Employee implements Reportable {


    public Faculty(String Name, double salary, String position) {
        super(Name, salary, position);
    }




    public void report() {
        System.out.println("Name: " + getName() + " salary: " + getSalary() + "Position: " + getPosition());
    }
    @Override
    public double calculatePayment() {
       return getSalary();
    }


    @Override
    public void showInformation() {
        System.out.println("teacher: " + getName() + " salary: " + getSalary());
    }

    @Override
    public void generateReport() {
        System.out.println("Teacher Report: " + getName());

    }

    public String toString() {
        return "Name: " + getName() + " - "
                + "Position: " + getPosition();
    }

}



