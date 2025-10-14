package com.vasiliskardaras.soap_client;

import com.vasiliskardaras.soap_client.soap.GetCountryResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SoapClientApplication {

	private static final Logger log = LoggerFactory.getLogger(SoapClientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SoapClientApplication.class, args);
	}
}
