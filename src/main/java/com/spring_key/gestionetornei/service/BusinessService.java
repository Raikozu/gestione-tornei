package com.spring_key.gestionetornei.service;

import com.spring_key.gestionetornei.model.Business;
import com.spring_key.gestionetornei.repository.BusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class BusinessService {
    @Autowired
    private BusinessRepository businessRepository;

    public Business add(Business add) {
        Business business;
        business=businessRepository.save(add);
        return business;
    }

    public Business get(long id){
        Optional<Business> business;
        business=businessRepository.findBusinessById(id);
        return business.orElse(null);
    }

    public List<Business> getall(){
        List<Business> businesses;
        return businessRepository.findAll();

    }

    public boolean delete(long id) {
        Business business = get(id);
        if(business!=null){
            businessRepository.delete(business);
            return true;
        }
        return false;
    }

    public Business updateName(String name, long id) {
        Business business = get(id);
        if(business!=null){
            business.setName(name);
            businessRepository.save(business); //SE AGGIUNGI O MODIFICHI SEMPRE SALVARE L'OGGETTO
            return business;
        }
        return null;
    }
}
