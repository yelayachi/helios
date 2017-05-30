package com.helios;

import java.util.ArrayList;
import java.util.Arrays;

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
