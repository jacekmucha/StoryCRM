package com.jmdev.storycrm.testDomainItems.salesMan;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SalesManTestItem {

    private Long id;
    private String firstName;
    private String lastName;
    private Integer mobilePhoneNumber;
    private String email;

    public SalesManTestItem() {
    }

    public static SalesManTestItem buildTestItemNo1(){
        SalesManTestItem salesManTestItem = new SalesManTestItem();
        salesManTestItem.setId(1L);
        salesManTestItem.setFirstName("Jacek");
        salesManTestItem.setLastName("Mucha");
        salesManTestItem.setMobilePhoneNumber(500600700);
        salesManTestItem.setEmail("jacek.mucha@test.pl");
        return salesManTestItem;
    }

    public static SalesManTestItem buildTestItemNo2(){
        SalesManTestItem salesManTestItem = new SalesManTestItem();
        salesManTestItem.setId(2L);
        salesManTestItem.setFirstName("Antoni");
        salesManTestItem.setLastName("Nowak");
        salesManTestItem.setMobilePhoneNumber(111222333);
        salesManTestItem.setEmail("antoni.nowak@test.pl");
        return salesManTestItem;
    }

    public static SalesManTestItem buildTestItemNo3(){
        SalesManTestItem salesManTestItem = new SalesManTestItem();
        salesManTestItem.setId(3L);
        salesManTestItem.setFirstName("Robert");
        salesManTestItem.setLastName("Borowy");
        salesManTestItem.setMobilePhoneNumber(444555666);
        salesManTestItem.setEmail("robert.borowy@test.pl");
        return salesManTestItem;
    }
}
