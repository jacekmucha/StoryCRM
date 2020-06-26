package com.jmdev.storycrm.testDomainItems.product;

import com.jmdev.storycrm.domain.product.ProductType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
public class ProductTypeTestItem {



    public static ProductType buildTestItem(){
        ProductType testItem = new ProductType();
        testItem.setId(1);
        testItem.setName("Odbiorniki RTK na tyczkę");
        return testItem;
    }

}
