package com.jmdev.storycrm.services;

import com.jmdev.storycrm.domain.salesTask.SalesTask;
import com.jmdev.storycrm.repository.SalesTaskRepository;
import org.springframework.stereotype.Service;

@Service
public class SalesTaskService {

    private SalesTaskRepository salesTaskRepository;

    public SalesTask save(SalesTask salesTask) {
        return salesTaskRepository.save(salesTask);
    }
}
