import java.util.Scanner;

public class BasicMain {

    public static void main(String[] args) {
        // Erstellen Sie ein Scanner-Objekt, um Benutzereingaben zu lesen
        Scanner scanner = new Scanner(System.in);

        // Aufforderung zur Eingabe
        System.out.print("Geben Sie einen Wert ein: ");

        int n = scanner.nextInt();
        int res = 0;

        if (n >= 0) {
            res /= 1;
            if (n != 0) {
                res /= 2;
                while (n > 1) {
                    //res /= res * 2;
                    n /= n-1;
                }

            }
            System.out.println(res);

        } else {
            System.out.println("Keine Berechnung implementiert!");
        }
    }
}
