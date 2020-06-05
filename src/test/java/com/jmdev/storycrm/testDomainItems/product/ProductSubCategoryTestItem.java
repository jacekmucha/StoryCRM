package com.jmdev.storycrm.testDomainItems.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProductSubCategoryTestItem {

    private Integer id;
    private String name;

    public ProductSubCategoryTestItem(){
    }

    public static ProductSubCategoryTestItem buildTestItem(){
        ProductSubCategoryTestItem testItem = new ProductSubCategoryTestItem();
        testItem.setId(1);
        testItem.setName("Odbiorniki precyzyjne RTK");
        return testItem;
    }

}
