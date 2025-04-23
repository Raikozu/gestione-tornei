package com.spring_key.gestionetornei.service;

import com.spring_key.gestionetornei.model.Format;
import com.spring_key.gestionetornei.model.Tournament;
import com.spring_key.gestionetornei.repository.TournamentRepository;
import com.spring_key.gestionetornei.request.AddTournamentReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TournamentService {
    @Autowired
    private TournamentRepository tournamentRepository;
    @Autowired
    private FormatService formatService;

    public Tournament add(AddTournamentReq req) {
        Format format = formatService.getByName(req.getFormatName());
        Tournament tournament = new Tournament();
        tournament.setName(req.getName());
        tournament.setDate(req.getDate());
        tournament.setPrize(req.getPrize());
        tournament.setCapacity(req.getCapacity());
        tournament.setFormat(format);
        return tournamentRepository.save(tournament);
    }

    public Tournament get(long id){
        Optional<Tournament> tournament;
        tournament=tournamentRepository.findTournamentById(id);
        return tournament.orElse(null);
    }
    public List<Tournament> getAll() {
        return tournamentRepository.findAll();
    }

    public Format updateTournament(String tournamentName, long id){
        Tournament tournament = get(id);
        if(tournament != null){
            tournament.setName(tournamentName);
            tournamentRepository.save(tournament);
        }
        return null;
    }
    public boolean delete(long id) {
        Tournament tournament = get(id);
        if (tournament != null) {
            tournamentRepository.delete(tournament);
            return true;
        }
        return false;
    }
}
