package com.jmdev.storycrm.controllers;

import com.jmdev.storycrm.domain.*;
import com.jmdev.storycrm.services.SalesTaskService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
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
        List<CompanyContactPerson> companyContactPersons;
        SalesMan mainSalesMan;
        List<SalesMan> supportingSalesTeam;
        List<Product> discussedProducts;
        List<SalesTaskProgress> progressList;
        BigDecimal currentTaskValue;
        Double chanceOfPositiveFinishingTask;
        Date estimatedDateOfFinishingTask;
        List<Offer> alreadySentOffersList;
        List<AssignedTaskDocument> assignedTaskDocumentsList;
        List<InternalProcedureDocument> internalProceduresDocumentsList;




    }


}
