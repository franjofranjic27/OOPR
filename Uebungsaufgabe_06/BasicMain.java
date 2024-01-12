import domain.Punkt;
import domain.Rechteck;

public class BasicMain {

    public static void main(String[] args) {
        Rechteck rechteckA = new Rechteck(new Punkt(0,0), new Punkt(3,3));
        Rechteck rechteckB = new Rechteck(new Punkt(0,0), new Punkt(-3,-4));
        Rechteck rechteckC = new Rechteck(new Punkt(2,-3), new Punkt(-3,4));
        Rechteck rechteckD = new Rechteck(new Punkt(-2,3), new Punkt(3,-4));

        // Rechteck A
        System.out.println(rechteckA.isSquare());
        System.out.println(rechteckA.getCircumference());
        System.out.println(rechteckA.getLength());
        System.out.println(rechteckA.getWidth());

        // Rechteck B
        System.out.println(rechteckB.isSquare());
        System.out.println(rechteckB.getCircumference());
        System.out.println(rechteckB.getLength());
        System.out.println(rechteckB.getWidth());

        // Rechteck C
        System.out.println(rechteckC.isSquare());
        System.out.println(rechteckC.getCircumference());
        System.out.println(rechteckC.getLength());
        System.out.println(rechteckC.getWidth());

        // Rechteck D
        System.out.println(rechteckD.isSquare());
        System.out.println(rechteckD.getCircumference());
        System.out.println(rechteckD.getLength());
        System.out.println(rechteckD.getWidth());
    }
}
