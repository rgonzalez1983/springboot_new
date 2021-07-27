package com.example.demo.interfaces;

import com.example.demo.entity.CountryEntity;
import org.springframework.data.repository.CrudRepository;

public interface ICountryRepository extends CrudRepository<CountryEntity, Long> {
}
