package com.jmdev.storycrm.testDomainItems.company;

import com.jmdev.storycrm.domain.company.Address;
import com.jmdev.storycrm.domain.company.Company;

public class CompanyTestItem {


    public static Company buildTestItem(){
        Address address = AddressTestItem.buildTestItem();

        Company testItem = new Company();
        testItem.setId(1L);
        testItem.setName("TestCompanyName");
        testItem.setNipNumber(345353534354335L);
        testItem.setAddress(address);
        return testItem;
    }

}
