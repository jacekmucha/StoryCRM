package com.jmdev.storycrm.domain.offer;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jmdev.storycrm.domain.product.Product;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
public class Offer {

    @Id
    private Long id;

    private Product product;

    private LocalDateTime creationDate;

    private LocalDateTime lastModifyDate;

    private String resourceLink;

}
