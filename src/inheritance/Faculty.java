package inheritance;

public class Faculty extends Employee{


    public Faculty(String Name, double salary, String position) {
        super(Name, salary, position);
    }

    public void report(){
        System.out.println("Name: " + getName() + " salary: " + getSalary() + "Position: " + getPosition());
    }
}




