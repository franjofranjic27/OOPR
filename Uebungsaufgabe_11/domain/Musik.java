package domain;

import domain.enums.Musikgenre;

public class Musik extends Leihobjekt {

    private String interpret;
    private Musikgenre genre;
    private static int MAX_LEIHDAUER = 7;

    public Musik(int id, String titel, String beschreibung, String sprache, String interpret, Musikgenre genre) {
        super(id, titel, beschreibung, sprache);
        this.interpret = interpret;
        this.genre = genre;
    }
}
