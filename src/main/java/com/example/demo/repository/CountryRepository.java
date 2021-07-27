package com.example.demo.repository;

import com.example.demo.entity.CountryEntity;
import com.example.demo.interfaces.ICountryRepository;

import java.util.Optional;

public class CountryRepository implements ICountryRepository {
    @Override
    public <S extends CountryEntity> S save(S s) {
        return null;
    }

    @Override
    public <S extends CountryEntity> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<CountryEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<CountryEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<CountryEntity> findAllById(Iterable<Long> iterable) {
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
    public void delete(CountryEntity countryEntity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> iterable) {

    }

    @Override
    public void deleteAll(Iterable<? extends CountryEntity> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
