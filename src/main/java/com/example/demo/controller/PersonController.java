package com.example.demo.controller;

import com.example.demo.entity.PersonEntity;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public List<PersonEntity> findAllPersons() {
        return personService.findAll();
    }

//    @GetMapping("/person/{id}")
//    public ResponseEntity<PersonEntity> findUserById(@PathVariable(value = "id") long id) {
//        // Implement
//    }
//
//    @PostMapping
//    public PersonEntity saveUser(@Validated @RequestBody PersonEntity personEntity) {
//        // Implement
//    }
}
