package com.jmdev.storycrm.domain.salesTask;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@Entity
public class SalesTaskProgress {

    @Id
    private Long id;
    private Date thisContactDate;
    private ContactType contactType;
    private String description;

}
