package com.jmdev.storycrm.domain.internalProcedure;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
public class InternalProcedureDocument {

    @Id
    private Integer id;

    private InternalProcedureName internalProcedureName;

    private Date creationDate;

    private Date lastModifyDate;

    private String resourceLink;

}
