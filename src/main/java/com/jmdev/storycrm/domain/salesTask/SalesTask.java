package com.jmdev.storycrm.domain.salesTask;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jmdev.storycrm.domain.internalProcedure.InternalProcedureDocument;
import com.jmdev.storycrm.domain.offer.Offer;
import com.jmdev.storycrm.domain.salesMan.SalesMan;
import com.jmdev.storycrm.domain.company.Company;
import com.jmdev.storycrm.domain.company.ContactPerson;
import com.jmdev.storycrm.domain.product.Product;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class SalesTask {

    @Id
    private Long id;
    private Integer version;

    private LocalDateTime taskEstablishedDate;

    private LocalDateTime lastProgressDate;

    private Company company;
    private List<ContactPerson> contactPersonsList;
    private SalesMan mainSalesMan;
    private List<SalesMan> supportingSalesTeam;
    private List<Product> discussedProducts;
    private List<SalesTaskProgress> progressList;
    private BigDecimal currentTaskValue;
    private Double chanceOfPositiveFinishingTask;

    private LocalDateTime estimatedDateOfFinishingTask;

    private List<Offer> alreadySentOffersList;
    private List<AssignedTaskDocument> assignedTaskDocumentsList;
    private List<InternalProcedureDocument> internalProceduresDocumentsList;

    public SalesTask(){
    }


}
