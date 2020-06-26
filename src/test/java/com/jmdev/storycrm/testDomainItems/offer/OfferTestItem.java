package com.jmdev.storycrm.testDomainItems.offer;

import com.jmdev.storycrm.domain.offer.Offer;
import com.jmdev.storycrm.testDomainItems.product.ProductTestItem;
import com.jmdev.storycrm.utils.DateFormatter;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
public class OfferTestItem {


    public static Offer buildTestItem(){
        Offer testItem = new Offer();
        testItem.setId(1L);
        testItem.setProduct(ProductTestItem.buildTestItem());
        testItem.setCreationDate(DateFormatter.mkyongFromStringToLocalDateTime("2020-12-23 12:45:34"));
        testItem.setLastModifyDate(DateFormatter.mkyongFromStringToLocalDateTime("2020-12-24 15:37:21"));
        testItem.setResourceLink("offer resource link");
        return testItem;
    }
}
