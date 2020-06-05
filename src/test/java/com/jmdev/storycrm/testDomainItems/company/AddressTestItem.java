package com.jmdev.storycrm.testDomainItems.company;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressTestItem {

    private Long id;
    private String voivodeship;
    private String postalCode;
    private String city;
    private String street;
    private String fullBiuldingNumber;
    private Integer flatNumber;

    public AddressTestItem() {
    }

    public static AddressTestItem buildTestItem(){
        AddressTestItem testItem = new AddressTestItem();
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
