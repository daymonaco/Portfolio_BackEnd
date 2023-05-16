package com.portfolioAP.dmnc.service;

import com.portfolioAP.dmnc.model.Persona;
import com.portfolioAP.dmnc.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    private final IPersonaRepository personaRepository;

    @Autowired
    public PersonaService(IPersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @Override
    public List<Persona> getPersona() {
        return personaRepository.findAll();
    }

    @Override
    public void savePersona(Persona pers) {
        personaRepository.save(pers);
    }

    @Override
    public void deletePersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        return personaRepository.findById(id).orElse(null);
    }
}

