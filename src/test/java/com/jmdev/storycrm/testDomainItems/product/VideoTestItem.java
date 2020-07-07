package com.jmdev.storycrm.testDomainItems.product;

import com.jmdev.storycrm.domain.product.Video;


public class VideoTestItem {


    public static Video buildTestItemNo1(){
        Video testItem = new Video();
        testItem.setId(1);
        testItem.setName("Prezentacja odbiornika SP60");
        testItem.setDescription("Super film!");
        testItem.setResourceLink("https://www.youtube.com/watch?v=8qU7nRd9fiU");
        return testItem;
    }

    public static Video buildTestItemNo2(){
        Video testItem = new Video();
        testItem.setId(1);
        testItem.setName("Bluetooth dalekiego zasięgu");
        testItem.setDescription("Super film!");
        testItem.setResourceLink("https://www.youtube.com/watch?v=8qU7nRd9fiU");
        return testItem;
    }

    public static Video buildTestItemNo3(){
        Video testItem = new Video();
        testItem.setId(1);
        testItem.setName("Radiomodem");
        testItem.setDescription("Super film!");
        testItem.setResourceLink("https://www.youtube.com/watch?v=8qU7nRd9fiU");
        return testItem;
    }

    public static Video buildTestItemNo4(){
        Video testItem = new Video();
        testItem.setId(1);
        testItem.setName("Z-Blade w terenie z SP60");
        testItem.setDescription("Super film!");
        testItem.setResourceLink("https://www.youtube.com/watch?v=8qU7nRd9fiU");
        return testItem;
    }

}
