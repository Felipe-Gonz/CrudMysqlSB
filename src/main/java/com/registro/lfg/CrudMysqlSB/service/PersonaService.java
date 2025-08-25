package com.registro.lfg.CrudMysqlSB.service;

import com.registro.lfg.CrudMysqlSB.model.Persona;
import com.registro.lfg.CrudMysqlSB.repository.PersonaReposiroty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PersonaService {

    @Autowired
    private PersonaReposiroty personaReposiroty;

    public List<Persona> listarTodas() {
         return personaReposiroty.findAll();
    }

    public Persona guardar(Persona persona){
        return personaReposiroty.save(persona);
    }

    public Persona obtenerPorId(Long id){
        return  personaReposiroty.findById(id).orElse(null);
    }

    public void eliminar(Long id){
        personaReposiroty.deleteById(id);
    }
}
