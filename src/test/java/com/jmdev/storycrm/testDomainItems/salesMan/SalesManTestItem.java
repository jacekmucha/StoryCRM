package com.jmdev.storycrm.testDomainItems.salesMan;

import com.jmdev.storycrm.domain.salesMan.SalesMan;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SalesManTestItem {


    public static SalesMan buildTestItemNo1(){
        SalesMan salesManTestItem = new SalesMan();
        salesManTestItem.setId(1L);
        salesManTestItem.setFirstName("Jacek");
        salesManTestItem.setLastName("Mucha");
        salesManTestItem.setMobilePhoneNumber(500600700);
        salesManTestItem.setEmail("jacek.mucha@test.pl");
        return salesManTestItem;
    }

    public static SalesMan buildTestItemNo2(){
        SalesMan salesManTestItem = new SalesMan();
        salesManTestItem.setId(2L);
        salesManTestItem.setFirstName("Antoni");
        salesManTestItem.setLastName("Nowak");
        salesManTestItem.setMobilePhoneNumber(111222333);
        salesManTestItem.setEmail("antoni.nowak@test.pl");
        return salesManTestItem;
    }

    public static SalesMan buildTestItemNo3(){
        SalesMan salesManTestItem = new SalesMan();
        salesManTestItem.setId(3L);
        salesManTestItem.setFirstName("Robert");
        salesManTestItem.setLastName("Borowy");
        salesManTestItem.setMobilePhoneNumber(444555666);
        salesManTestItem.setEmail("robert.borowy@test.pl");
        return salesManTestItem;
    }
}
