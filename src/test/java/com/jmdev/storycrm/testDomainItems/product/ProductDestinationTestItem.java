package com.jmdev.storycrm.testDomainItems.product;

import com.jmdev.storycrm.domain.product.ProductDestination;

public class ProductDestinationTestItem {



    public static ProductDestination buildTestItem(){
        ProductDestination testItem = new ProductDestination();
        testItem.setId(1);
        testItem.setDescription("Pomiary terenowe GIS");
        return testItem;
    }
}
