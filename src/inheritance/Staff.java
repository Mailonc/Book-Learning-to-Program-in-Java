package inheritance;

public class Staff extends Employee{


    public Staff(String Name, double salary, String position) {
        super(Name, salary, position);
    }

    public void id(){
        System.out.println("Name: " + getName() + " Position: " + getPosition());
    }
}




