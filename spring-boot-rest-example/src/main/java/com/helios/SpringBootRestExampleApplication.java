package com.helios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.javafaker.Faker;
import com.helios.models.EntiteJuridique;
import com.helios.models.Etablissement;
import com.helios.models.Interlocuteur;
import com.helios.models.SourceSiret;
import com.helios.repositories.EntiteJuridiqueRepository;
import com.helios.repositories.EtablissementRepository;
import com.helios.repositories.InterlocuteurRepository;
import com.helios.repositories.SourceSiretRepository;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
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
    public CommandLineRunner initializeDb(InterlocuteurRepository repository, EntiteJuridiqueRepository entiteRepository, EtablissementRepository etablissementRepo, SourceSiretRepository siretRepo){
        return (args) -> {
            repository.deleteAll();
            entiteRepository.deleteAll();
            etablissementRepo.deleteAll();
            siretRepo.deleteAll();
           EntiteJuridique ej1 = new EntiteJuridique("1-3G4J4OD", "1234", "Peugeot SA", "A-00-X", "Industrie automibile", "552100554", "55210055400021", "P1", "0", "Privé", "EDF Entreprises",true, faker.internet().emailAddress(), "Poissy", "A-00-X", "Peugeot", "Contractuel", "Excellence", "CLOE", "client", "5699 - SA à directoire (s.a.i.)", "7010Z - Activités des sièges sociaux", "19/06/1988", "7010Z", "Activités des sièges sociaux", "PEUGEOT SA", "CASE 17", "75 AV LA PETITE MURAILLE", "78116 PARIS (78116)", "", "", "", "", "", etablissementRepo.save(new Etablissement("8483","Peugeot SA", "Peugeot", "552100554", "5699 - SA à directoire (s.a.i.)", "7010Z - Activités des sièges sociaux", "19/06/1990", "7010Z", "Activités des sièges sociaux", "PEUGEOT SA", "CASE 17", "75 AV LA PETITE MURAILLE", "78116 PARIS (78116)", "", "", "", "", "")), siretRepo.save(new SourceSiret("5683",true, false, false, false)));
            
           	  repository.save(new Interlocuteur("1-105W7IX","MME","PACAUX","CLAIRE","+330619054702","+330619054702","PDG / Gérant","EDF Entreprises","","","",faker.internet().emailAddress(),true,false,true,new ArrayList<EntiteJuridique>(
         		    Arrays.asList(entiteRepository.save(ej1)))));
              repository.save( new Interlocuteur("1-11FKG94","MME","PRELAZ","PRESCILLIA","+330689886372","+330689886372","Autre","","","","",faker.internet().emailAddress(),true,true,true,new ArrayList<EntiteJuridique>(
            		    Arrays.asList(entiteRepository.save(ej1)))));
              repository.save( new Interlocuteur("1-138-345","M.","LALANNE","CHRISTIAN","+330381515430","+330381505797","Responsable","EDF Entreprises","","","",faker.internet().emailAddress(),false,true,false,new ArrayList<EntiteJuridique>(
            		    Arrays.asList(entiteRepository.save(ej1)))));
              

//           Interlocuteur i2 = new Interlocuteur("1-11FKG94","MME","PRELAZ","PRESCILLIA","+330689886372","+330689886372","Autre","","","","",faker.internet().emailAddress(),true,true,true);
//           Interlocuteur i3 = new Interlocuteur("1-138-345","M.","LALANNE","CHRISTIAN","+330381515430","+330381505797","Responsable","EDF Entreprises","","","",faker.internet().emailAddress(),false,true,false);
//           entiteRepository.save(ej1);
//           EntiteJuridique ej2 = new EntiteJuridique("1-3G4J4OD", "1234", "Peugeot SA", "A-00-X", "Industrie automibile", "552100554", "55210055400021", "P1", "0", "Privé", "EDF Entreprises",true, faker.internet().emailAddress(), "Poissy", "A-00-X", "Peugeot", "Contractuel", "Excellence", "CLOE", "client", "5699 - SA à directoire (s.a.i.)", "7010Z - Activités des sièges sociaux", "19/06/1988", "7010Z", "Activités des sièges sociaux", "PEUGEOT SA", "CASE 17", "75 AV LA PETITE MURAILLE", "78116 PARIS (78116)", "", "", "", "", "", new Etablissement("8483","Peugeot SA", "Peugeot", "552100554", "5699 - SA à directoire (s.a.i.)", "7010Z - Activités des sièges sociaux", "19/06/1990", "7010Z", "Activités des sièges sociaux", "PEUGEOT SA", "CASE 17", "75 AV LA PETITE MURAILLE", "78116 PARIS (78116)", "", "", "", "", ""), new SourceSiret("5683",true, false, false, false));
//           
//           
//           Interlocuteur i4 = i1;
//           Interlocuteur i5 = i2;
//           Interlocuteur i6 = i3; 
//           
//           i1.addEntiteJ(ej1);
//           i2.addEntiteJ(ej1);
//           i3.addEntiteJ(ej1);         
//           //Insert some random interlocuteurs
//        	repository.save(i1);
//        	
//            repository.save(i2);
//            
//            repository.save(i3);
//                
//            
//            List<Interlocuteur> listInterlocuteur = new ArrayList<>();
//            listInterlocuteur.add(i4);
//            listInterlocuteur.add(i5);
//            listInterlocuteur.add(i6);
//            
//            ej1.addListInterlocuteur(listInterlocuteur);
//            entiteRepository.save(ej1);
            
//                repository.save(new Interlocuteur("1-140QLER","M.","MESSAOUDI","EL-KHEIR","+330982283147","+330616638755","PDG / Gérant","EDF Entreprises","","Téléphone portable","",faker.internet().emailAddress(),true,false,false, new ArrayList<EntiteJuridique>(
//            		    Arrays.asList(entiteRepository.save(new EntiteJuridique("1-4A5I4KF", "93465693", "DDDDD", "955304759", "1", "PEC"))))));
//                
//                repository.save(new Interlocuteur("1-15FS3UE","M.","MOREIRA","JOSE","+330160127639","+330160127639","PDG / Gérant","","","","",faker.internet().emailAddress(),false,true,true, new ArrayList<EntiteJuridique>(
//            		    Arrays.asList(entiteRepository.save(new EntiteJuridique("1-5G6T4DO", "56937493", "EEEEE", "856930657", "0", "PEC"))))));
//                
//                repository.save(new Interlocuteur("1-15FTP98","MME","DAVID BUYEL","FRANCOISE","+330232595707","+330640969063","Assistant de Direction","EDF Entreprises","","","",faker.internet().emailAddress(),false,false,false, new ArrayList<EntiteJuridique>(
//
//            		    Arrays.asList(entiteRepository.save(new EntiteJuridique("1-3G4J4OD", "85696363", "FFFFF", "768460670", "0", "PEC"))))));   
//                
//                //Insert some random Entite Juridique
//                repository.save(new Interlocuteur("1-140QLERA","M.","MESSAOUDI","EL-KHEIR","+330982283147","+330616638755","PDG / Gérant","EDF Entreprises","","Téléphone portable","","1","",faker.internet().emailAddress()));
//                entiteRepository.save( new EntiteJuridique("1-6G7S4RDA", "85696363", "FFFFF", "768460670", "0", "PEC", Arrays.asList( (new Interlocuteur("1-15FTP98","MME","DAVID BUYEL","FRANCOISE","+330232595707","+330640969063","Assistant de Direction","EDF Entreprises","","","","1","",faker.internet().emailAddress())))));
//                entiteRepository.save( new EntiteJuridique("1-5G6T4DOA", "56937493", "EEEEE", "856930657", "0", "PEC", Arrays.asList( (new Interlocuteur("1-15FS3UE","MME","DAVID BUYEL","FRANCOISE","+330232595707","+330640969063","Assistant de Direction","EDF Entreprises","","","","1","",faker.internet().emailAddress())))));
//                entiteRepository.save( new EntiteJuridique("1-4A5I4KFA", "93465693", "DDDDD", "955304759", "1", "PEC", Arrays.asList( (new Interlocuteur("1-140QLERA","MME","DAVID BUYEL","FRANCOISE","+330232595707","+330640969063","Assistant de Direction","EDF Entreprises","","","","1","",faker.internet().emailAddress())))));
//                entiteRepository.save( new EntiteJuridique("1-3G4J4ODA", "76984303", "CCCCC", "753873287", "0", "PEC", Arrays.asList( (new Interlocuteur("1-138-345","MME","DAVID BUYEL","FRANCOISE","+330232595707","+330640969063","Assistant de Direction","EDF Entreprises","","","","1","",faker.internet().emailAddress())))));
//                entiteRepository.save( new EntiteJuridique("1-2D3V4PZA", "54829653", "BBBBB", "473832895", "0", "PEC", Arrays.asList( (new Interlocuteur("1-11FKG94","MME","DAVID BUYEL","FRANCOISE","+330232595707","+330640969063","Assistant de Direction","EDF Entreprises","","","","1","",faker.internet().emailAddress())))));
//                entiteRepository.save( new EntiteJuridique("1-1F2I4PQA", "61438533", "AAAAA", "811524909", "0", "PEC", Arrays.asList( (new Interlocuteur("1-105W7IX","MME","DAVID BUYEL","FRANCOISE","+330232595707","+330640969063","Assistant de Direction","EDF Entreprises","","","","1","",faker.internet().emailAddress())))));


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
