package com.jmdev.storycrm.domain.internalProcedure;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class InternalProcedureName {

    @Id
    private Integer id;

    private String name;

}
