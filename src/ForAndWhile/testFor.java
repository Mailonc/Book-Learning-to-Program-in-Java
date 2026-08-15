package ForAndWhile;

public class testFor {
    public static void main(String[] args) {

        //for(int counter = 1; counter <= 10; counter++){
           // System.out.printf("%d " , counter);

           // System.out.println();


       // for(int j = 2; j <= 80 ; j += 5){ // incremento j += 5 incrementando de 5 em 5
          //  System.out.println(j);


       //int x = 15;
       // int y = 12;

      //  for (int j = x; j <= 4 * x * y; j += y / x){ // colocando expressões Aritmeticas
            //System.out.println();
       // }

        //for (int i = 100 ; i >= 90; i--){
           // System.out.printf("%d ", i);

            //System.out.println();


       // for(int y = 99; y >= 0; y -= 11){
          //  System.out.printf("%d " , y);
          //  System.out.println();
        //}


        int sum = 0;

        for(int number = 2 ; number <= 20; sum += number, number += 2){ // incrementando a variavel sum dentro do for apartir do incremento
           // sum += number;
        }
        System.out.printf("sum is %d%n " , sum);

        }
    }


