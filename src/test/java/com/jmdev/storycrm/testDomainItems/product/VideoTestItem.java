package com.jmdev.storycrm.testDomainItems.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class VideoTestItem {

    private Integer id;
    private String name;
    private String description;
    private String resourceLink;

    public VideoTestItem(){

    }

    public static VideoTestItem buildTestItemNo1(){
        VideoTestItem testItem = new VideoTestItem();
        testItem.setId(1);
        testItem.setName("Prezentacja odbiornika SP60");
        testItem.setDescription("Super film!");
        testItem.setResourceLink("https://www.youtube.com/watch?v=8qU7nRd9fiU");
        return testItem;
    }

    public static VideoTestItem buildTestItemNo2(){
        VideoTestItem testItem = new VideoTestItem();
        testItem.setId(1);
        testItem.setName("Bluetooth dalekiego zasięgu");
        testItem.setDescription("Super film!");
        testItem.setResourceLink("https://www.youtube.com/watch?v=8qU7nRd9fiU");
        return testItem;
    }

    public static VideoTestItem buildTestItemNo3(){
        VideoTestItem testItem = new VideoTestItem();
        testItem.setId(1);
        testItem.setName("Radiomodem");
        testItem.setDescription("Super film!");
        testItem.setResourceLink("https://www.youtube.com/watch?v=8qU7nRd9fiU");
        return testItem;
    }

    public static VideoTestItem buildTestItemNo4(){
        VideoTestItem testItem = new VideoTestItem();
        testItem.setId(1);
        testItem.setName("Z-Blade w terenie z SP60");
        testItem.setDescription("Super film!");
        testItem.setResourceLink("https://www.youtube.com/watch?v=8qU7nRd9fiU");
        return testItem;
    }

}
