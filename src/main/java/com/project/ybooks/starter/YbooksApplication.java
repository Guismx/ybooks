package com.project.ybooks.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages = "com.project.ybooks.repositories")
@EntityScan(basePackages = "com.project.ybooks.models")
@SpringBootApplication(scanBasePackages = "com.project.ybooks")
public class YbooksApplication {
	public static void main(String[] args) {
		SpringApplication.run(YbooksApplication.class, args);
	}
}
