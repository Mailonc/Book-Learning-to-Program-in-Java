package RandomNumbers;

import java.security.SecureRandom;
import java.util.Scanner;

public class student {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SecureRandom number = new SecureRandom();

        int hits = 1;

        do {
            int x = 1 + number.nextInt(10);
            int y = 1 + number.nextInt(10);
            int answer = x * y;
            int user;


            do {

                System.out.print("how much is " + x + " times " + y + " ? ");
                user = sc.nextInt();

                if (user != answer) {

                    int mens = 1 + number.nextInt(4);
                    switch (mens) {

                        case 1 -> System.out.println("No. Please try again.");
                        case 2 -> System.out.println("Wrong. Try again.");
                        case 3 -> System.out.println("Don't give up!");
                        case 4 -> System.out.println("Don't keep trying!");

                    }

                }


            } while (answer != user);

            int mens = 1 + number.nextInt(4);

            switch (mens) {

                case 1 -> System.out.println("very good");
                case 2 -> System.out.println("Excellent!");
                case 3 -> System.out.println("Good job!");
                case 4 -> System.out.println("Keep up the good work!");


            }
            hits++;

        } while (hits <= 10);

        System.out.println();


        sc.close();
    }

}
