package com.humga.repository;

import com.humga.entity.Person;
import com.humga.entity.PersonId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DaoCrudRepository extends CrudRepository<Person, PersonId> {

    //List<Person> findPersonByCityOfLiving(String city);
    @Query("select Person from Person p where p.cityOfLiving=:city")
    List<Person> findPersonByCityOfLiving(String city);

    List<Person> findByPersonIdNameAndPersonIdSurName(String name, String surname);

    List<Person> findByPersonIdAgeLessThanOrderByPersonIdAge(int age);




}
