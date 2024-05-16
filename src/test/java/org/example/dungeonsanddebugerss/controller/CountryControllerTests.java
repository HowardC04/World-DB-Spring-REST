package org.example.dungeonsanddebugerss.controller;

import org.example.dungeonsanddebugerss.controllers.CountryController;
import org.example.dungeonsanddebugerss.model.entities.CountryEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@EnableWebMvc
public class CountryControllerTests {
    private WebTestClient webTestClient;
    @Autowired
    private CountryController countryController;

    @BeforeEach
    public void setup(){
        webTestClient = WebTestClient.bindToServer().baseUrl("http://localhost:8080").build();
    }

    @Test
    @DisplayName("Check endpoint /countries returns status code 200")
    @Transactional
    void checkGetCountriesReturns200(){
        webTestClient.get().uri("/api/countries")
                .exchange()
                .expectStatus()
                .is2xxSuccessful();
   }
    @Test
    @DisplayName("Check that the first country is Afghanistan")
    void checkThatFirstCountryIsAfgahanistan(){
        webTestClient.get()
                .uri("http://localhost:8080/api/country/AFG")
                .exchange()
                .expectBody(CountryEntity.class)
                .value(country -> assertEquals("Afghanistan", country.getName()));
    }


}
