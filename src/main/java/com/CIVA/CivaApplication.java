package com.CIVA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.web.webauthn.api.UserVerificationRequirement;

@SpringBootApplication
public class CivaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CivaApplication.class, args);

	}
}
