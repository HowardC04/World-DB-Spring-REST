package org.example.dungeonsanddebugerss.controller;

import org.example.dungeonsanddebugerss.controllers.CountryController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class CountryControllerTests {
    private WebTestClient webTestClient;

    private CountryController countryController;

    @BeforeEach

    public void setup(){
        webTestClient = WebTestClient.bindToServer().baseUrl("http://localhost:8000").build();
    }

    @Test
    @DisplayName("Check /countries  returns status code 200")
    @Transactional
    void checkGetAuthorsReturns200(){
        webTestClient.get().uri("/countries")
                .exchange()
                .expectStatus()
                .is2xxSuccessful();
   }
//
//    @Test
//    @DisplayName("Check ")



}
