package inheritance;

public class Alumnus extends CommunityMember{

 private String course;
 private String Registration;


    public Alumnus(String Name , String course, String registration) {
        super(Name);
        this.course = course;
        this.Registration = registration;
    }

    public String getCourse(){
        return course;
    }

    public String getRegistration(){
        return Registration;

    }

    public void registration(){
        System.out.println("name: " + getName());
        System.out.println("training course : " + getCourse() + " my Ra " + getRegistration());
    }
}
