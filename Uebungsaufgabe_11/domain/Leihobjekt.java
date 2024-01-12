package domain;

public abstract class Leihobjekt {
    private int id;
    private int dauer;
    private boolean status;
    private String titel;
    private String beschreibung;
    private String sprache;

    public Leihobjekt(int id, String titel, String beschreibung, String sprache) {
        this.id = id;
        this.titel = titel;
        this.beschreibung = beschreibung;
        this.sprache = sprache;
    }

    public void leihen() {

    }

    public void retour() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDauer() {
        return dauer;
    }

    public void setDauer(int dauer) {
        this.dauer = dauer;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getSprache() {
        return sprache;
    }

    public void setSprache(String sprache) {
        this.sprache = sprache;
    }
}
