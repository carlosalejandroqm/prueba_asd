package com.quantum.asd.dominio.servicio.implementacion;

import com.quantum.asd.dominio.modelo.AreaDTO;
import com.quantum.asd.dominio.modelo.CiudadDTO;
import com.quantum.asd.dominio.repositorio.AreaRepositorio;
import com.quantum.asd.dominio.servicio.interfaces.AreaServicio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class AreaServicioImpl implements AreaServicio {

    @Autowired
    private AreaRepositorio areaRepositorio;


    @Override
    public AreaDTO obtenerAreaPorId(Integer id) {
        Optional<AreaDTO> areaModeloRetorno = areaRepositorio.obtenerPorId(id);
        return areaModeloRetorno.get();
    }
}
