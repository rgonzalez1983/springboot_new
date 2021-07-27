package com.example.demo.service;

import com.example.demo.entity.PersonEntity;
import com.example.demo.interfaces.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private IPersonRepository personRepository;

    public List<PersonEntity> findAll() {
        var it = personRepository.findAll();
        var countries = new ArrayList<PersonEntity>();
        it.forEach(e -> countries.add(e));
        return countries;
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
