package com.portfolioAP.dmnc.service;

import com.portfolioAP.dmnc.model.Persona;
import java.util.List;
import org.springframework.stereotype.Component;


public interface IPersonaService {
    List<Persona> getPersona();
    
    void savePersona(Persona pers);
    
    void deletePersona(Long id);
    
    Persona findPersona(Long id);
}
