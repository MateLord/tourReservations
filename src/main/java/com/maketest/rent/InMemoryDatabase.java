package com.maketest.rent;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

import static java.util.Objects.requireNonNull;

class InMemoryDatabase {
    private ConcurrentHashMap<Integer, Tour> map = new ConcurrentHashMap<>();

    public Tour save(Tour tour) {
        requireNonNull(tour);
        map.put(map.size()+1, tour);
        return tour;
    }

    public Tour findById(int id) {
        return map.get(id);
    }

    public Page<Tour> findAll(Pageable pageable) {
        return new PageImpl<>(new ArrayList<>(map.values()), pageable, map.size());
    }
}
