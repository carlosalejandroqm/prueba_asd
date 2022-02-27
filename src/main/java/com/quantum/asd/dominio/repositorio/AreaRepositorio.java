package com.quantum.asd.dominio.repositorio;

import com.quantum.asd.dominio.modelo.AreaDTO;
import com.quantum.asd.persitencia.crud.AreaCRUD;
import com.quantum.asd.persitencia.entidad.Area;
import com.quantum.asd.persitencia.mapeador.AreaMapeador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class AreaRepositorio {

    @Autowired
    private AreaCRUD areaCRUD;

    @Autowired
    private AreaMapeador areaMapeador;

    public Optional<AreaDTO> obtenerPorId(Integer id){
        Optional<Area> area = areaCRUD.findById(id);
        return Optional.ofNullable(areaMapeador.convertirDTO(area.get()));
    }

}
