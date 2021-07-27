package com.example.demo.interfaces;

import com.example.demo.entity.CityEntity;
import org.springframework.data.repository.CrudRepository;

public interface ICityRepository extends CrudRepository<CityEntity, Long> {
}
