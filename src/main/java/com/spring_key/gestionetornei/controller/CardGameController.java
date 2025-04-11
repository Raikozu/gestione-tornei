package com.spring_key.gestionetornei.controller;

import com.spring_key.gestionetornei.model.Business;
import com.spring_key.gestionetornei.model.CardGame;
import com.spring_key.gestionetornei.request.AddCardGameReq;
import com.spring_key.gestionetornei.service.CardGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cardgame")
public class CardGameController {
    @Autowired
    private CardGameService cardGameService;
    //CRUD

    //Creiamo i giochi
    @PostMapping("/add")
    public ResponseEntity<CardGame> add(@RequestBody AddCardGameReq request) {
        return new ResponseEntity<>(cardGameService.add(request),HttpStatus.CREATED);
    }

    //Leggiamo i giochi
    @GetMapping("/get/{id}")
    public ResponseEntity<CardGame> get(@PathVariable long id){
        return new ResponseEntity<>(cardGameService.get(id),HttpStatus.ACCEPTED);
    }
    @GetMapping("/get")
    public List<CardGame> getAll(){
        return cardGameService.getAll();}
}

