package com.jmdev.storycrm.domain.product;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter

public class Picture {

    @Id
    private Integer id;

    private String name;

    private String description;

    private String resourceLink;

}
