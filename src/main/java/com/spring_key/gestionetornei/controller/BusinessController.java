package com.spring_key.gestionetornei.controller;

import com.spring_key.gestionetornei.model.Business;
import com.spring_key.gestionetornei.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/business")
public class BusinessController {
    @Autowired
    private BusinessService businessService;

    //CRUD

    //CREATE
    @PostMapping("/add")
    public ResponseEntity <Business>add(@RequestBody Business business) {
        return new ResponseEntity<>(businessService.add(business),HttpStatus.CREATED);
    }

    //READ
    @GetMapping("/get/{id}")
    public ResponseEntity<Business>get(@PathVariable long id){
        return new ResponseEntity<>(businessService.get(id),HttpStatus.CREATED) ;
    }
    @GetMapping("/get")
    public List<Business> getall(){
        return businessService.getall();
    }

    //Update
    @PutMapping("/update/{id}/name/{name}")
    public ResponseEntity<Business> updateName(@PathVariable long id, @PathVariable String name){
        return new ResponseEntity<>(businessService.updateName(name, id),HttpStatus.ACCEPTED);
    }


    //Delete
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable long id){

        return businessService.delete(id);
    }
}
