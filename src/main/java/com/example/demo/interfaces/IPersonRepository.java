package com.example.demo.interfaces;

import com.example.demo.entity.PersonEntity;
import org.springframework.data.repository.CrudRepository;

public interface IPersonRepository extends CrudRepository<PersonEntity, Long> {
}
