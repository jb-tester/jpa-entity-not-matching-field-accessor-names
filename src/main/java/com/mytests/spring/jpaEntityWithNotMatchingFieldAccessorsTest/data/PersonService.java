package com.mytests.spring.jpaEntityWithNotMatchingFieldAccessorsTest.data;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class PersonService {

    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public List<Person> addAll() {
        repository.saveAll(List.of(new Person("Ivan", "Ivanov", new Address("Broadway", "NY", "111111")), new Person("Petr", "Petrov", new Address("5th av", "NY", "22222")), new Person("Oleg", "Olegov", new Address("ul Lenina", "Urupinsk", "333333"))));
        return repository.findAll();
    }

    public List<Person> customQuery(String name) {
        return repository.customQuery(name);
    }


}    