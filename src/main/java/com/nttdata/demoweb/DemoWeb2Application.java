package com.nttdata.demoweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@EnableCaching
@SpringBootApplication
public class DemoWeb2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoWeb2Application.class, args);
	}

}
