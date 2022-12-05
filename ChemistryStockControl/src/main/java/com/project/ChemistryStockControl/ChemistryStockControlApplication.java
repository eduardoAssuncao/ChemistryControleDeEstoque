package com.project.ChemistryStockControl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication (exclude = {SecurityAutoConfiguration.class})
public class ChemistryStockControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChemistryStockControlApplication.class, args);
	}

}
