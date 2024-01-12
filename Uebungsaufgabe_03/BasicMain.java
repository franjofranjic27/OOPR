import java.util.Scanner;

public class BasicMain {

    public static void main(String[] args) {
        // Erstellen Sie ein Scanner-Objekt, um Benutzereingaben zu lesen
        Scanner scanner = new Scanner(System.in);

        // Aufforderung zur Eingabe
        System.out.print("Geben Sie einen Wert ein: ");

        int n = scanner.nextInt();

        int t = 0;
        int i = 1;

        while (i <= n) {
            if (n % i == 0) {
                t = t + 1;
            }
            i = i + 1;
        }

        if (t == 2) {
            System.out.println("ja");
        } else {
            System.out.println("nein");
        }
    }
}
