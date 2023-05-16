package com.portfolioAP.dmnc.repository;

import com.portfolioAP.dmnc.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface IPersonaRepository extends JpaRepository<Persona, Long>{
    
}
