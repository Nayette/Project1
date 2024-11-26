package com.example.project1.service;

import com.example.project1.entity.PersonEntity;
import com.example.project1.exception.PersonException;
import com.example.project1.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public PersonEntity createPerson(PersonEntity person) {
        return personRepository.save(person);
    }

    public List<PersonEntity> getPersons() {
        return personRepository.findAll();
    }

    public PersonEntity getPerson(Long id) throws PersonException {
        return personRepository.findById(id).orElseThrow(() -> new PersonException(PersonException.PersonError.PERSON_NOT_FOUND));
    }
}
