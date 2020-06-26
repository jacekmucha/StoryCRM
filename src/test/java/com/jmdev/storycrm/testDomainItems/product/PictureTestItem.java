package com.jmdev.storycrm.testDomainItems.product;

import com.jmdev.storycrm.domain.product.Picture;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PictureTestItem {


    public static Picture buildTestItemNo1(){
        Picture testItem = new Picture();
        testItem.setId(1);
        testItem.setName("Czasza odbiornika SP60");
        testItem.setDescription("lorem ipsum lorem ipsum lorem ipsum lorem ipsum");
        testItem.setResourceLink("/sdsfs/asdasd/1.png");
        return testItem;
    }

    public static Picture buildTestItemNo2(){
        Picture testItem = new Picture();
        testItem.setId(1);
        testItem.setName("Spód odbiornika SP60");
        testItem.setDescription("lorem ipsum lorem ipsum lorem ipsum lorem ipsum");
        testItem.setResourceLink("/sdsfs/asdasd/2.png");
        return testItem;
    }

    public static Picture buildTestItemNo3(){
        Picture testItem = new Picture();
        testItem.setId(1);
        testItem.setName("Wnętrze odbiornika SP60");
        testItem.setDescription("lorem ipsum lorem ipsum lorem ipsum lorem ipsum");
        testItem.setResourceLink("/sdsfs/asdasd/3.png");
        return testItem;
    }

    public static Picture buildTestItemNo4(){
        Picture testItem = new Picture();
        testItem.setId(1);
        testItem.setName("Baterie do odbiornika SP60");
        testItem.setDescription("lorem ipsum lorem ipsum lorem ipsum lorem ipsum");
        testItem.setResourceLink("/sdsfs/asdasd/4.png");
        return testItem;
    }
}
