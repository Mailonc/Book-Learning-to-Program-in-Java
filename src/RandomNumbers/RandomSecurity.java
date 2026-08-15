package RandomNumbers;

import java.security.SecureRandom;

public class RandomSecurity {
    public static void main(String[] args) {

        SecureRandom RamdomNumbers = new SecureRandom();

        System.out.println("We're looking at “Random” in practice");

        for (int i = 1; i <= 20; i++) {
            int Ram = 1 + RamdomNumbers.nextInt(10);
            
            System.out.println(Ram);

            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
