package com.vasiliskardaras.soap_client;

import com.vasiliskardaras.soap_client.soap.GetCountryResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SoapClientApplication {

	private static final Logger log = LoggerFactory.getLogger(SoapClientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SoapClientApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(CountryClient countryClient) {
		return args -> {
			String country = "Spain";

			if (args.length > 0) {
				country = args[0];
			}
			GetCountryResponse response = countryClient.getCountry(country);
			log.info(String.format("Requesting location for %s with capital: %s, population: %d, and currency: %s",
					response.getCountry().getName(),
					response.getCountry().getCapital(),
					response.getCountry().getPopulation(),
					response.getCountry().getCurrency()));
		};
	}
}
