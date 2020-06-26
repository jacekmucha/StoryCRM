package com.jmdev.storycrm.testDomainItems.company;

import com.jmdev.storycrm.domain.company.Address;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressTestItem {

    public static Address buildTestItem(){
        Address testItem = new Address();
        testItem.setId(1L);
        testItem.setVoivodeship("malopolskie");
        testItem.setPostalCode("34-650");
        testItem.setCity("Tymbark");
        testItem.setStreet("Kolejowa");
        testItem.setFullBiuldingNumber("56A");
        testItem.setFlatNumber(1);
        return testItem;
    }


}
