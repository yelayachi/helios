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
            	repository.save(new Interlocuteur("1-15IU9T9","M.","AMAROUAYACHE","NAIM","+33681382416",faker.internet().emailAddress(),"EDF Entreprises","Gestionnaire", new ArrayList<EntiteJuridique>(
            		    Arrays.asList(entiteRepository.save(new EntiteJuridique("1-1F2I4PQ", "61438533", "AAAAA", "811524909", "0", "PEC"))))));
            	
                repository.save(new Interlocuteur("1-1MAOOX1","M.","TEIXEIRA","DAVID","+330664510110",faker.internet().emailAddress(),"","Autre", new ArrayList<EntiteJuridique>(
            		    Arrays.asList(entiteRepository.save(new EntiteJuridique("1-2D3V4PZ", "54829653", "BBBBB", "473832895", "0", "PEC"))))));
                
                repository.save(new Interlocuteur("1-6SHPIC","M.","RUTHMANN","CHRISTOPHE","+330689810252",faker.internet().emailAddress(),"EDF Entreprises","PDG / Gérant", new ArrayList<EntiteJuridique>(
            		    Arrays.asList(entiteRepository.save(new EntiteJuridique("1-3G4J4OD", "76984303", "CCCCC", "753873287", "0", "PEC"))))));
                
                repository.save(new Interlocuteur("1-NOTV2","M.","GAROT","ERIC","+33689736604",faker.internet().emailAddress(),"EDF Entreprises","Resp Services technique", new ArrayList<EntiteJuridique>(
            		    Arrays.asList(entiteRepository.save(new EntiteJuridique("1-4A5I4KF", "93465693", "DDDDD", "955304759", "1", "PEC"))))));
                
                repository.save(new Interlocuteur("1-NQZ5TW","MME","DARIBOT","CATHERINE","+33644057517",faker.internet().emailAddress(),"EDF Entreprises","Assistant de Direction", new ArrayList<EntiteJuridique>(
            		    Arrays.asList(entiteRepository.save(new EntiteJuridique("1-5G6T4DO", "56937493", "EEEEE", "856930657", "0", "PEC"))))));
                
                repository.save(new Interlocuteur("1-O8U4GO","M.","CROZAT","BAPTISTE","+33623710234",faker.internet().emailAddress(),"EDF Entreprises","Directeur", new ArrayList<EntiteJuridique>(
            		    Arrays.asList(entiteRepository.save(new EntiteJuridique("1-6G7S4RD", "85696363", "FFFFF", "768460670", "0", "PEC"))))));                           
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
