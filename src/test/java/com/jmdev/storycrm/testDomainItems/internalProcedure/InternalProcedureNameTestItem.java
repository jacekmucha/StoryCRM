package com.jmdev.storycrm.testDomainItems.internalProcedure;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InternalProcedureNameTestItem {

    private Integer id;
    private String name;

    public InternalProcedureNameTestItem() {
    }

    public static InternalProcedureNameTestItem buildTestItem(){
        InternalProcedureNameTestItem testItem = new InternalProcedureNameTestItem();
        testItem.setId(1);
        testItem.setName("Weryfikacja zamówienia ISO");
        return testItem;
    }
}
