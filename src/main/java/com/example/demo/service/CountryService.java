package com.example.demo.service;

import com.example.demo.entity.CountryEntity;
import com.example.demo.interfaces.ICountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    @Autowired
    private ICountryRepository countryRepository;

    public List<CountryEntity> findAll() {
        var it = countryRepository.findAll();
        var countries = new ArrayList<CountryEntity>();
        it.forEach(e -> countries.add(e));
        return countries;
    }

    public CountryEntity save(CountryEntity countryEntity) {
        countryRepository.save(countryEntity);
        return countryEntity;
    }



//    public Long count() {
//
//        return userRepository.count();
//    }
//
//    public void deleteById(Long userId) {
//
//        userRepository.deleteById(userId);
//    }
}
