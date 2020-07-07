package com.jmdev.storycrm.domain.company;

import com.jmdev.storycrm.utils.JSONFormatter;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Company {

    @Id
    private Long id;

    private String name;

    private Long nipNumber;

    private Address address;

    @Override
    public String toString() {
        return JSONFormatter.useGSON(this);
    }

}