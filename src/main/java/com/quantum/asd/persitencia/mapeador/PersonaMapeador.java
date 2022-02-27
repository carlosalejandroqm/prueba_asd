package com.quantum.asd.persitencia.mapeador;

import com.quantum.asd.dominio.modelo.PersonaDTO;
import com.quantum.asd.persitencia.entidad.Persona;
import org.springframework.stereotype.Component;

@Component
public class PersonaMapeador implements Mapeador<Persona, PersonaDTO> {
    @Override
    public Persona convertirEntidad(PersonaDTO dto) {
        return new Persona(
                dto.getId(),
                dto.getDocumento(),
                dto.getNombre()
        );

    }

    @Override
    public PersonaDTO convertirDTO(Persona entidad) {
        return new PersonaDTO(
                entidad.getId(),
                entidad.getDocumento(),
                entidad.getNombre()
        );
    }
}
