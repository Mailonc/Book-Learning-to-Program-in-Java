package inheritance;


public class inheritanceTast {

    static void main() {


        Employee[] e = new Employee[2];

        e[0] = new Staff("CESAR", 12000, "TI");
        e[1] = new Faculty("BREND", 4750, "Administration");

        for (Employee emp : e) {

            if (emp instanceof Staff s) {
                s.generateReport();

            } else if (emp instanceof Faculty f) {
                f.generateReport();
            }


        }
    }

}