package com.helios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.javafaker.Faker;
import com.helios.models.EntiteJuridique;
import com.helios.models.Interlocuteur;
import com.helios.repositories.EntiteJuridiqueRepository;
import com.helios.repositories.InterlocuteurRepository;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringBootRestExampleApplication {

    private final Faker faker = new Faker();

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestExampleApplication.class, args);
	}

    @Bean
    public CommandLineRunner initializeDb(InterlocuteurRepository repository, EntiteJuridiqueRepository entiteRepository){
        return (args) -> {
            repository.deleteAll();
            //Insert some random interlocuteurs
            for(int i = 0; i < 20; i++) {
            
                repository.save(new Interlocuteur(faker.lorem().word(), faker.lorem().sentence(), faker.lorem().word(), faker.lorem().word(), faker.lorem().word(), faker.lorem().word(), faker.lorem().word(), faker.lorem().word(), new ArrayList<EntiteJuridique>(
            		    Arrays.asList(entiteRepository.save(new EntiteJuridique(new Long(1), faker.lorem().word(), faker.lorem().word(), faker.lorem().word(), faker.lorem().word(), faker.lorem().word()))))));
            }
        };
    }
    
    /**
     * 
     * @return
     */

    @Bean
    public Docket swaggerSettings() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .pathMapping("/");
    }
}
