package com.example.project1.controler;

import com.example.project1.entity.PersonEntity;
import com.example.project1.exception.PersonException;
import com.example.project1.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonControler {

    PersonService personService;

    public PersonControler(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/persons/")
    public PersonEntity createPerson(@RequestBody PersonEntity person) {
        return personService.createPerson(person);
    }

    @GetMapping("/persons/")
    public List<PersonEntity> getPersons() {
        return personService.getPersons();
    }

    @GetMapping("/persons/{id}")
    public PersonEntity getPerson(@PathVariable Long id) throws PersonException {
        return personService.getPerson(id);
    }
}
