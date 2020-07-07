package com.jmdev.storycrm.testDomainItems.salesTask;

import com.jmdev.storycrm.domain.salesTask.SalesTaskProgress;
import com.jmdev.storycrm.utils.DateFormatter;

public class SalesTaskProgressTestItem {


    public static SalesTaskProgress buildTestItemNo1(){
        SalesTaskProgress testItem = new SalesTaskProgress();
        testItem.setId(1L);
        testItem.setThisContactDate(DateFormatter.mkyongFromStringToLocalDateTime("2020-05-24 15:45:34"));
        testItem.setContactType(ContactTypeTestItem.buildTestItemNo1());
        testItem.setDescription("Planuje zakup kolejengo odbiornika");
        return testItem;
    }

    public static SalesTaskProgress buildTestItemNo2(){
        SalesTaskProgress testItem = new SalesTaskProgress();
        testItem.setId(2L);
        testItem.setContactType(ContactTypeTestItem.buildTestItemNo2());
        testItem.setThisContactDate(DateFormatter.mkyongFromStringToLocalDateTime("2020-05-30 10:10:44"));
        testItem.setDescription("Prosi o ponowienie oferty");
        return testItem;
    }

    public static SalesTaskProgress buildTestItemNo3(){
        SalesTaskProgress testItem = new SalesTaskProgress();
        testItem.setId(3L);
        testItem.setContactType(ContactTypeTestItem.buildTestItemNo3());
        testItem.setThisContactDate(DateFormatter.mkyongFromStringToLocalDateTime("2020-06-11 12:32:20"));
        testItem.setDescription("Rozważa wzięcie leasingu");
        return testItem;
    }


}
