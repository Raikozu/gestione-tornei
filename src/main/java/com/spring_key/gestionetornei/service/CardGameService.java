package com.spring_key.gestionetornei.service;

import com.spring_key.gestionetornei.model.Business;
import com.spring_key.gestionetornei.model.CardGame;
import com.spring_key.gestionetornei.repository.CardGameRepository;
import com.spring_key.gestionetornei.request.AddCardGameReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CardGameService {
    @Autowired
    private CardGameRepository cardGameRepository;
    @Autowired
    private BusinessService businessService;

    public CardGame add(AddCardGameReq req){
        Long businessId = req.getBusinessId();
        Business business = businessService.get(businessId);
        CardGame cardGame = new CardGame();
        cardGame.setBusiness(business);
        String name = req.getCardName();
        cardGame.setName(name);
        return cardGameRepository.save(cardGame);

    }
    public CardGame get(long id){
        Optional<CardGame> cardGame;
        cardGame=cardGameRepository.findCardGameById(id);
        return cardGame.orElse(null);
    }
    public List<CardGame> getAll(){
        List<CardGame> cardGames;
        return cardGameRepository.findAll();}

}

