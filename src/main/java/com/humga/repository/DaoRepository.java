package com.humga.repository;

import com.humga.entity.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DaoRepository {

    private final DaoCrudRepository crudRepository;
    DaoRepository(DaoCrudRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    public List<Person> getPersonsByCity(String city) {
        return crudRepository.findPersonByCityOfLiving(city);
    }

    public List<Person> getPersonsByAgeLessThan(int age) {
        return crudRepository.findByPersonIdAgeLessThanOrderByPersonIdAge(age);
    }

    public List<Person> getPersonByNameAndSurname(String name, String surname) {
        return crudRepository.findByPersonIdNameAndPersonIdSurName(name, surname);
    }
}
