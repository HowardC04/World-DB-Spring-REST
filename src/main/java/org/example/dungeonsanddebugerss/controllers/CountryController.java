package org.example.dungeonsanddebugerss.controllers;

import org.example.dungeonsanddebugerss.model.entities.CountryEntity;
import org.example.dungeonsanddebugerss.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CountryController {
    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @PostMapping("/country")
    @ResponseStatus(HttpStatus.CREATED)
    public void addCountry(){
        // TODO
    }

    @GetMapping("/countries")
    public List<CountryEntity> getAllCountries(){
        return countryService.getAllCountries();
    }

    @GetMapping("/country/{countryCode}")
    public CountryEntity getCountryById(@PathVariable String countryCode){
        // TODO
        return countryService.getCountryByCode(countryCode).get();
    }

    @PutMapping("/country/{id}")
    public CountryEntity updateCountry(@RequestBody CountryEntity country, @PathVariable Integer id){
        // TODO
        return null;
    }

    @DeleteMapping("/country/{id}")
    public CountryEntity deleteCountry(@PathVariable int id){
        // TODO
        return null;
    }
}
