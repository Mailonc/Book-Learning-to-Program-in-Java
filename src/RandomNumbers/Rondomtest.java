package RandomNumbers;

import java.security.SecureRandom;

public class Rondomtest {

    static void main() {

        SecureRandom numbers = new SecureRandom();

        for (int i = 1; i <= 10; i++) {

            int f = 1 + numbers.nextInt(2);

            System.out.print(f);

            if (f == 1){
                System.out.println(" : cara");
            }
            else{
                System.out.println(" : coroa");
            }



        }
    }


}
