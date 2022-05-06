package com.humga.repository;

import com.humga.entity.Person;
import com.humga.entity.PersonId;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DaoCrudRepository extends CrudRepository<Person, PersonId> {

    List<Person> findPersonByCityOfLiving(String city);

    List<Person> findByPersonIdNameAndPersonIdSurName(String name, String surname);

    List<Person> findByPersonIdAgeLessThanOrderByPersonIdAgeAsc(int age);
    Optional<Person> findFirstByPersonIdAgeLessThanOrderByPersonIdAgeAsc(int age);
}
