package com.helios.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kaspernissen on 11/05/2017.
 */
@RestController
@RequestMapping("/pies")
public class PieRestController {

//        @Autowired
//        private PieRepository repository;
//
//        @RequestMapping(method = RequestMethod.GET)
//        public ResponseEntity<Collection<Pie>> getAllPies(){
//            return new ResponseEntity<>((Collection<Pie>) repository.findAll(), HttpStatus.OK);
//        }
//
//        @RequestMapping(method = RequestMethod.GET, value = "/{id}")
//        public ResponseEntity<Pie> getPieWithId(@PathVariable Long id) {
//            return new ResponseEntity<>(repository.findOne(id),HttpStatus.OK);
//        }
//
//        @RequestMapping(method = RequestMethod.GET, params = {"name"})
//        public ResponseEntity<Collection<Pie>> findPieWithName(@RequestParam(value="name") String name) {
//            return new ResponseEntity<>(repository.findByName(name), HttpStatus.OK);
//        }
//
//        @RequestMapping(method = RequestMethod.POST)
//        public ResponseEntity<?> addPie(@RequestBody Pie input) {
//            return new ResponseEntity<>(repository.save(input), HttpStatus.CREATED);
//        }
        

        
        
        
        /**
         * Service qui permet d'obtenir un interlocuteur à partir de son id
         */
        
//        @RequestMapping(method = RequestMethod.GET, params = {"name"})
//        public ResponseEntity<Collection<Interlocuteur>> getInterlocuteur(@RequestParam(value="id") String id) {
//            return new ResponseEntity<>(repository.findByName(id), HttpStatus.OK);
//        }
}
