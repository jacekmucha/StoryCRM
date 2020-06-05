package com.jmdev.storycrm.domain.product;

import com.jmdev.storycrm.domain.manufacturer.Manufacturer;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
public class Product {

    @Id
    private Long id;

    private String name;

    private Manufacturer manufacturer;

    private ProductType productType;

    private ProductDestination productDestination;

    private ProductMainCategory productMainCategory;

    private ProductSubCategory productSubCategory;

    private List<Product> relatedProducts;

    private Picture mainPicture;

    private List<Picture> productGallery;

    private Video mainVideo;

    private List<Video> videoList;

    private BigDecimal price;

    private Boolean showPrice;
}
