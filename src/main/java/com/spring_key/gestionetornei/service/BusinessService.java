package com.spring_key.gestionetornei.service;

import com.spring_key.gestionetornei.model.Business;
import com.spring_key.gestionetornei.repository.BusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {
    @Autowired
    private BusinessRepository businessRepository;
    public Business add(Business add) {
        Business business;
        business=businessRepository.save(add);
        return business;
    }
}
