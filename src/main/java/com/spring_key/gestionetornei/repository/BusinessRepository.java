package com.spring_key.gestionetornei.repository;

import com.spring_key.gestionetornei.model.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BusinessRepository extends JpaRepository<Business, Long> {

    public Optional<Business> findBusinessById(long id);
}
