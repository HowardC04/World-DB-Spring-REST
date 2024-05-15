package org.example.dungeonsanddebugerss.controllers;

import org.example.dungeonsanddebugerss.model.entities.CityEntity;
import org.example.dungeonsanddebugerss.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CityController {
    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @PostMapping("/city")
    @ResponseStatus(HttpStatus.CREATED)
    public void addCity(@RequestBody CityEntity city) {
        // TODO
    }

    @GetMapping("/cities")
    public List<CityEntity> getAllCities() {
        return cityService.getAllCities();
    }

    @GetMapping("/city/{id}")
    public CityEntity getCityById(@PathVariable int id) {
        // TODO
        return cityService.getCityById(id).get();
    }

    @GetMapping("/city/name")
    public List<CityEntity> getCityProperty(@RequestParam(name="name") String name) {
        // TODO
        return null;
    }

    @PutMapping("/city/{id}")
    public CityEntity updateCity(@RequestBody CityEntity city, @PathVariable Integer id) {
        // TODO
        return null;
    }

    @DeleteMapping("/city/{id}")
    public CityEntity deleteCity(@PathVariable int id) {
        // TODO
        return null;
    }
}
