package com.spring_key.gestionetornei.service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spring_key.gestionetornei.model.CardGame;
import com.spring_key.gestionetornei.model.Format;
import com.spring_key.gestionetornei.repository.CardGameRepository;
import com.spring_key.gestionetornei.repository.FormatRepository;
import com.spring_key.gestionetornei.request.AddFormatReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class FormatService {
    @Autowired
    private FormatRepository formatRepository;
    @Autowired
    private CardGameService cardGameService;

    public Format getByName(String name){
        Optional<Format> optFormat = formatRepository.findByName(name);
        if(optFormat.isPresent()){
            return optFormat.get();
        }
        else return null;
    }

    public Format add(AddFormatReq req){
        Long cardgameId = req.getCardgameId();
        CardGame cardGame = cardGameService.get(cardgameId);
        Format format = new Format();
        format.setCardGame(cardGame);
        String name = req.getName();
        format.setName(name);
        return formatRepository.save(format);
    }
    public Format get(long id){
        Optional<Format> format;
        format=formatRepository.findFormatById(id);
        return format.orElse(null);
    }

    public List<Format> getAll(){
        List<Format> formats;
        return formatRepository.findAll();
    }
    public Format updateFormat(String formatName, long id){
        Format format = get(id);
        if (format != null) {
            format.setName(formatName);
            formatRepository.save(format);
        }
        return null;
    }
    public boolean delete(long id){
        Format format = get(id);
        if(format!=null){
            formatRepository.delete(format);
            return true;
        }
        return false;

    }


}
