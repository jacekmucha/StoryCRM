package com.jmdev.storycrm.testDomainItems.internalProcedure;

import com.jmdev.storycrm.domain.internalProcedure.InternalProcedureDocument;
import com.jmdev.storycrm.utils.DateFormatter;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class InternalProcedureDocumentTestItem {



    public static InternalProcedureDocument buildTestItem(){
        InternalProcedureDocument testItem = new InternalProcedureDocument();
        testItem.setId(1);
        testItem.setInternalProcedureName(InternalProcedureNameTestItem.buildTestItem());
        testItem.setCreationDate(DateFormatter.fromStringToDate("26-12-2020T10:13:56"));
        testItem.setLastModifyDate(DateFormatter.fromStringToDate("27-12-2020T11:32:10"));
        testItem.setResourceLink("Document resource link");
        return testItem;
    }
}
