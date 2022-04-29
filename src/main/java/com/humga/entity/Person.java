package com.humga.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "persons")
public class Person {
    @EmbeddedId
    private PersonId personId;

    @Column(name = "phone_number")
    private long phoneNumber;

    @Column(name = "city_of_living", length = 128)
    private String cityOfLiving;

    public Person(String name, String surName, int age, long phoneNumber, String cityOfLiving) {
        this.personId = new PersonId(name, surName, age);
        this.phoneNumber = phoneNumber;
        this.cityOfLiving = cityOfLiving;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Person person = (Person) o;
        return personId != null && Objects.equals(personId, person.personId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId);
    }

    public String toString() {
        return personId.toString() +", " + this.getPhoneNumber() + ", " + this.getCityOfLiving();
    }
}
