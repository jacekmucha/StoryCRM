package com.jmdev.storycrm.testDomainItems.salesTask;

import com.jmdev.storycrm.domain.salesTask.AssignedTaskDocument;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AssignedTaskDocumentTestItem {



    public static AssignedTaskDocument buildTestItem(){
        AssignedTaskDocument testItem = new AssignedTaskDocument();
        testItem.setId(99L);
        testItem.setName("SIWZ");
        testItem.setDescription("Specyfikacja Istotnych Warunków Zamówienia dla SuperFirmy sp. z o.o.");
        testItem.setResourceLink("link do SIWZ");
        return testItem;
    }
}
