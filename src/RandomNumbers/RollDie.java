package RandomNumbers;

import java.security.SecureRandom;


public class RollDie {
    static void main() {

      SecureRandom randomNumbers = new SecureRandom();

      int fraquency1 = 0;
      int fraquency2 = 0;
      int fraquency3 = 0;
      int fraquency4 = 0;
      int fraquency5 = 0;
      int fraquency6 = 0;

      for(int roll = 1; roll <= 6000000; roll++) {
          int face = 1 + randomNumbers.nextInt(6);

          switch (face) {

              case 1:
                  ++fraquency1;
                  break;

              case 2:
                  ++fraquency2;
                  break;

              case 3:
                  ++fraquency3;
                  break;

              case 4:
                  ++fraquency4;
                  break;

              case 5:
                  ++fraquency5;
                  break;

              case 6:
                  ++fraquency6;
                  break;
          }
      }

        System.out.println("Face\tFrequeny");
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n" , fraquency1 ,fraquency2, fraquency3, fraquency4 ,fraquency5, fraquency6);
    }
}
