package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringProfileApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringProfileApplication.class, args);
		
		//context.getEnvironment().setActiveProfiles("dev");
		//context.register(AppConfig.class);
		//context.refresh();

		//((ConfigurableApplicationContext) context).close();
	}
}
