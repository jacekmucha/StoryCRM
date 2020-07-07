package com.jmdev.storycrm.testDomainItems.product;

import com.jmdev.storycrm.domain.product.ProductMainCategory;

public class ProductMainCategoryTestItem {


    public static ProductMainCategory buildTestItem(){
        ProductMainCategory testItem = new ProductMainCategory();
        testItem.setId(1);
        testItem.setName("Odbiorniki GNSS");
        return testItem;
    }
}
