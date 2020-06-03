package com.jmdev.storycrm.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
public class SalesTaskProgress {

    @Id
    private Long id;

    private SalesTask salesTask;

    private ContactType contactType;

    private Date contactDate;

    private String description;



}
