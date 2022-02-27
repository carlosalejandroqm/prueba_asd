package com.quantum.asd.persitencia.mapeador;
import com.quantum.asd.dominio.modelo.AreaDTO;
import com.quantum.asd.persitencia.entidad.Area;
import com.quantum.asd.persitencia.entidad.Ciudad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AreaMapeador  implements  Mapeador<Area, AreaDTO> {

    @Autowired
    private CiudadMapeador ciudadMapeador;

    @Override
    public Area convertirEntidad(AreaDTO dto) {
        return new Area(
            dto.getId(),
            dto.getNombre(),
            ciudadMapeador.convertirEntidad(dto.getCiudad()));
    }

    @Override
    public AreaDTO convertirDTO(Area entidad) {
        return new AreaDTO(
                entidad.getId(),
                entidad.getNombre(),
                ciudadMapeador.convertirDTO(entidad.getCiudad())
        );
    }
}
