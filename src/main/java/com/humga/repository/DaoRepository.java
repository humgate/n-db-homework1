package com.humga.repository;

import com.humga.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class DaoRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        return entityManager
                .createQuery("select p from Person p where p.cityOfLiving = :city", Person.class)
                .setParameter("city",city)
                .getResultList();
    }
}
