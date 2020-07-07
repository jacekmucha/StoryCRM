package com.jmdev.storycrm.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.jmdev.storycrm.domain.salesTask.SalesTask;
import com.jmdev.storycrm.services.SalesTaskService;
import com.jmdev.storycrm.testDomainItems.salesTask.SalesTaskTestItem;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest

public class SalesTaskControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    private SalesTaskService salesTaskService;


    @Test
    public void createNewSalesTask(){

        SalesTask newSalesTask = new SalesTask();
        newSalesTask = SalesTaskTestItem.buildTestItem();

        when(salesTaskService.save(any(SalesTask.class))).thenReturn(newSalesTask);

        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

        try {
            String newSalesTaskJSON = objectMapper.writeValueAsString(newSalesTask);

            ResultActions resultActions = mockMvc.perform(
                    post("/salesTask")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(newSalesTaskJSON)
            );

            resultActions.andExpect(status().isCreated())
                    .andDo(print())
                    .andExpect(content().contentType("application/json"))
                    .andExpect(jsonPath("$.id").value(1L))
                    .andExpect(jsonPath("$.version").value(1))
                    .andExpect(jsonPath("$.taskEstablishedDate").value(SalesTaskTestItem.buildTestItem().getTaskEstablishedDate().toString()))
                    .andExpect(jsonPath("$.lastProgressDate").value(SalesTaskTestItem.buildTestItem().getLastProgressDate().toString()))
                    .andExpect(jsonPath("$.company").value(SalesTaskTestItem.buildTestItem().getCompany()))
                    .andExpect(jsonPath("$.contactPersonsList").value(SalesTaskTestItem.buildTestItem().getContactPersonsList()))
                    .andExpect(jsonPath("$.mainSalesMan").value(SalesTaskTestItem.buildTestItem().getMainSalesMan()))
                    .andExpect(jsonPath("$.supportingSalesTeam").value(SalesTaskTestItem.buildTestItem().getSupportingSalesTeam()))
                    .andExpect(jsonPath("$.discussedProducts").value(SalesTaskTestItem.buildTestItem().getDiscussedProducts()))
                    .andExpect(jsonPath("$.progressList").value(SalesTaskTestItem.buildTestItem().getProgressList()))
                    .andExpect(jsonPath("$.currentTaskValue").value(SalesTaskTestItem.buildTestItem().getCurrentTaskValue()))
                    .andExpect(jsonPath("$.chanceOfPositiveFinishingTask").value(SalesTaskTestItem.buildTestItem().getChanceOfPositiveFinishingTask()))
                    .andExpect(jsonPath("$.estimatedDateOfFinishingTask").value(SalesTaskTestItem.buildTestItem().getEstimatedDateOfFinishingTask()))
                    .andExpect(jsonPath("$.alreadySentOffersList").value(SalesTaskTestItem.buildTestItem().getAlreadySentOffersList()))
                    .andExpect(jsonPath("$.assignedTaskDocumentsList").value(SalesTaskTestItem.buildTestItem().getAssignedTaskDocumentsList()))
                    .andExpect(jsonPath("$.internalProceduresDocumentsList").value(SalesTaskTestItem.buildTestItem().getInternalProceduresDocumentsList()));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}






