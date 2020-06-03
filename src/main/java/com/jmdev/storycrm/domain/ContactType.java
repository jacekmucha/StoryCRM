package com.jmdev.storycrm.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class ContactType {

    @Id
    private Integer id;

    private String type;
}
