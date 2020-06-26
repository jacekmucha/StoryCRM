package com.jmdev.storycrm.testDomainItems.offer;

import com.jmdev.storycrm.domain.offer.Offer;
import com.jmdev.storycrm.testDomainItems.product.ProductTestItem;
import com.jmdev.storycrm.utils.DateFormatter;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OfferTestItem {


    public static Offer buildTestItem(){
        Offer testItem = new Offer();
        testItem.setId(1L);
        testItem.setProduct(ProductTestItem.buildTestItem());
        testItem.setCreationDate(DateFormatter.fromStringToDate("23-12-2020T12:45:34"));
        testItem.setLastModifyDate(DateFormatter.fromStringToDate("24-12-2020T15:37:21"));
        testItem.setResourceLink("offer resource link");
        return testItem;
    }
}
