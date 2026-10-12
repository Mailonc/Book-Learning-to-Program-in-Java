package inheritance;


import java.util.Locale;

public class inheritanceTast {

    static void main() {

        Locale.setDefault(Locale.US);
        Employee[] pay = new Employee[3];

        pay[0] = new Staff("Mailon", 12150, "TI");
        pay[1] = new Faculty("Mary", 5800, "Analytic");
        pay[2] = new Staff("Victoria", 7500, "Tech");


        double sun = 0;
        for (Employee e : pay) {
            e.showInformation();


            double payment = e.calculatePayment();
            System.out.printf("payment: %.2f%n", payment);
            sun += payment;
        }
        System.out.printf("Total: %.2f%n", sun);

    }
}
