package domain;

public class Person {
    private String vorname;
    private String familienname;
    private String geschlecht;
    private int alter;
    private Person partner;

    public Person(String vorname, String familienname, String geschlecht, int alter) {
        this.vorname = vorname;
        this.familienname = familienname;
        this.geschlecht = geschlecht;
        this.alter = alter;
    }

    public void heiraten(Person partner) {
        if (alter >= 18 && this.partner == null && partner.partner == null) {
            this.partner = partner;
            this.partner.partner = this;
        } else {
            System.out.println(this.vorname + this.familienname + " ist bereits verheiratet");
        }
    }

    public void scheiden(Person partner) {
        if (partner != null) {
            this.partner.partner = null;
            this.partner = null;
        }
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getFamilienname() {
        return familienname;
    }

    public void setFamilienname(String familienname) {
        this.familienname = familienname;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public Person getPartner() {
        return partner;
    }
}
