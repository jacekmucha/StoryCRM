package com.jmdev.storycrm.domain.offer;

import com.jmdev.storycrm.domain.product.Product;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
public class Offer {

    @Id
    private Long id;

    private Product product;

    private Date creationDate;

    private Date lastModifyDate;

    private String resourceLink;

}
