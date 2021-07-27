package com.example.demo.controller;

import com.example.demo.entity.CityEntity;
import com.example.demo.entity.CountryEntity;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping
    public List<CityEntity> findAllCities() {
        return cityService.findAll();
    }

    @PostMapping("/save")
    public CityEntity saveCountry(@Validated @RequestBody CityEntity cityEntity) {
        return cityService.save(cityEntity);
        // Implement
    }

//    @GetMapping("/city/{id}")
//    public ResponseEntity<CityEntity> findUserById(@PathVariable(value = "id") long id) {
//        // Implement
//    }
//
//    @PostMapping
//    public CityEntity saveUser(@Validated @RequestBody CityEntity cityEntity) {
//        // Implement
//    }
}
