package com.humga.repository;

import com.humga.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class DaoRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public Person getPersonsByCity(String city) {
        return new Person();
    }



}
