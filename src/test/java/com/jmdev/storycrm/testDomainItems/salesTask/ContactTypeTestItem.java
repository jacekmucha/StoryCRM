package com.jmdev.storycrm.testDomainItems.salesTask;

import com.jmdev.storycrm.domain.salesTask.ContactType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactTypeTestItem {


    public static ContactType buildTestItemNo1(){
        ContactType testItem = new ContactType();
        testItem.setId(1);
        testItem.setType("email");
        return testItem;
    }

    public static ContactType buildTestItemNo2(){
        ContactType testItem = new ContactType();
        testItem.setId(2);
        testItem.setType("rozmowa telefoniczna");
        return testItem;
    }

    public static ContactType buildTestItemNo3(){
        ContactType testItem = new ContactType();
        testItem.setId(3);
        testItem.setType("SMS");
        return testItem;
    }

    public static ContactType buildTestItemNo4(){
        ContactType testItem = new ContactType();
        testItem.setId(4);
        testItem.setType("Spotkanie w biurze");
        return testItem;
    }

}
