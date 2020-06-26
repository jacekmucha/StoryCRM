package com.jmdev.storycrm.testDomainItems.manufacturer;

import com.jmdev.storycrm.domain.manufacturer.Manufacturer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ManufacturerTestItem {


    public static Manufacturer buildTestItem(){
        Manufacturer testItem = new Manufacturer();
        testItem.setId(1);
        testItem.setName("Spectra Geospatial");
        return testItem;
    }
}

