package domain;

import domain.enums.Filmgenre;

import java.util.Collection;

public class Film extends Leihobjekt {

    private String regisseur;
    private Collection<String> schauspieler;
    private Filmgenre genre;
    private static int MAX_LEIHDAUER = 7;

    public Film(int id, String titel, String beschreibung, String sprache, String regisseur, Collection<String> schauspieler, Filmgenre genre) {
        super(id, titel, beschreibung, sprache);
        this.regisseur = regisseur;
        this.schauspieler = schauspieler;
        this.genre = genre;
    }
}
