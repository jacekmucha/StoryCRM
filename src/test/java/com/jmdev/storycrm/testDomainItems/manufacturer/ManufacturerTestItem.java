package com.jmdev.storycrm.testDomainItems.manufacturer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ManufacturerTestItem {

    private Integer id;

    private String name;

    public ManufacturerTestItem() {
    }

    public static ManufacturerTestItem buildTestItem(){
        ManufacturerTestItem testItem = new ManufacturerTestItem();
        testItem.setId(1);
        testItem.setName("Spectra Geospatial");
        return testItem;
    }
}

