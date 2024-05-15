package org.example.dungeonsanddebugerss.exception;

public class CountryNotFoundException extends Exception {
    public CountryNotFoundException(String country) {
        super("Could not find country: " + country);
    }

}
