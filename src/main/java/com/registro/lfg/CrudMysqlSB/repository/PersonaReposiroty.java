package com.registro.lfg.CrudMysqlSB.repository;

import com.registro.lfg.CrudMysqlSB.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaReposiroty extends JpaRepository <Persona, Long> {
}
