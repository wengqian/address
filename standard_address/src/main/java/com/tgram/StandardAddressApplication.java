package com.tgram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.tgram")
public class StandardAddressApplication {

	public static void main(String[] args) {
		SpringApplication.run(StandardAddressApplication.class, args);
	}
}
