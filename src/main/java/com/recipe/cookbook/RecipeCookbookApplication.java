package com.recipe.cookbook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class RecipeCookbookApplication {

	private static final Logger log = LoggerFactory.getLogger(RecipeCookbookApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RecipeCookbookApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner demo(RecipeRepository repository) {
//		return (args) -> {
//			// save a couple of customers
//			if (repository.findOne(1L) == null) {
//				Recipe recipe1 = new Recipe();
//				recipe1.setName("Scone");
//				recipe1.setDescription("Devon scone with strawberry jam.");
//				repository.save(recipe1);
//			}
//
//			if (repository.findOne(2L) == null) {
//				Recipe recipe2 = new Recipe();
//				recipe2.setName("Crepe");
//				recipe2.setDescription("French crepe.");
//				repository.save(recipe2);
//			}
//
//			// fetch all customers
//			log.info("Customers found with findAll():");
//			log.info("-------------------------------");
//			for (Recipe recipe : repository.findAll()) {
//				log.info(recipe.toString());
//			}
//			log.info("");
//
//			// fetch an individual customer by ID
//			Recipe recipe = repository.findOne(1L);
//			log.info("Customer found with findOne(1L):");
//			log.info("--------------------------------");
//			log.info(recipe.toString());
//			log.info("");
//		};
//	}
}
