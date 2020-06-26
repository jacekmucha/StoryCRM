package com.jmdev.storycrm.testDomainItems.product;

import com.jmdev.storycrm.domain.product.ProductDestination;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDestinationTestItem {



    public static ProductDestination buildTestItem(){
        ProductDestination testItem = new ProductDestination();
        testItem.setId(1);
        testItem.setDescription("Pomiary terenowe GIS");
        return testItem;
    }
}
