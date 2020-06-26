package com.jmdev.storycrm.domain.internalProcedure;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
public class InternalProcedureDocument {

    @Id
    private Integer id;

    private InternalProcedureName internalProcedureName;

    private LocalDateTime creationDate;

    private LocalDateTime lastModifyDate;

    private String resourceLink;

}
