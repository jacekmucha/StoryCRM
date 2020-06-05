package com.jmdev.storycrm.testDomainItems.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PictureTestItem {


    private Integer id;
    private String name;
    private String description;
    private String resourceLink;

    public PictureTestItem() {
    }

    public static PictureTestItem buildTestItemNo1(){
        PictureTestItem testItem = new PictureTestItem();
        testItem.setId(1);
        testItem.setName("Czasza odbiornika SP60");
        testItem.setDescription("lorem ipsum lorem ipsum lorem ipsum lorem ipsum");
        testItem.setResourceLink("/sdsfs/asdasd/1.png");
        return testItem;
    }

    public static PictureTestItem buildTestItemNo2(){
        PictureTestItem testItem = new PictureTestItem();
        testItem.setId(1);
        testItem.setName("Spód odbiornika SP60");
        testItem.setDescription("lorem ipsum lorem ipsum lorem ipsum lorem ipsum");
        testItem.setResourceLink("/sdsfs/asdasd/2.png");
        return testItem;
    }

    public static PictureTestItem buildTestItemNo3(){
        PictureTestItem testItem = new PictureTestItem();
        testItem.setId(1);
        testItem.setName("Wnętrze odbiornika SP60");
        testItem.setDescription("lorem ipsum lorem ipsum lorem ipsum lorem ipsum");
        testItem.setResourceLink("/sdsfs/asdasd/3.png");
        return testItem;
    }

    public static PictureTestItem buildTestItemNo4(){
        PictureTestItem testItem = new PictureTestItem();
        testItem.setId(1);
        testItem.setName("Baterie do odbiornika SP60");
        testItem.setDescription("lorem ipsum lorem ipsum lorem ipsum lorem ipsum");
        testItem.setResourceLink("/sdsfs/asdasd/4.png");
        return testItem;
    }
}
