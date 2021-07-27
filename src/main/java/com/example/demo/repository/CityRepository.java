package com.example.demo.repository;

import com.example.demo.entity.CityEntity;
import com.example.demo.interfaces.ICityRepository;

import java.util.Optional;

public class CityRepository implements ICityRepository {
    @Override
    public <S extends CityEntity> S save(S s) {
        return null;
    }

    @Override
    public <S extends CityEntity> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<CityEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<CityEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<CityEntity> findAllById(Iterable<Long> iterable) {
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
    public void delete(CityEntity CityEntity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> iterable) {

    }

    @Override
    public void deleteAll(Iterable<? extends CityEntity> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
