package com.jmdev.storycrm.domain;

import sun.text.CompactByteArray;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SalesTask {

    @Id
    private Long id;

    private Integer verison;

    private Company company;

    private CompanyContactPerson companyContactPerson;

    private SalesMan salesMan;



}
