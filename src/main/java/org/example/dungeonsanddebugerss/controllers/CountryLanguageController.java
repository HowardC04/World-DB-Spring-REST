package org.example.dungeonsanddebugerss.controllers;

import org.example.dungeonsanddebugerss.model.entities.CountryEntity;
import org.example.dungeonsanddebugerss.model.entities.CountryLanguageEntity;
import org.example.dungeonsanddebugerss.service.CountryLanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CountryLanguageController {
    private final CountryLanguageService countryLanguageService;

    @Autowired
    public CountryLanguageController(CountryLanguageService countryLanguageService) {
        this.countryLanguageService = countryLanguageService;
    }

    @PostMapping("/language")
    @ResponseStatus(HttpStatus.CREATED)
    public void addCountryLanguage(@RequestBody CountryLanguageEntity countryLanguage){
        // TODO
    }

    @GetMapping("/languages")
    public List<CountryLanguageEntity> getAllCountryLanguages(){
        return countryLanguageService.getAllCountryLanguages();
    }

    @GetMapping("/language/{id}")
    public CountryLanguageEntity getCountryLanguageById(@PathVariable int id){
        // TODO
        return null;
    }

    @PutMapping("/language/{id}")
    public CountryLanguageEntity updateCountryLanguage(@PathVariable int id, @RequestBody CountryLanguageEntity countryLanguage){
        // TODO
        return null;
    }

    @DeleteMapping("/language/{id}")
    public CountryLanguageEntity deleteCountryLanguage(@PathVariable int id){
        // TODO
        return null;
    }
}
