package com.jmdev.storycrm.domain.manufacturer;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Manufacturer {

    @Id
    private Integer id;

    private String name;
}
