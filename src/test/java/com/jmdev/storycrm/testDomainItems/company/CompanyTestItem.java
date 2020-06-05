package com.jmdev.storycrm.testDomainItems.company;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyTestItem {

    private Long id;
    private String name;
    private Long NIPnumber;
    private AddressTestItem addressTestItem;


    public CompanyTestItem() {
    }

    public static CompanyTestItem buildTestItem(){
        AddressTestItem addressTestItem = AddressTestItem.buildTestItem();

        CompanyTestItem testItem = new CompanyTestItem();
        testItem.setId(1L);
        testItem.setName("Owocarnia");
        testItem.setNIPnumber(345353534354335L);
        testItem.setAddressTestItem(addressTestItem);
        return testItem;
    }
}
