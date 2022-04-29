package com.humga.entity;

import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Min;
import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
public class PersonId implements Serializable {
    @Column(nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surName;

    @Min(0) //constraint на возраст
    @Column(nullable = false)
    private int age;
}
