package com.cognizant.spring_learn.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.*;

@Entity
@Table(name="country")
@Data
@Slf4j
public class Country {
    @Id
    private String code;
    private String name;

    public Country() {
        log.info("Inside Country Constructor");
    }
}
