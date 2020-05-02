package com.maketest.reservations.manager;

import com.maketest.reservations.dao.TourRepository;
import com.maketest.reservations.dao.entity.Tour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TourManager {
    private TourRepository tourRepository;

    @Autowired
    public TourManager(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }

    public Optional<Tour> find(Long id){
        return tourRepository.findById(id);
    }

    public Iterable<Tour> findAll(){
        return tourRepository.findAll();
    }

    public void save(Tour tour){
        tourRepository.save(tour);
    }
}
