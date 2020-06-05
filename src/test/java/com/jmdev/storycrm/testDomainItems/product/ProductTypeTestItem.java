package com.jmdev.storycrm.testDomainItems.product;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
public class ProductTypeTestItem {


    private Integer id;
    private String name;

    public ProductTypeTestItem() {
    }

    public static ProductTypeTestItem buildTestItem(){
        ProductTypeTestItem testItem = new ProductTypeTestItem();
        testItem.setId(1);
        testItem.setName("Odbiorniki RTK na tyczkę");
        return testItem;
    }

}
