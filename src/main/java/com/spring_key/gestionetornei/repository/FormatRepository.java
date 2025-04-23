package com.spring_key.gestionetornei.repository;

import com.spring_key.gestionetornei.model.CardGame;
import com.spring_key.gestionetornei.model.Format;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FormatRepository extends JpaRepository<Format, String> {
    Optional<Format> findFormatById(long id);
    Optional<Format> findByName(String name);

}
