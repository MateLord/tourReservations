package com.maketest.reservations.api;

import com.maketest.reservations.dao.entity.Tour;
import com.maketest.reservations.manager.TourManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Optional;

@RestController
@RequestMapping("/api/tours")
public class TourApi {
    private TourManager database;

    @Autowired
    public TourApi(TourManager tourManager){

        this.database = tourManager;
    }

    @GetMapping("/all")
    public Iterable<Tour> getAll(){
        return this.database.findAll();
    }

    @GetMapping("/id")
    public Optional<Tour> getById(@RequestParam Long id){
        return this.database.find(id);
    }

    @PostMapping("/add")
    public void addTour(@RequestParam String employee, int maxPlaces){
       this.database.save(new Tour(LocalDate.now(), employee, maxPlaces));
    }

}
