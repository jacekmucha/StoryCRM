package com.jmdev.storycrm.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class SalesMan {

    @Id
    private Long id;

    private String firstName;

    private String lastName;

    private String mobilePhoneNumber;

    private String email;



}
