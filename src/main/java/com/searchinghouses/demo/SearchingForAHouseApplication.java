package com.searchinghouses.demo;

import com.searchinghouses.house.Aspect;
import com.searchinghouses.house.House;
import com.searchinghouses.repository.HouseRepository;
import com.searchinghouses.services.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@ComponentScan("com.searchinghouses")
@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = HouseRepository.class)
public class SearchingForAHouseApplication{

	public static void main(String[] args) {
		SpringApplication.run(SearchingForAHouseApplication.class, args);
	}
}
