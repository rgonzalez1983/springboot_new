package com.example.demo.controller;

import com.example.demo.entity.CountryEntity;
import com.example.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public List<CountryEntity> findAllCountries() {
        return countryService.findAll();
    }

    @PostMapping("/save")
    public CountryEntity saveCountry(@Validated @RequestBody CountryEntity countryEntity) {
        return countryService.save(countryEntity);
        // Implement
    }

//    @GetMapping("/country/{id}")
//    public ResponseEntity<CountryEntity> findUserById(@PathVariable(value = "id") long id) {
//        // Implement
//    }

}
