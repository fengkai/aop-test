package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Main app
 */
@SpringBootApplication
public class MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new SpringApplication(MainApp.class).run(args);
		TestService testService = context.getBean(TestService.class);
		testService.test();

		AnotherTestService anotherTestService = context.getBean(AnotherTestService.class);
		anotherTestService.test();

	}

}
