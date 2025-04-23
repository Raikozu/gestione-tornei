package com.spring_key.gestionetornei.controller;

import com.spring_key.gestionetornei.model.Format;
import com.spring_key.gestionetornei.model.Tournament;
import com.spring_key.gestionetornei.request.AddTournamentReq;
import com.spring_key.gestionetornei.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tournament")
public class TournamentController {

    @Autowired
    private TournamentService tournamentService;

    @PostMapping("/add")
    public ResponseEntity<Tournament> add(@RequestBody AddTournamentReq request) {
        return new ResponseEntity<>(tournamentService.add(request), HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Tournament> get(@PathVariable long id) {
        return new ResponseEntity<>(tournamentService.get(id), HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<List<Tournament>> getAll() {
        return new ResponseEntity<>(tournamentService.getAll(), HttpStatus.OK);
    }


    @PutMapping("/update/{id}/tournament/{tournamentName}")
    public ResponseEntity<Format> updateTournament(@PathVariable long id, @PathVariable String tournamentName) {
        return new ResponseEntity<>(tournamentService.updateTournament(tournamentName, id), HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable long id){
        return tournamentService.delete(id);
    }
}
