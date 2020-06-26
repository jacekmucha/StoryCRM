package com.jmdev.storycrm.repository;

import com.jmdev.storycrm.domain.salesTask.SalesTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesTaskRepository extends JpaRepository<SalesTask, Long> {
}
