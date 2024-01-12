import domain.Organisation;
import domain.Person;
import domain.enums.BusinessPartner;

import java.util.ArrayList;
import java.util.List;

public class BasicMain {

    public static void main(String[] args) {
        List<BusinessPartner> businessPartnerList = new ArrayList<>();

        Person personA = new Person();
        businessPartnerList.add(personA);

        Person personB = new Person();
        businessPartnerList.add(personB);

        Organisation organisationA = new Organisation();
        businessPartnerList.add(organisationA);

        Organisation organisationB = new Organisation();
        businessPartnerList.add(organisationB);

        for (BusinessPartner bp : businessPartnerList) {
            System.out.println(bp.getAddress());
        }
    }
}
