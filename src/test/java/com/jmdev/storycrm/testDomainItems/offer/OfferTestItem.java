package com.jmdev.storycrm.testDomainItems.offer;

import com.jmdev.storycrm.domain.product.Product;
import com.jmdev.storycrm.testDomainItems.product.ProductTestItem;
import com.jmdev.storycrm.utils.DateFormatter;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class OfferTestItem {

    private Long id;
    private ProductTestItem product;
    private Date creationDate;
    private Date lastModifyDate;
    private String resourceLink;

    public OfferTestItem() {
    }

    public static OfferTestItem buildTestItem(){
        OfferTestItem testItem = new OfferTestItem();
        testItem.setId(1L);
        testItem.setProduct(ProductTestItem.buildTestItem());
        testItem.setCreationDate(DateFormatter.fromStringToDate("23-12-2020 12:45:34"));
        testItem.setLastModifyDate(DateFormatter.fromStringToDate("24-12-2020 15:37:21"));
        testItem.setResourceLink("offer resource link");
        return testItem;
    }
}
