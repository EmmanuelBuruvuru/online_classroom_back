package com.example.UserAuthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UserAuthenticationApplication {
	public static void main(String[] args) { SpringApplication.run(UserAuthenticationApplication.class, args); }

}
