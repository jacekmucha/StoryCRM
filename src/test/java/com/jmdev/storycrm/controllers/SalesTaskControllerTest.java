package com.jmdev.storycrm.controllers;

import com.jmdev.storycrm.domain.internalProcedure.InternalProcedureDocument;
import com.jmdev.storycrm.domain.offer.Offer;
import com.jmdev.storycrm.domain.company.Company;
import com.jmdev.storycrm.domain.company.ContactPerson;
import com.jmdev.storycrm.domain.product.Product;
import com.jmdev.storycrm.domain.salesMan.SalesMan;
import com.jmdev.storycrm.domain.salesTask.AssignedTaskDocument;
import com.jmdev.storycrm.domain.salesTask.SalesTaskProgressTestItem;
import com.jmdev.storycrm.services.SalesTaskService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SalesTaskControllerTest {

    @Mock
    private SalesTaskService salesTaskService;

    @InjectMocks
    private SalesTaskController salesTaskController;

    private MockMvc mockMvc;


    @BeforeAll
    public void setup(){
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(salesTaskController).build();
    }

    @Test
    public void createNewSalesTask(){

        Long id = 1L;
        Integer version = 1;
        Date taskEstablishedDate;
        Date lastProgressDate;
        Company company;
        List<ContactPerson> contactPeople;
        SalesMan mainSalesMan;
        List<SalesMan> supportingSalesTeam;
        List<Product> discussedProducts;
        List<SalesTaskProgressTestItem> progressList;
        BigDecimal currentTaskValue;
        Double chanceOfPositiveFinishingTask;
        Date estimatedDateOfFinishingTask;
        List<Offer> alreadySentOffersList;
        List<AssignedTaskDocument> assignedTaskDocumentsList;
        List<InternalProcedureDocument> internalProceduresDocumentsList;




    }



}
