package ConvertValue;

import java.util.Scanner;

public class value {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to convert: ");
        int number = sc.nextInt();

        double x = number;

        System.out.println("The converted number is: " + x);


    sc.close();
    }
}
