package domain;

public class Rechteck {
    private Punkt punktA, punktB;

    private int length, width;

    public Rechteck(Punkt punktA, Punkt punktB) {
        this.punktA = punktA;
        this.punktB = punktB;
        this.setLengthAndWidth();
    }

    private void setLengthAndWidth() {
        int difX = Math.abs(punktB.getX() - punktA.getX());
        int difY = Math.abs(punktB.getY() - punktA.getY());

        if (difX >= difY) {
            this.length = difX;
            this.width = difY;
        } else  {
            this.length = difY;
            this.width = difX;
        }
    }

    public boolean isSquare() {
        return length == width;
    }

    public int getCircumference() {
        return 2 * (length + width);
    }

    public void turn(Punkt punkt) {


    }

    public void scale(int factor) {
        int difX = Math.abs(punktB.getX() - punktA.getX()) * factor;
        int difY = Math.abs(punktB.getY() - punktA.getY()) * factor;

        this.punktB.setX(this.length * factor);
        this.punktB.setY(this.width * factor);


    }

    public Rechteck getSection(Rechteck rechteck) {
        return this;
    }

    public int getLength () {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public Punkt getPunktA() {
        return punktA;
    }

    public Punkt getPunktB() {
        return punktB;
    }

    public void setPunktA(Punkt punktA) {
        this.punktA = punktA;
        this.setLengthAndWidth();
    }

    public void setPunktB(Punkt punktB) {
        this.punktB = punktB;
        this.setLengthAndWidth();
    }
}
