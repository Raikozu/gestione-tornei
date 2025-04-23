package com.spring_key.gestionetornei.repository;

import com.spring_key.gestionetornei.model.Format;
import com.spring_key.gestionetornei.model.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TournamentRepository extends JpaRepository<Tournament, String> {
    Optional<Tournament> findTournamentById(long id);

}
