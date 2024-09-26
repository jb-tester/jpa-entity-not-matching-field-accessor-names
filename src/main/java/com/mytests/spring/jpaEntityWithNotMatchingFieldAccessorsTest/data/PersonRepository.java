package com.mytests.spring.jpaEntityWithNotMatchingFieldAccessorsTest.data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * *
 * <p>Created by Irina on 9/26/2024.</p>
 * *
 */
public interface PersonRepository extends CrudRepository<Person, Integer> {

    List<Person> findAll();

    @Query("select e from Person e where e.name = :arg")
    List<Person> customQuery(@Param("arg") String arg);

    List<Person> findBySurname(String surname);
}
