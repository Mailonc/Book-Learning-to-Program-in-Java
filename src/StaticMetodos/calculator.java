package StaticMetodos;

public class calculator {
    public static void main(String[] args) {

        int sum1 = 12;
        int sum2 = 30;

        int r = x(sum1 , sum2);

      System.out.println("The sum of the two numbers is: " +  r);

    }

    public static int x (int sum1 , int sum2){

        return sum1 + sum2;
    }
}
