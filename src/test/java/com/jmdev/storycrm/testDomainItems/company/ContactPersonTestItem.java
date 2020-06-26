package com.jmdev.storycrm.testDomainItems.company;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactPersonTestItem {

    private Long id;
    private String firstName;
    private String lastName;
    private CompanyTestItem companyTestItem;
    private Integer mobilePhone;
    private Integer stationaryPhone;
    private String email;


    public ContactPersonTestItem() {
    }

    public static ContactPersonTestItem buildTestItem(){
        CompanyTestItem companyTestItem = CompanyTestItem.buildTestItem();

        ContactPersonTestItem testItem = new ContactPersonTestItem();
        testItem.setId(1L);
        testItem.setFirstName("Józef");
        testItem.setLastName("Marek");
        testItem.setCompanyTestItem(CompanyTestItem.buildTestItem());
        testItem.setMobilePhone(234234234);
        testItem.setStationaryPhone(183326951);
        testItem.setEmail("owocarnia@owocarnia.pl");
        return testItem;
    }
}