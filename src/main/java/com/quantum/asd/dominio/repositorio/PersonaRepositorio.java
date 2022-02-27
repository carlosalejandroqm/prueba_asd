package com.quantum.asd.dominio.repositorio;


import com.quantum.asd.dominio.modelo.PersonaDTO;
import com.quantum.asd.persitencia.crud.PersonaCRUD;
import com.quantum.asd.persitencia.entidad.Persona;
import com.quantum.asd.persitencia.mapeador.PersonaMapeador;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class PersonaRepositorio {
    @Autowired
    private PersonaCRUD personaCRUD;

    @Autowired
    private PersonaMapeador personaMapeador;

    public Optional<PersonaDTO> obtenerPersonaPorId(Integer id){
        Optional<Persona> persona = personaCRUD.findById(id);
        return  Optional.ofNullable(personaMapeador.convertirDTO(persona.get()));
    }
}
