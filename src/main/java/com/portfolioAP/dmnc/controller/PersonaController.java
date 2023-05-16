package com.portfolioAP.dmnc.controller;

import com.portfolioAP.dmnc.model.Persona;
import com.portfolioAP.dmnc.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    private final IPersonaService iPersonaService;

    @Autowired
    public PersonaController(IPersonaService personaService) {
        this.iPersonaService = personaService;
    }

    @GetMapping("/ver")
    public List<Persona> getPersona() {
        return iPersonaService.getPersona();
    }

    @PostMapping("/crear")
    public String savePersona(@RequestBody Persona pers) {
        iPersonaService.savePersona(pers);
        return "La persona ha sido creada exitosamente.";
    }

    @DeleteMapping("/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        iPersonaService.deletePersona(id);
        return "La persona ha sido eliminada exitosamente.";
    }

    @GetMapping("/buscar/{id}")
    public Persona findPersona(@PathVariable Long id) {
        return iPersonaService.findPersona(id);
    }
}
