package com.quantum.asd.dominio.repositorio;

import com.quantum.asd.dominio.modelo.CiudadDTO;
import com.quantum.asd.persitencia.crud.CiudadCRUD;
import com.quantum.asd.persitencia.entidad.Ciudad;
import com.quantum.asd.persitencia.mapeador.CiudadMapeador;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CiudadRepositorio {

    @Autowired
    private CiudadCRUD ciudadCrud;

    @Autowired
    private CiudadMapeador ciudadMapeador;

    public Optional<CiudadDTO> obtenerCiudadPorId(Integer id){
        Optional<Ciudad> ciudad = ciudadCrud.findById(id);
        return  Optional.ofNullable(ciudadMapeador.convertirDTO(ciudad.get()));
    }

}
