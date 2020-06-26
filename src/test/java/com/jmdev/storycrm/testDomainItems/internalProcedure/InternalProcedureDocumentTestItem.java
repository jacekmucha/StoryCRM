package com.jmdev.storycrm.testDomainItems.internalProcedure;

import com.jmdev.storycrm.utils.DateFormatter;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class InternalProcedureDocumentTestItem {

    private Integer id;
    private InternalProcedureNameTestItem internalProcedureName;
    private Date creationDate;
    private Date lastModifyDate;
    private String resourceLink;

    public InternalProcedureDocumentTestItem() {
    }

    public static InternalProcedureDocumentTestItem buildTestItem(){
        InternalProcedureDocumentTestItem testItem = new InternalProcedureDocumentTestItem();
        testItem.setId(1);
        testItem.setInternalProcedureName(InternalProcedureNameTestItem.buildTestItem());
        testItem.setCreationDate(DateFormatter.fromStringToDate("26-12-2020 10:13:56"));
        testItem.setLastModifyDate(DateFormatter.fromStringToDate("27-12-2020 11:32:10"));
        testItem.setResourceLink("Document resource link");
        return testItem;
    }
}
