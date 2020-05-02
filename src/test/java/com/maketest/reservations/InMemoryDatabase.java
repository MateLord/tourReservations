package com.maketest.reservations;

import com.maketest.reservations.dao.TourRepository;
import com.maketest.reservations.dao.entity.Tour;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import static java.util.Objects.requireNonNull;

public class InMemoryDatabase implements TourRepository {
    private ConcurrentHashMap<Integer, Tour> map = new ConcurrentHashMap<>();

    public Tour save(Tour tour) {
        requireNonNull(tour);
        map.put(map.size()+1, tour);
        return tour;
    }

    public Page<Tour> findAll(Pageable pageable) {
        return new PageImpl<>(new ArrayList<>(map.values()), pageable, map.size());
    }

    @Override
    public <S extends Tour> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Tour> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Tour> findAll() {
        return null;
    }

    @Override
    public Iterable<Tour> findAllById(Iterable<Long> iterable) {
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
    public void delete(Tour tour) {

    }

    @Override
    public void deleteAll(Iterable<? extends Tour> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
