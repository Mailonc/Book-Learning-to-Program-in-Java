package OverloadingMethods;

public class Mathematics {

    static void main() {

        System.out.printf("the mathematical sum of two prime integers %d%n" , mat(20));
        System.out.printf("the sum of two double prime numbers %f%n" , mat(8.5));

    }

    public static int mat(int sum){
        System.out.printf("The sum of this integer is: %d%n" , sum );
        return sum * sum;
    }
    public static double mat(double sum) {
        System.out.printf("The sum of this integer is: %f%n", sum);
        return sum + sum;


    }
}
