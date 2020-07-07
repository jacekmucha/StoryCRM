package com.jmdev.storycrm.domain.company;

import com.jmdev.storycrm.utils.JSONFormatter;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Address {

    @Id
    private Long id;

    private String voivodeship;

    private String postalCode;

    private String city;

    private String street;

    private String fullBiuldingNumber;

    private Integer flatNumber;

    @Override
    public String toString() {
        return JSONFormatter.useGSON(this);
    }



}
