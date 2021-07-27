package com.example.demo.repository;

import com.example.demo.entity.PersonEntity;
import com.example.demo.interfaces.IPersonRepository;

import java.util.Optional;

public class PersonRepository implements IPersonRepository {
    @Override
    public <S extends PersonEntity> S save(S s) {
        return null;
    }

    @Override
    public <S extends PersonEntity> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<PersonEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<PersonEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<PersonEntity> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(PersonEntity PersonEntity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> iterable) {

    }

    @Override
    public void deleteAll(Iterable<? extends PersonEntity> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
