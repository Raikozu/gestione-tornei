package com.spring_key.gestionetornei.controller;

import com.spring_key.gestionetornei.model.CardGame;
import com.spring_key.gestionetornei.model.Format;
import com.spring_key.gestionetornei.request.AddFormatReq;
import com.spring_key.gestionetornei.service.FormatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/format")
public class FormatController {
    @Autowired
    private FormatService formatService;

    @PostMapping("/add")
    public ResponseEntity<Format> add(@RequestBody AddFormatReq request){
        return new ResponseEntity<>(formatService.add(request), HttpStatus.CREATED);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Format> get(@PathVariable long id){
        return new ResponseEntity<>(formatService.get(id), HttpStatus.ACCEPTED);
    }
    @GetMapping("/get")
    public List<Format> getAll(){
        return formatService.getAll();
    }
    @PutMapping("/update/{id}/format/{format}")
    public ResponseEntity<Format> updateFormat(@PathVariable long id, @PathVariable String formatName){
        return new ResponseEntity<>(formatService.updateFormat(formatName, id), HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable long id){
        return formatService.delete(id);
    }
}
