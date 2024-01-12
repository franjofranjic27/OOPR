public class BasicMain {

    public static void main(String[] args) {
        System.out.println(multiplizieren(4, 5));
        System.out.println(multiplizieren(-1, 5));
        System.out.println(multiplizieren(3, -5));
        System.out.println(multiplizieren(-1, -5));
        System.out.println(multiplizieren(0, -5));
        System.out.println(multiplizieren(5, 0));
    }

    public static int multiplizieren(int zahl1, int zahl2) {
        int res = 0;

        if (zahl1 < 0 && zahl2 < 0) {
            zahl1 = Math.abs(zahl1);
            zahl2 = Math.abs(zahl2);
        }

        for (int i = 0; i < zahl2; i++) {
            res += zahl1;
        }
        return res;
    }
}
