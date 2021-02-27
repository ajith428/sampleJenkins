package com.example.samplejenkins.controllers;

import com.example.samplejenkins.model.Person;
import com.example.samplejenkins.services.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
@Slf4j
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("persons")
    public List<Person> getPersons() {
        log.debug("Entered getPersons in PersonController");
        return personService.getPersons();
    }
}
