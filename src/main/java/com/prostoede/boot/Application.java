package com.prostoede.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author prostoede
 */
@SpringBootApplication
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
	SpringApplication.run(Application.class);
    }
}
