package com.example.demo.service;

import com.example.demo.entity.CityEntity;
import com.example.demo.interfaces.ICityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {

    @Autowired
    private ICityRepository cityRepository;

    public List<CityEntity> findAll() {
        var it = cityRepository.findAll();
        var countries = new ArrayList<CityEntity>();
        it.forEach(e -> countries.add(e));
        return countries;
    }

    public CityEntity save(CityEntity city) {
        cityRepository.save(city);
        return city;
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
