package com.jmdev.storycrm.testDomainItems.salesTask;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AssignedTaskDocumentTestItem {

    private Long id;
    private String name;
    private String description;
    private String resourceLink;

    public AssignedTaskDocumentTestItem() {
    }

    public static AssignedTaskDocumentTestItem buildTestItem(){
        AssignedTaskDocumentTestItem testItem = new AssignedTaskDocumentTestItem();
        testItem.setId(99L);
        testItem.setName("SIWZ");
        testItem.setDescription("Specyfikacja Istotnych Warunków Zamówienia dla SuperFirmy sp. z o.o.");
        testItem.setResourceLink("link do SIWZ");
        return testItem;
    }
}
