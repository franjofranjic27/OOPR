package domain;

import java.util.Collection;

public class Mensa {
    private Collection<Getraenk> getraenkeListe;
    private Collection<Nahrung> menues;

    public void bestellen (Nahrung nahrung, Getraenk getraenk) {
        System.out.println("Gesamte Kosten: " + (nahrung.getPreis() + getraenk.getPreis()));
    }
}
