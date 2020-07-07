package com.jmdev.storycrm.testDomainItems.company;

import com.jmdev.storycrm.domain.company.Address;

public class AddressTestItem {

    public static Address buildTestItem(){
        Address testItem = new Address();
        testItem.setId(1L);
        testItem.setVoivodeship("Region name");
        testItem.setPostalCode("99-000");
        testItem.setCity("My City name");
        testItem.setStreet("Main Street name");
        testItem.setFullBiuldingNumber("100");
        testItem.setFlatNumber(1);
        return testItem;
    }


}
