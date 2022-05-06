package com.humga.service;

import com.humga.entity.Person;
import com.humga.repository.DaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService {
    private final DaoRepository daoRepository;

    AppService(DaoRepository daoRepository) {
        this.daoRepository = daoRepository;
    }

    public List<Person> getPersonsByCity(String city) {
        return daoRepository.getPersonsByCity(city);
    }

    public List<Person> getPersonByAgeLessThan(int age) {
        return daoRepository.getPersonsByAgeLessThan(age);
    }

    public List<Person> getPersonByNameAndSurname(String name, String surname) {
        return daoRepository.getPersonByNameAndSurname(name, surname);
    }
}
