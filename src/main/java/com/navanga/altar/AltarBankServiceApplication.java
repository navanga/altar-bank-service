package com.navanga.altar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;

@EnableDiscoveryClient
@SpringBootApplication
public class AltarBankServiceApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(AltarBankServiceApplication.class, args);
		

		for (String name : applicationContext.getBeanDefinitionNames()) {
			//System.out.println(name);
		}
	}
}
