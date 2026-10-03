package inheritance;

    public class CommunityMember {

    private String Name;


     public CommunityMember(String Name){
         this.Name = Name;
     }

     public String getName(){
         return Name;
     }

     public void showName(){
         System.out.println(Name + " name");
     }

}
