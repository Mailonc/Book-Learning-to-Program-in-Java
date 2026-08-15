package StaticMetodos;

import java.util.Locale;
import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System .in);

        System.out.print("Enter three floating-point values separated by spaces: ");
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        double number3 = sc.nextDouble();

        double result = maximum(number1, number2, number3);

        System.out.println("Maximum is " + result);


    }
    public static double maximum(double A , double B , double C){

        double maxmumFlex = A;


       // if(B > maxmumFlex){
      //      maxmumFlex = B;

       // }
      //  if (C > maxmumFlex){
            maxmumFlex = C;
      //  }

        return Math.max(A,(Math.max(B,C)));
    }
}
