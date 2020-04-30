package com.maketest.rent;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
@RequestMapping("/api/tours/")
public class Api {
    private InMemoryDatabase database;

    public Api(){
        this.database = new InMemoryDatabase();
    }

    @GetMapping("/all")
    public Page<Tour> getAll(){
        return this.database.findAll(PageRequest.of(0, 5));
    }

    @GetMapping("/id")
    public Tour getById(@RequestParam int id){
        return this.database.findById(id);
    }

    @PostMapping("/add")
    public void addTour(@RequestParam String employee, int maxPlaces){
       this.database.save(new Tour(LocalDate.now(), employee, maxPlaces));
    }

}
