package domain.enums;

import domain.Address;
import domain.BusinessPartnerSalutation;

public class BusinessPartner implements BusinessPartnerSalutation {
    private Address address;

    @Override
    public String salutation() {
        return null;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
