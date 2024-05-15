package org.example.dungeonsanddebugerss.controllers;

import org.example.dungeonsanddebugerss.model.entities.CountryEntity;
import org.example.dungeonsanddebugerss.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public String addCountry(@RequestBody CountryEntity countryEntity){
        countryService.createCountry(countryEntity);
        return "Country: " + countryEntity.getName() + " has been added to the database";
    }

    @GetMapping("/countries")
    public List<CountryEntity> getAllCountries(){
        return countryService.getAllCountries();
    }

    @GetMapping("/country/{countryCode}")
    public CountryEntity getCountryById(@PathVariable String countryCode){
        return countryService.getCountryByCode(countryCode).orElseThrow();
    }

    @PutMapping("/country/{countryCode}")
    public Optional<CountryEntity> updateCountry(@RequestBody CountryEntity country, @PathVariable String countryCode){
        Optional<CountryEntity> findCountry = countryService.getCountryByCode(countryCode);

        if (findCountry.isPresent() && country != null) {
            countryService.updateCountry(countryCode, country);
        }

        return countryService.getCountryByCode(countryCode);
    }

    @DeleteMapping("/country/{countryCode}")
    public String deleteCountry(@PathVariable String countryCode){
        Optional<CountryEntity> countryToRemove = countryService.getCountryByCode(countryCode);
        System.out.println();
        if (countryToRemove.isPresent()) {
            // throw new NoSuchElementException("Country not found");
        }
        countryService.deleteCountry(countryCode);

        return  "Country with country code: " + countryCode + " deleted successfully";
    }


    }

