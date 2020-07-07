package com.jmdev.storycrm.testDomainItems.product;

import com.jmdev.storycrm.domain.product.ProductSubCategory;

public class ProductSubCategoryTestItem {


    public static ProductSubCategory buildTestItem(){
        ProductSubCategory testItem = new ProductSubCategory();
        testItem.setId(1);
        testItem.setName("Odbiorniki precyzyjne RTK");
        return testItem;
    }

}
