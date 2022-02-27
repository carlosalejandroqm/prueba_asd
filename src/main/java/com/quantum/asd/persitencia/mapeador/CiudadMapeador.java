package com.quantum.asd.persitencia.mapeador;

import com.quantum.asd.dominio.modelo.CiudadDTO;
import com.quantum.asd.persitencia.entidad.Ciudad;
import org.springframework.stereotype.Component;

@Component
public class CiudadMapeador  implements  Mapeador<Ciudad, CiudadDTO>{

    @Override
    public Ciudad convertirEntidad(CiudadDTO dto) {
        return new Ciudad(
                dto.getId(),
                dto.getNombre()
        );
    }

    @Override

    public CiudadDTO convertirDTO(Ciudad entidad) {
        return new CiudadDTO(
                entidad.getId(),
                entidad.getNombre()
        );
    }
}

