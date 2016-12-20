package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.boot")
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableFeignClients
public class FeignApplication {

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}



	public static void main(String[] args) {
		SpringApplication.run(FeignApplication.class, args);
	}

}
