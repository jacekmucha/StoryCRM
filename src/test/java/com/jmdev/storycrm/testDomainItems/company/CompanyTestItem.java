package com.jmdev.storycrm.testDomainItems.company;

import com.jmdev.storycrm.domain.company.Address;
import com.jmdev.storycrm.domain.company.Company;
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

    public static Company buildTestItem(){
        Address address = AddressTestItem.buildTestItem();

        Company testItem = new Company();
        testItem.setId(1L);
        testItem.setName("Owocarnia");
        testItem.setNIPnumber(345353534354335L);
        testItem.setAddress(address);
        return testItem;
    }

}
