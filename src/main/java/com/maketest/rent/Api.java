package com.maketest.rent;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
@RequestMapping("/api/tours/")
public class Api {

    private List<Tour> tours;

    public Api(){
        tours = new ArrayList<>();
        tours.add(new Tour( 1L, LocalDate.ofYearDay(2020,300), "Zenon", 30));
    }

    @GetMapping("/all")
    public List<Tour> getAll(){
        return tours;
    }

    @GetMapping("/id")
    public Optional<Tour> getById(@RequestParam int id){
        return tours.stream().filter(element -> element.getId() == id).findFirst();
    }

    @PostMapping("/add")
    public void addTour(@RequestParam int id, String employee, int maxPlaces){
        this.tours.add(new Tour((long) id, LocalDate.now(), employee, maxPlaces));
    }

}
