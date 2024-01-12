package domain;

import domain.enums.Buchkategorie;

public class Buch extends Leihobjekt {

    private String isbn;
    private String autor;
    private Buchkategorie kategorie;
    private static int MAX_LEIHDAUER = 30;

    public Buch(int id, String titel, String beschreibung, String sprache, String isbn, String autor, Buchkategorie kategorie) {
        super(id, titel, beschreibung, sprache);
        this.isbn = isbn;
        this.autor = autor;
        this.kategorie = kategorie;
    }
}
