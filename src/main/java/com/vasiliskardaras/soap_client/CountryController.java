package com.vasiliskardaras.soap_client;

import com.vasiliskardaras.soap_client.soap.GetCountryResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    private final CountryClient countryClient;

    public CountryController(CountryClient countryClient) {
        this.countryClient = countryClient;
    }

    @GetMapping("/country/{name}")
    public GetCountryResponse getCountryResponse(@PathVariable String name) {
        return countryClient.getCountry(name);
    }
}
