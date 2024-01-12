package domain;

public class Zeitschrift extends Leihobjekt {

    private String ausgabe;
    private static int MAX_LEIHDAUER = 14;

    public Zeitschrift(int id, String titel, String beschreibung, String sprache, String ausgabe) {
        super(id, titel, beschreibung, sprache);
        this.ausgabe = ausgabe;
    }
}
