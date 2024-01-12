package domain;

import domain.enums.BusinessPartner;

public class Organisation extends BusinessPartner {
    private String name;
    private Person contactPerson = null;

    @Override
    public String salutation() {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(Person contactPerson) {
        this.contactPerson = contactPerson;
    }
}
