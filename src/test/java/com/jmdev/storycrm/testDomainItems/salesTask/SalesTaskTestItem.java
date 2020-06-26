package com.jmdev.storycrm.testDomainItems.salesTask;

import com.jmdev.storycrm.testDomainItems.company.CompanyTestItem;
import com.jmdev.storycrm.testDomainItems.company.ContactPersonTestItem;
import com.jmdev.storycrm.testDomainItems.internalProcedure.InternalProcedureDocumentTestItem;
import com.jmdev.storycrm.testDomainItems.offer.OfferTestItem;
import com.jmdev.storycrm.testDomainItems.product.ProductTestItem;
import com.jmdev.storycrm.testDomainItems.salesMan.SalesManTestItem;
import com.jmdev.storycrm.utils.DateFormatter;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class SalesTaskTestItem {

    private Long id;
    private Integer version;
    private Date taskEstablishedDate;
    private Date lastProgressDate;
    private CompanyTestItem company;
    private List<ContactPersonTestItem> contactPerson;
    private SalesManTestItem mainSalesMan;
    private List<SalesManTestItem> supportingSalesTeam;
    private List<ProductTestItem> discussedProducts;
    private List<SalesTaskProgressTestItem> progressList;
    private BigDecimal currentTaskValue;
    private Double chanceOfPositiveFinishingTask;
    private Date estimatedDateOfFinishingTask;
    private List<OfferTestItem> alreadySentOffersList;
    private List<AssignedTaskDocumentTestItem> assignedTaskDocumentsList;
    private List<InternalProcedureDocumentTestItem> internalProceduresDocumentsList;

    public SalesTaskTestItem() {
    }

    public static SalesTaskTestItem buildTestItem(){

        List<ContactPersonTestItem> contactPersonTestItemList = new ArrayList<>();
        contactPersonTestItemList.add(ContactPersonTestItem.buildTestItem());

        List<SalesManTestItem> supportingSalesTeamList = new ArrayList<>();

        List<ProductTestItem> discussedProductsTestList = new ArrayList<>();
        discussedProductsTestList.add(ProductTestItem.buildTestItem());

        List<SalesTaskProgressTestItem> progressTestList = new ArrayList<>();
        progressTestList.add(SalesTaskProgressTestItem.buildTestItemNo1());
        progressTestList.add(SalesTaskProgressTestItem.buildTestItemNo2());
        progressTestList.add(SalesTaskProgressTestItem.buildTestItemNo3());

        List<OfferTestItem> alreadySentOffersTestList = new ArrayList<>();
        alreadySentOffersTestList.add(OfferTestItem.buildTestItem());

        List<AssignedTaskDocumentTestItem> assignedTaskDocumentsTestList = new ArrayList<>();
        assignedTaskDocumentsTestList.add(AssignedTaskDocumentTestItem.buildTestItem());

        List<InternalProcedureDocumentTestItem> internalProceduresDocumentsTestList = new ArrayList<>();
        internalProceduresDocumentsTestList.add(InternalProcedureDocumentTestItem.buildTestItem());


        SalesTaskTestItem testItem = new SalesTaskTestItem();
        testItem.setId(1L);
        testItem.setVersion(1);
        testItem.setTaskEstablishedDate(DateFormatter.fromStringToDate("10-12-2020 09:12:45"));
        testItem.setLastProgressDate(DateFormatter.fromStringToDate("10-12-2020 09:30:56"));
        testItem.setCompany(CompanyTestItem.buildTestItem());
        testItem.setContactPerson(contactPersonTestItemList);
        testItem.setMainSalesMan(SalesManTestItem.buildTestItemNo1());
        testItem.setSupportingSalesTeam(supportingSalesTeamList);
        testItem.setDiscussedProducts(discussedProductsTestList);
        testItem.setProgressList(progressTestList);
        testItem.setCurrentTaskValue(BigDecimal.valueOf(250000));
        testItem.setChanceOfPositiveFinishingTask(0.45);
        testItem.setEstimatedDateOfFinishingTask(DateFormatter.fromStringToDate("30-12-2020 13:00:00"));
        testItem.setAlreadySentOffersList(alreadySentOffersTestList);
        testItem.setAssignedTaskDocumentsList(assignedTaskDocumentsTestList);
        testItem.setInternalProceduresDocumentsList(internalProceduresDocumentsTestList);
        return testItem;
    }

}
