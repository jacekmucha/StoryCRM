package com.jmdev.storycrm.testDomainItems.company;

import com.jmdev.storycrm.domain.company.ContactPerson;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactPersonTestItem {


    public static ContactPerson buildTestItem(){

        ContactPerson testItem = new ContactPerson();
        testItem.setId(1L);
        testItem.setFirstName("Józef");
        testItem.setLastName("Marek");
        testItem.setCompany(CompanyTestItem.buildTestItem());
        testItem.setMobilePhone(234234234);
        testItem.setStationaryPhone(183326951);
        testItem.setEmail("owocarnia@owocarnia.pl");
        return testItem;
    }
}