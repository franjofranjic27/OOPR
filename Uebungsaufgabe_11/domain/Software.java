package domain;

public class Software extends Leihobjekt {

    private String hersteller;
    private static int MAX_LEIHDAUER = 7;

    public Software(int id, String titel, String beschreibung, String sprache, String hersteller) {
        super(id, titel, beschreibung, sprache);
        this.hersteller = hersteller;
    }
}
