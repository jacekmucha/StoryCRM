package com.jmdev.storycrm.controllers;

import com.jmdev.storycrm.domain.salesTask.SalesTask;
import com.jmdev.storycrm.services.SalesTaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SalesTaskController {

    @Autowired
    private SalesTaskService salesTaskService;

    @PostMapping("/salesTask")
    ResponseEntity<SalesTask> createNewSalesTask(@RequestBody SalesTask salesTask){
        return new ResponseEntity<>(salesTaskService.save(salesTask), HttpStatus.CREATED);
    }
}
