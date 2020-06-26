package com.jmdev.storycrm.testDomainItems.internalProcedure;

import com.jmdev.storycrm.domain.internalProcedure.InternalProcedureName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InternalProcedureNameTestItem {


    public static InternalProcedureName buildTestItem(){
        InternalProcedureName testItem = new InternalProcedureName();
        testItem.setId(1);
        testItem.setName("Weryfikacja zamówienia ISO");
        return testItem;
    }
}
