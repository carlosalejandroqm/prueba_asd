package com.quantum.asd.persitencia.crud;

import com.quantum.asd.persitencia.entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaCRUD extends JpaRepository<Persona, Integer> {

}
