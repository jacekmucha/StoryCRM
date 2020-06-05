package com.jmdev.storycrm.testDomainItems.salesTask;

import com.jmdev.storycrm.testDomainItems.company.CompanyTestItem;
import com.jmdev.storycrm.testDomainItems.company.ContactPersonTestItem;
import com.jmdev.storycrm.testDomainItems.product.ProductTestItem;
import com.jmdev.storycrm.testDomainItems.salesMan.SalesManTestItem;
import com.jmdev.storycrm.domain.internalProcedure.InternalProcedureDocument;
import com.jmdev.storycrm.domain.offer.Offer;
import com.jmdev.storycrm.domain.salesTask.AssignedTaskDocument;
import com.jmdev.storycrm.domain.salesTask.SalesTaskProgressTestItem;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class SalesTaskTestItem {

    private Long id;
    private Integer version;
    private Date taskEstablishedDate;
    private Date lastProgressDate;
    private CompanyTestItem companyTestItem;
    private List<ContactPersonTestItem> contactPersonTestItemList;
    private SalesManTestItem mainSalesManTestitem;
    private List<SalesManTestItem> supportingSalesTeamTestItems;
    private List<ProductTestItem> discussedProducts;

    private List<SalesTaskProgressTestItem> progressTestItemList;
    private BigDecimal currentTaskValue;

    private Double chanceOfPositiveFinishingTask;
    private Date estimatedDateOfFinishingTask;
    private List<Offer> alreadySentOffersList;
    private List<AssignedTaskDocument> assignedTaskDocumentsList;
    private List<InternalProcedureDocument> internalProceduresDocumentsList;

    public SalesTaskTestItem() {
    }

    public static SalesTaskTestItem buildTestItem(){

    }

}
