package com.demoapi2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing

public class DemoApi2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoApi2Application.class, args);
	}

}
