package inheritance;

import javax.sound.midi.spi.SoundbankReader;

public class Student extends CommunityMember{

    private String membershipCard;
    private String year;

    public Student(String Name ,String membershipCard ,String year) {
        super(Name);
        this.membershipCard = membershipCard;
        this.year = year;
    }
    public String getMembershipCard(){
        return membershipCard;

    }
    public String getYear(){
        return year;

    }
    public void studentInformation(){
        System.out.println("Name: " + getName() + "student ID card : " + getMembershipCard() + " expiration year " + getYear());

    }
}
