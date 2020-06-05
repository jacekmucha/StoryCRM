package com.jmdev.storycrm.testDomainItems.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProductMainCategoryTestItem {

    private Integer id;
    private String name;

    public ProductMainCategoryTestItem(){
    }

    public static ProductMainCategoryTestItem buildTestItem(){
        ProductMainCategoryTestItem testItem = new ProductMainCategoryTestItem();
        testItem.setId(1);
        testItem.setName("Odbiorniki GNSS");
        return testItem;
    }
}
