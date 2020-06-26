package com.jmdev.storycrm.testDomainItems.product;

import com.jmdev.storycrm.domain.product.ProductMainCategory;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProductMainCategoryTestItem {


    public static ProductMainCategory buildTestItem(){
        ProductMainCategory testItem = new ProductMainCategory();
        testItem.setId(1);
        testItem.setName("Odbiorniki GNSS");
        return testItem;
    }
}
