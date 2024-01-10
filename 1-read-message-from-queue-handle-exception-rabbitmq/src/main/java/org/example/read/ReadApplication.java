package org.example.read;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;
import java.util.function.Consumer;

@SpringBootApplication
public class ReadApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadApplication.class, args);
    }

    @Bean
	/*
	  Read message from queue and display it on console
	  Throw exception while processing message if message is "fail"
	  The exception stack and payload will be written to DLQ
	 */
    public Consumer<String> readMessageFromQueue() {
        return message -> {

            if (message.equalsIgnoreCase("fail")) {
                System.out.println("Received fail message");
                throw new RuntimeException("Intentional");
            } else {
                System.out.println("Message read from queue : " + message);
            }
        };
    }

}
