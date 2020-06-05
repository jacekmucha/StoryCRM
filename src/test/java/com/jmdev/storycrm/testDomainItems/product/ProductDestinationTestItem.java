package com.jmdev.storycrm.testDomainItems.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDestinationTestItem {

    private Integer id;
    private String description;

    public ProductDestinationTestItem() {
    }

    public static ProductDestinationTestItem buildTestItem(){
        ProductDestinationTestItem testItem = new ProductDestinationTestItem();
        testItem.setId(1);
        testItem.setDescription("Pomiary terenowe GIS");
        return testItem;
    }
}
