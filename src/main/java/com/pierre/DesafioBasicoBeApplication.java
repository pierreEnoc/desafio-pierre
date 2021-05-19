package com.pierre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DesafioBasicoBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioBasicoBeApplication.class, args);
	}

}
