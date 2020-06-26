package com.jmdev.storycrm.testDomainItems.salesTask;

import com.jmdev.storycrm.domain.salesTask.SalesTask;
import com.jmdev.storycrm.utils.DateFormatter;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;


@Getter
@Setter
public class SalesTaskProgressTestItem {

    private Long id;
    private Date thisContactDate;
    private ContactTypeTestItem contactType;
    private String description;

    public SalesTaskProgressTestItem(){

    }

    public static SalesTaskProgressTestItem buildTestItemNo1(){
        SalesTaskProgressTestItem testItem = new SalesTaskProgressTestItem();
        testItem.setId(1L);
        testItem.setThisContactDate(DateFormatter.fromStringToDate("24-05-2020 15:45:34"));
        testItem.setContactType(ContactTypeTestItem.buildTestItemNo1());
        testItem.setDescription("Planuje zakup kolejengo odbiornika");
        return testItem;
    }

    public static SalesTaskProgressTestItem buildTestItemNo2(){
        SalesTaskProgressTestItem testItem = new SalesTaskProgressTestItem();
        testItem.setId(2L);
        testItem.setContactType(ContactTypeTestItem.buildTestItemNo2());
        testItem.setThisContactDate(DateFormatter.fromStringToDate("30-05-2020 10:10:44"));
        testItem.setDescription("Prosi o ponowienie oferty");
        return testItem;
    }

    public static SalesTaskProgressTestItem buildTestItemNo3(){
        SalesTaskProgressTestItem testItem = new SalesTaskProgressTestItem();
        testItem.setId(3L);
        testItem.setContactType(ContactTypeTestItem.buildTestItemNo3());
        testItem.setThisContactDate(DateFormatter.fromStringToDate("11-06-2020 12:32:20"));
        testItem.setDescription("Rozważa wzięcie leasingu");
        return testItem;
    }


}
