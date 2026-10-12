package inheritance;

public class Administrator extends Faculty{

    public Administrator(String Name, double salary, String position) {
        super(Name, salary, position);
    }

    public void adm(){
        System.out.println("administrator's name : " + getName() + " administrator's position: " + getPosition());
    }
}

