package com.jmdev.storycrm.testDomainItems.salesTask;

import com.jmdev.storycrm.domain.company.ContactPerson;
import com.jmdev.storycrm.domain.internalProcedure.InternalProcedureDocument;
import com.jmdev.storycrm.domain.offer.Offer;
import com.jmdev.storycrm.domain.product.Product;
import com.jmdev.storycrm.domain.salesMan.SalesMan;
import com.jmdev.storycrm.domain.salesTask.AssignedTaskDocument;
import com.jmdev.storycrm.domain.salesTask.SalesTask;
import com.jmdev.storycrm.domain.salesTask.SalesTaskProgress;
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
import java.util.List;

@Getter
@Setter
public class SalesTaskTestItem {

    public static SalesTask buildTestItem(){

        List<ContactPerson> contactPersonTestItemList = new ArrayList<>();
        contactPersonTestItemList.add(ContactPersonTestItem.buildTestItem());

        List<SalesMan> supportingSalesTeamList = new ArrayList<>();

        List<Product> discussedProductsTestList = new ArrayList<>();
        discussedProductsTestList.add(ProductTestItem.buildTestItem());

        List<SalesTaskProgress> progressTestList = new ArrayList<>();
        progressTestList.add(SalesTaskProgressTestItem.buildTestItemNo1());
        progressTestList.add(SalesTaskProgressTestItem.buildTestItemNo2());
        progressTestList.add(SalesTaskProgressTestItem.buildTestItemNo3());

        List<Offer> alreadySentOffersTestList = new ArrayList<>();
        alreadySentOffersTestList.add(OfferTestItem.buildTestItem());

        List<AssignedTaskDocument> assignedTaskDocumentsTestList = new ArrayList<>();
        assignedTaskDocumentsTestList.add(AssignedTaskDocumentTestItem.buildTestItem());

        List<InternalProcedureDocument> internalProceduresDocumentsTestList = new ArrayList<>();
        internalProceduresDocumentsTestList.add(InternalProcedureDocumentTestItem.buildTestItem());


        SalesTask testItem = new SalesTask();
        testItem.setId(1L);
        testItem.setVersion(1);
        testItem.setTaskEstablishedDate(DateFormatter.fromStringToDate("10-12-2020T09:12:45"));
        testItem.setLastProgressDate(DateFormatter.fromStringToDate("10-12-2020T09:30:56"));
        testItem.setCompany(CompanyTestItem.buildTestItem());
        testItem.setContactPersonsList(contactPersonTestItemList);
        testItem.setMainSalesMan(SalesManTestItem.buildTestItemNo1());
        testItem.setSupportingSalesTeam(supportingSalesTeamList);
        testItem.setDiscussedProducts(discussedProductsTestList);
        testItem.setProgressList(progressTestList);
        testItem.setCurrentTaskValue(BigDecimal.valueOf(250000));
        testItem.setChanceOfPositiveFinishingTask(0.45);
        testItem.setEstimatedDateOfFinishingTask(DateFormatter.fromStringToDate("30-12-2020T13:00:00"));
        testItem.setAlreadySentOffersList(alreadySentOffersTestList);
        testItem.setAssignedTaskDocumentsList(assignedTaskDocumentsTestList);
        testItem.setInternalProceduresDocumentsList(internalProceduresDocumentsTestList);
        return testItem;
    }

}
