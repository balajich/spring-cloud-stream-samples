package org.example.read;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
public class ReadApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadApplication.class, args);
	}
	@Bean
	/*
	  Read message from queue and display it on console
	 */
	public Consumer<String> readMessageFromQueue() {
		return message -> System.out.println("Received message " + message);
	}

}
