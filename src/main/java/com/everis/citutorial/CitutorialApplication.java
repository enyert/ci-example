package com.everis.citutorial;

import com.everis.citutorial.entity.Beer;
import com.everis.citutorial.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;


@SpringBootApplication
public class CitutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitutorialApplication.class, args);
	}
}

@Component
class BeerInitializer implements CommandLineRunner {

	private final BeerRepository beerRepository;

	BeerInitializer(BeerRepository beerRepository) {
		this.beerRepository = beerRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Stream.of("Polar Light", "Polar Negra", "Regional", "Solera",
				"Corona", "Barbarian", "Brahma")
				.forEach(beer -> beerRepository.save(new Beer(beer)));

		beerRepository.findAll().forEach(System.out::println);
	}
}
