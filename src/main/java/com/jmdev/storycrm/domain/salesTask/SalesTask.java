package com.jmdev.storycrm.domain.salesTask;

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
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class SalesTask {

    @Id
    private Long id;
    private Integer version;
    private Date taskEstablishedDate;
    private Date lastProgressDate;
    private Company company;
    private List<ContactPerson> contactPeople;
    private SalesMan mainSalesMan;
    private List<SalesMan> supportingSalesTeam;
    private List<Product> discussedProducts;
    private List<SalesTaskProgress> progressList;
    private BigDecimal currentTaskValue;
    private Double chanceOfPositiveFinishingTask;
    private Date estimatedDateOfFinishingTask;
    private List<Offer> alreadySentOffersList;
    private List<AssignedTaskDocument> assignedTaskDocumentsList;
    private List<InternalProcedureDocument> internalProceduresDocumentsList;

    public SalesTask(){
    }


}
