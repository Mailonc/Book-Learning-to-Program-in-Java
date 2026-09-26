package RandomNumbers;

import java.security.SecureRandom;
import java.util.Scanner;

public class student {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SecureRandom number = new SecureRandom();

        int hits = 1;
        int a = 0;
        int e = 0;

        do {
            int x = 1 + number.nextInt(10);
            int y = 1 + number.nextInt(10);
            int answer = x * y;
            int user;

            do {

                System.out.print("how much is " + x + " times " + y + " ? ");
                user = sc.nextInt();


                if (user != answer) {

                    user = e;

                        int mens = 1 + number.nextInt(4);
                        switch (mens) {

                            case 1 -> System.out.println("No. Please try again.");
                            case 2 -> System.out.println("Wrong. Try again.");
                            case 3 -> System.out.println("Don't give up!");
                            case 4 -> System.out.println("Don't keep trying!");

                        }
                       e++;
                }


            } while (answer != user);


            answer = a;

            int mens = 1 + number.nextInt(4);

            switch (mens) {

                case 1 -> System.out.println("very good");
                case 2 -> System.out.println("Excellent!");
                case 3 -> System.out.println("Good job!");
                case 4 -> System.out.println("Keep up the good work!");

            }
            a++;

            hits++;

            //int r = s(user , hits);

        } while (hits <= 10);

        
        System.out.println("score:" + a / e * 100);

        sc.close();
    }

    public static int s (int user ,int hits){
     return user / hits * 100;
    }

}
