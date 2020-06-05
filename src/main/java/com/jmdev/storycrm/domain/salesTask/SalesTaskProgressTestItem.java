package com.jmdev.storycrm.domain.salesTask;

import com.jmdev.storycrm.utils.DateFormatter;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;


@Getter
@Setter
public class SalesTaskProgressTestItem {

    private Long id;
    private SalesTaskTestItem salesTaskTestItem;
    private ContactTypeTestItem contactTypeTestItem;
    private Date thisContactDate;
    private String description;

    public SalesTaskProgressTestItem(){

    }



    public static SalesTaskProgressTestItem buildTestItem(){
        SalesTaskProgressTestItem testItem = new SalesTaskProgressTestItem();
        testItem.setId(1L);
        testItem.setSalesTaskTestItem();
        testItem.setContactTypeTestItem();
        testItem.setThisContactDate(DateFormatter.fromStringToDate("24-05-2020 15:45:34"));
        testItem.setDescription("Planuje zakup kolejengo odbiornika");
        return testItem;
    }


}
