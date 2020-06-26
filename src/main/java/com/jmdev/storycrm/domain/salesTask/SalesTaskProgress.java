package com.jmdev.storycrm.domain.salesTask;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class SalesTaskProgress {

    @Id
    private Long id;

    private LocalDateTime thisContactDate;

    private ContactType contactType;
    private String description;

}
