package RandomNumbers;

import java.util.Random;
import java.util.Scanner;

public class RandomUtil {
    public static void main(String[] args) {
        Random ram = new Random();
        Scanner sc = new Scanner(System.in);

        int LuckyNumber = ram.nextInt(9000000) + 100000;

        System.out.print("Enter the 6 numbers on your ticket: ");
        int Numbers = sc.nextInt();


        if (Numbers == LuckyNumber) {
            System.out.println("CONGRATULATIONS! YOU'VE WON THE TOP PRIZE");

        } else {

            System.out.print("No luck this time. Keep trying. Ticket number: ");
            System.out.print(Numbers);


        }

    }


}



