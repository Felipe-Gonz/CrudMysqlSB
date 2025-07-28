package com.registro.lfg.CrudMysqlSB.service;

import com.registro.lfg.CrudMysqlSB.repository.PersonaReposiroty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    @Autowired
    private PersonaReposiroty personaReposiroty;
}
