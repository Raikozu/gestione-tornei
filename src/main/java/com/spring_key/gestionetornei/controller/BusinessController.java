package com.spring_key.gestionetornei.controller;

import com.spring_key.gestionetornei.model.Business;
import com.spring_key.gestionetornei.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Business add(@RequestBody Business business) {
        return businessService.add(business);
    }

    //READ
    @GetMapping("/get/{id}")
    public Business get(@PathVariable long id){
        return businessService.get(id);
    }
    @GetMapping("/get")
    public List<Business> getall(){
        return businessService.getall();
    }

    //Update
    @PutMapping("/update/{id}/name/{name}")
    public Business updateName(@PathVariable long id, @PathVariable String name){
        return businessService.updateName(name,id);
    }


    //Delete
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable long id){
        return businessService.delete(id);
    }
}
