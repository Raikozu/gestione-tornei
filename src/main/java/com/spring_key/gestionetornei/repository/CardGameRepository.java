package com.spring_key.gestionetornei.repository;

import com.spring_key.gestionetornei.model.Business;
import com.spring_key.gestionetornei.model.CardGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CardGameRepository extends JpaRepository<CardGame, String> {
    Optional<CardGame> findCardGameById(long id);


}
