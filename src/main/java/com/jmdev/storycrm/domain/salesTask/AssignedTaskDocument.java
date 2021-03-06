package com.jmdev.storycrm.domain.salesTask;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class AssignedTaskDocument {

    @Id
    private Long id;

    private String name;

    private String description;

    private String resourceLink;

}
