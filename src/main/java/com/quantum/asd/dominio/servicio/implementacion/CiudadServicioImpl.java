package com.quantum.asd.dominio.servicio.implementacion;

import com.quantum.asd.dominio.modelo.CiudadDTO;
import com.quantum.asd.dominio.repositorio.CiudadRepositorio;
import com.quantum.asd.dominio.servicio.interfaces.CiudadServicio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CiudadServicioImpl implements CiudadServicio {

    @Autowired
    private CiudadRepositorio ciudadRepositorio;

    @Override
    public CiudadDTO obtenerCiudadPorId(Integer id) {
        Optional<CiudadDTO> ciudadModeloRetorno = ciudadRepositorio.obtenerCiudadPorId(id);
        return ciudadModeloRetorno.get();
    }
}
