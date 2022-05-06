package com.humga.repository;

import com.humga.entity.Person;
import com.humga.entity.PersonId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DaoCrudRepository extends CrudRepository<Person, PersonId> {

    //List<Person> findPersonByCityOfLiving(String city);
    @Query("select p from Person p where p.cityOfLiving=:city")
    List<Person> findPersonByCityOfLiving(@Param("city") String city);

    //List<Person> findByPersonIdNameAndPersonIdSurName(String name, String surname);
    @Query("select p from Person p where p.personId.name=:name and p.personId.surName=:surname")
    List<Person> findByPersonIdNameAndPersonIdSurName(@Param("name") String name, @Param("surname") String surname);

    //List<Person> findByPersonIdAgeLessThanOrderByPersonIdAge(int age);
    @Query("select p from Person p where p.personId.age < :age order by p.personId.age asc")
    List<Person> findByPersonIdAgeLessThanOrderByPersonIdAge(@Param("age") int age);
}
