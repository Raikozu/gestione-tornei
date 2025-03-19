package com.spring_key.gestionetornei.controller;

import com.spring_key.gestionetornei.model.Business;
import com.spring_key.gestionetornei.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/business")
public class BusinessController {
    @Autowired
    private BusinessService businessService;
    @PostMapping("/add")
    public Business add(@RequestBody Business business) {
        Business response=businessService.add(business);
        return response;
    }
}
