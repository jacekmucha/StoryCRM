package com.jmdev.storycrm.domain.company;

import com.jmdev.storycrm.utils.JSONFormatter;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class ContactPerson {

    @Id
    private Long id;

    private String firstName;

    private String lastName;

    private Company company;

    private Integer mobilePhone;

    private Integer stationaryPhone;

    private String email;

    @Override
    public String toString() {
        return JSONFormatter.useGSON(this);
    }
}
