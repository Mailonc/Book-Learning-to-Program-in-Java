package ForAndWhile;

public class Interest {

    public static void main(String[] args) {

        double account;
        double salary = 1000.00;
        double percentage = 0.05;

        System.out.println("total amount, including interest, in the savings account");

        for (int i = 1; i <= 10 ; ++i){
            account = salary * Math.pow(1.0 + percentage,i);

            System.out.printf("%4d%,20.2f%n", i, account);

        }




    }
}
