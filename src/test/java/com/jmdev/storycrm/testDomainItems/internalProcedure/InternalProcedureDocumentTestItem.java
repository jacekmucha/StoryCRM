package com.jmdev.storycrm.testDomainItems.internalProcedure;

import com.jmdev.storycrm.domain.internalProcedure.InternalProcedureDocument;
import com.jmdev.storycrm.utils.DateFormatter;

public class InternalProcedureDocumentTestItem {


    public static InternalProcedureDocument buildTestItem(){
        InternalProcedureDocument testItem = new InternalProcedureDocument();
        testItem.setId(1);
        testItem.setInternalProcedureName(InternalProcedureNameTestItem.buildTestItem());
        testItem.setCreationDate(DateFormatter.mkyongFromStringToLocalDateTime("2020-12-26 10:13:56"));
        testItem.setLastModifyDate(DateFormatter.mkyongFromStringToLocalDateTime("2020-12-27 11:32:10"));
        testItem.setResourceLink("Document resource link");
        return testItem;
    }
}
