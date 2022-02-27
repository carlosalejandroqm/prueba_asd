package com.quantum.asd.dominio.servicio.implementacion;

import com.quantum.asd.dominio.modelo.AreaDTO;
import com.quantum.asd.dominio.modelo.PersonaDTO;
import com.quantum.asd.dominio.repositorio.PersonaRepositorio;
import com.quantum.asd.dominio.servicio.interfaces.PersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class PersonaServicioImpl implements PersonaServicio {

    @Autowired
    PersonaRepositorio  personaRepositorio;

    @Override
    public PersonaDTO obtenerPersonaPorId(Integer id) {
        Optional<PersonaDTO> personaModeloRetorno = personaRepositorio.obtenerPersonaPorId(id);
        return personaModeloRetorno.get();
    }
}
