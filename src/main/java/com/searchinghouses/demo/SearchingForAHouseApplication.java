package com.searchinghouses.demo;

import com.searchinghouses.house.Aspect;
import com.searchinghouses.house.House;
import com.searchinghouses.repository.HouseRepository;
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
public class SearchingForAHouseApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SearchingForAHouseApplication.class, args);
	}
	@Autowired
	private HouseRepository repository;

	@Override
	public void run(String... args) throws Exception {
		Aspect aspect1 = new Aspect();
		aspect1.setDescription("Muebles granito");
		List<Aspect> aspectList = new ArrayList<>();
		aspectList.add(aspect1);
		House h = new House(UUID.randomUUID().toString(), "Casa X");
		h.setAspects(aspectList);

		// save a couple of customers
		repository.insert(h);


		// fetch all customers
		System.out.println("House found with findAll():");
		System.out.println("-------------------------------");
		for (House house : repository.findAll()) {
			System.out.println(house);
		}
		System.out.println();



	}

}
