package com.helios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.async.DeferredResult;

import com.github.javafaker.Faker;
import com.helios.models.EntiteJuridique;
import com.helios.models.Interlocuteur;
import com.helios.repositories.EntiteJuridiqueRepository;
import com.helios.repositories.InterlocuteurRepository;

import io.swagger.models.Tag;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.schema.WildcardType;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
 
@Configuration
@EnableAutoConfiguration
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
            entiteRepository.deleteAll();
            //Insert some random interlocuteurs
            	repository.save(new Interlocuteur("1-105W7IX","MME","PACAUX","CLAIRE","+330619054702","+330619054702","PDG / Gérant","EDF Entreprises","","","","1","",faker.internet().emailAddress(), new ArrayList<EntiteJuridique>(
            		    Arrays.asList(entiteRepository.save(new EntiteJuridique("1-1F2I4PQ", "61438533", "AAAAA", "811524909", "0", "PEC"))))));
            	
                repository.save(new Interlocuteur("1-11FKG94","MME","PRELAZ","PRESCILLIA","+330689886372","+330689886372","Autre","","","","","0","",faker.internet().emailAddress(), new ArrayList<EntiteJuridique>(
            		    Arrays.asList(entiteRepository.save(new EntiteJuridique("1-2D3V4PZ", "54829653", "BBBBB", "473832895", "0", "PEC"))))));
                
                repository.save(new Interlocuteur("1-138-345","M.","LALANNE","CHRISTIAN","+330381515430","+330381505797","Responsable","EDF Entreprises","","","","1","",faker.internet().emailAddress(), new ArrayList<EntiteJuridique>(
            		    Arrays.asList(entiteRepository.save(new EntiteJuridique("1-3G4J4OD", "76984303", "CCCCC", "753873287", "0", "PEC"))))));
                
                repository.save(new Interlocuteur("1-140QLER","M.","MESSAOUDI","EL-KHEIR","+330982283147","+330616638755","PDG / Gérant","EDF Entreprises","","Téléphone portable","","1","",faker.internet().emailAddress(), new ArrayList<EntiteJuridique>(
            		    Arrays.asList(entiteRepository.save(new EntiteJuridique("1-4A5I4KF", "93465693", "DDDDD", "955304759", "1", "PEC"))))));
                
                repository.save(new Interlocuteur("1-15FS3UE","M.","MOREIRA","JOSE","+330160127639","+330160127639","PDG / Gérant","","","","","0","",faker.internet().emailAddress(), new ArrayList<EntiteJuridique>(
            		    Arrays.asList(entiteRepository.save(new EntiteJuridique("1-5G6T4DO", "56937493", "EEEEE", "856930657", "0", "PEC"))))));
                
                repository.save(new Interlocuteur("1-15FTP98","MME","DAVID BUYEL","FRANCOISE","+330232595707","+330640969063","Assistant de Direction","EDF Entreprises","","","","1","",faker.internet().emailAddress(), new ArrayList<EntiteJuridique>(

            		    Arrays.asList(entiteRepository.save(new EntiteJuridique("1-3G4J4OD", "85696363", "FFFFF", "768460670", "0", "PEC"))))));   
                //Insert some random Entite Juridique
                repository.save(new Interlocuteur("1-140QLERA","M.","MESSAOUDI","EL-KHEIR","+330982283147","+330616638755","PDG / Gérant","EDF Entreprises","","Téléphone portable","","1","",faker.internet().emailAddress()));
                entiteRepository.save( new EntiteJuridique("1-6G7S4RDA", "85696363", "FFFFF", "768460670", "0", "PEC", Arrays.asList( (new Interlocuteur("1-15FTP98","MME","DAVID BUYEL","FRANCOISE","+330232595707","+330640969063","Assistant de Direction","EDF Entreprises","","","","1","",faker.internet().emailAddress())))));
                entiteRepository.save( new EntiteJuridique("1-5G6T4DOA", "56937493", "EEEEE", "856930657", "0", "PEC", Arrays.asList( (new Interlocuteur("1-15FS3UE","MME","DAVID BUYEL","FRANCOISE","+330232595707","+330640969063","Assistant de Direction","EDF Entreprises","","","","1","",faker.internet().emailAddress())))));
                entiteRepository.save( new EntiteJuridique("1-4A5I4KFA", "93465693", "DDDDD", "955304759", "1", "PEC", Arrays.asList( (new Interlocuteur("1-140QLERA","MME","DAVID BUYEL","FRANCOISE","+330232595707","+330640969063","Assistant de Direction","EDF Entreprises","","","","1","",faker.internet().emailAddress())))));
                entiteRepository.save( new EntiteJuridique("1-3G4J4ODA", "76984303", "CCCCC", "753873287", "0", "PEC", Arrays.asList( (new Interlocuteur("1-138-345","MME","DAVID BUYEL","FRANCOISE","+330232595707","+330640969063","Assistant de Direction","EDF Entreprises","","","","1","",faker.internet().emailAddress())))));
                entiteRepository.save( new EntiteJuridique("1-2D3V4PZA", "54829653", "BBBBB", "473832895", "0", "PEC", Arrays.asList( (new Interlocuteur("1-11FKG94","MME","DAVID BUYEL","FRANCOISE","+330232595707","+330640969063","Assistant de Direction","EDF Entreprises","","","","1","",faker.internet().emailAddress())))));
                entiteRepository.save( new EntiteJuridique("1-1F2I4PQA", "61438533", "AAAAA", "811524909", "0", "PEC", Arrays.asList( (new Interlocuteur("1-105W7IX","MME","DAVID BUYEL","FRANCOISE","+330232595707","+330640969063","Assistant de Direction","EDF Entreprises","","","","1","",faker.internet().emailAddress())))));


        };
    }
    
    /**
     * 
     * @return
     */

//    @Bean
//    public Docket swaggerSettings() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .build()
//                .pathMapping("/");
//    }

	@Bean
    public Docket newsApi() {
		return new Docket(DocumentationType.SWAGGER_2)  
		          .select()                                  
		          .apis(RequestHandlerSelectors.any())              
		          .paths(PathSelectors.any())                          
		          .build();
    }
     @Bean
    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot Aaxon REST Sample with Swagger")
                .description("Spring Boot Aaxon REST Sample with Swagger")
                .contact("Sravan Kumar")
                .license("Apache License Version 2.0")
                .build();
    
    
}
}
