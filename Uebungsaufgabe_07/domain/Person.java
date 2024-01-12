package domain;

import domain.enums.BusinessPartner;
import domain.enums.Gender;

public class Person extends BusinessPartner {
    private String vorname;
    private String nachname;
    private Gender gender;

    @Override
    public String salutation() {
        return null;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
}
