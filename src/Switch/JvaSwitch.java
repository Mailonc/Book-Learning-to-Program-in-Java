package Switch;

import java.util.Scanner;

public class JvaSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int number1 = sc.nextInt();
        System.out.print("Digite um segundo Numero: ");
        int number2 = sc.nextInt();

        int option = 0;

        while(option != 5) {
            System.out.println("========= CALCULADO =========");
            System.out.println("1 - SOMAR");
            System.out.println("2 - SUBTRAIR");
            System.out.println("3 - MULTIPLICAR");
            System.out.println("4 - DIVIDIR");
            System.out.println("5 - SAIR");
            System.out.print("Escolha uma opção: ");

             option = sc.nextInt();

            switch (option) {

                case 1:
                    System.out.println("1 - SOMAR");
                    int a = number1 + number2;
                    System.out.println("Resultado: " + a);
                    break;

                case 2:
                    System.out.println("2 - Subtrair");
                    int b = number1 - number2;
                    System.out.println("Resultado: " + b);
                    break;


                case 3:
                    System.out.println("3 - Multiplicão");
                    int c = number1 * number2;
                    System.out.println("Resultado: " + c);
                    break;


                case 4:
                    if(number2 != 0) {
                        System.out.println("4 - Divisao");
                        int d = number1 / number2;
                        System.out.println("Resultado: " + d);
                    }
                    else{
                        System.out.println("não é possivel divisão por 0");
                    }
                    break;


                case 5:
                    System.out.println("Programa encerrado ");
                    break;


                default:
                    System.out.println("Opção invalida");
                    break;
            }


        }
        sc.close();
      }

    }

