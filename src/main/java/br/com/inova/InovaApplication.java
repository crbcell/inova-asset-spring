package br.com.inova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@EnableSpringDataWebSupport
@SpringBootApplication
public class InovaApplication {

	public static void main(String[] args) {
		SpringApplication.run(InovaApplication.class, args);
	}

}
