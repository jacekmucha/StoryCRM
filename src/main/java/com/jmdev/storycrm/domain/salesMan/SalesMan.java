package com.jmdev.storycrm.domain.salesMan;

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

    private Integer mobilePhoneNumber;

    private String email;



}
