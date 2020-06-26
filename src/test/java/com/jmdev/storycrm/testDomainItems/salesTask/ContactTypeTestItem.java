package com.jmdev.storycrm.testDomainItems.salesTask;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactTypeTestItem {


    private Integer id;
    private String type;

    public ContactTypeTestItem() {
    }

    public static ContactTypeTestItem buildTestItemNo1(){
        ContactTypeTestItem testItem = new ContactTypeTestItem();
        testItem.setId(1);
        testItem.setType("email");
        return testItem;
    }

    public static ContactTypeTestItem buildTestItemNo2(){
        ContactTypeTestItem testItem = new ContactTypeTestItem();
        testItem.setId(2);
        testItem.setType("rozmowa telefoniczna");
        return testItem;
    }

    public static ContactTypeTestItem buildTestItemNo3(){
        ContactTypeTestItem testItem = new ContactTypeTestItem();
        testItem.setId(3);
        testItem.setType("SMS");
        return testItem;
    }

    public static ContactTypeTestItem buildTestItemNo4(){
        ContactTypeTestItem testItem = new ContactTypeTestItem();
        testItem.setId(4);
        testItem.setType("Spotkanie w biurze");
        return testItem;
    }

}
